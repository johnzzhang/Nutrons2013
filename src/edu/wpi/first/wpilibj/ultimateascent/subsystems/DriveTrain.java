package edu.wpi.first.wpilibj.ultimateascent.subsystems;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.ultimateascent.RobotMap;

/**
 *
 * @author John
 */
public class DriveTrain extends Subsystem {

    // Constants.
    private final double LEFT_SCALE = 1.0;
    private final double RIGHT_SCALE = 1.0;
    
    // Robot parts.
    private final Victor lMotor = new Victor(RobotMap.DRIVE_LEFT_MOTOR);
    private final Victor rMotor = new Victor(RobotMap.DRIVE_RIGHT_MOTOR);
    
    public DriveTrain() {
    }
    
    protected void initDefaultCommand() {
    }
    
    // Sets lMotor and rMotor to lPower and rPower.
    public void driveLR(double lPower, double rPower) {
        lMotor.set(LEFT_SCALE * lPower);
        rMotor.set(RIGHT_SCALE * rPower);
    }
    
    // Stops motor.
    public void stop() {
        driveLR(0, 0);
    }
    
}
