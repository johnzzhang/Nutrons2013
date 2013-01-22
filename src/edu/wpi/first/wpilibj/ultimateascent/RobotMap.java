package edu.wpi.first.wpilibj.ultimateascent;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static final int leftMotor = 1;
    // public static final int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static final int rangefinderPort = 1;
    // public static final int rangefinderModule = 1;
    
    // TODO: Change these values to correct channels.
    public static final int PAD_DRIVER = 0;
    public static final int DRIVE_LEFT_MOTOR = 0;
    public static final int DRIVE_RIGHT_MOTOR = 0;
    public static final int SHIFTER = 0;
    
        // Input
    public static final int OPERATOR_PAD = 0;
    
    
    // Output
    public static final int SHOOTER_WHEEL = 0;
    public static final int INTAKE_MOTOR = 0;
    public static final int SOLENOID_LOADER_1 = 0;
    public static final int SOLENOID_LOADER_2 = 0;
    public static final int SOLENOID_LOADER_BOLT = 0;
    public static final int SHOOTER_LEVEL = 0;
    
    // Sensors
    public static final int SHOOTER_ENCODER_1 = 0;
    public static final int SHOOTER_ENCODER_2 = 0;
    
}
