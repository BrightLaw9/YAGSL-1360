package swervelib.encoders;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DutyCycle;

public class DIOAbsoluteEncoderSwerve extends SwerveAbsoluteEncoder {

    private DigitalInput dio; 
    public DutyCycle encoder; 

    private boolean isInverted = false; 
    private double offset; 
    
    public DIOAbsoluteEncoderSwerve(int port, double offset) { 
        this.dio = new DigitalInput(port); 
        this.encoder = new DutyCycle(this.dio); 
        this.offset = offset;
    }

    @Override
    public void factoryDefault() {
    
    }

    @Override
    public void clearStickyFaults() {
        
    }

    @Override
    public void configure(boolean inverted) {
        this.isInverted = inverted; 
    }

    @Override
    public double getAbsolutePosition() {
        double angle = Math.toRadians(360.0 * encoder.getOutput()) + this.offset;

            angle %= 2.0 * Math.PI;

            if (angle < 0.0) {
                angle += 2.0 * Math.PI;
            }

            return angle;
    }

    @Override
    public Object getAbsoluteEncoder() {
        return this.encoder; 
    }
    
}
