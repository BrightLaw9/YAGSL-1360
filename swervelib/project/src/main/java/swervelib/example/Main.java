package swervelib.example; 

import swervelib.SwerveDrive; 

public class Main {
    
    public static void main(String[] args) { 
        SwerveDrive swerveDrive = 
            new SwerveDrive(SwerveConfig.DRIVE_CONFIGURATION, SwerveConfig.CONTROLLER_CONFIGURATION);
    }
}
