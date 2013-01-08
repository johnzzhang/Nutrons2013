package edu.wpi.first.wpilibj.ultimateascent.subsystems;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.ultimateascent.RobotMap;

/**
 *
 * @author John
 */
public class DriveTrain extends Subsystem {
    // Variables
    private int tSens = 1;
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
    
    public void driveCheesy(double throttle, double wheel, boolean quickTurn) {
        // Variables.
        double angularPower;
        double overPower;
        double rPower;
        double lPower;
        
        // start turning if quickturn button is pressed.
        
        if(quickTurn) {
            overPower = 1.0;
            angularPower = wheel;
        }
        else {
            overPower = 0.0;
            angularPower = Math.abs(throttle)*wheel*tSens;
        }
        rPower = throttle;
        lPower = throttle;
        lPower += angularPower;
        rPower -= angularPower;
        if(lPower > 1.0) {
           rPower -= overPower * (lPower - 1.0);
           lPower = 1.0;
        }
        else if(rPower > 1.0) {
          lPower -= overPower * (rPower - 1.0);
          rPower = 1.0;
        }
        else if(lPower < -1.0) {
            rPower += overPower * (-1.0 - rPower);
            lPower = -1.0;
        }
        else if (rPower < -1.0){
            lPower += overPower * (-1.0 - rPower);
            rPower = -1.0;
        }
        driveLR(lPower, rPower);
    }
            
           
    
    // Stops motor.
    public void stop() {
        driveLR(0, 0);
    }
    
}