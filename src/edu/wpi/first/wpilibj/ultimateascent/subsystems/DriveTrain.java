package edu.wpi.first.wpilibj.ultimateascent.subsystems;

import edu.wpi.first.wpilibj.command.PIDSubsystem;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Ultrasonic;
import edu.wpi.first.wpilibj.lib.Print;
import edu.wpi.first.wpilibj.ultimateascent.RobotMap;

/**
 *
 * @author John
 */
public class DriveTrain extends PIDSubsystem {
    
    // Variables
    private double tSens = 1;
    
    // Constants.
    private static final double kp = 0;
    private static final double ki = 0;
    private static final double kd = 0;
    private final double LEFT_SCALE = 1.0;
    private final double RIGHT_SCALE = 1.0;
    private final double HIGH_GEAR_T_SENS = 1.5;
    private final double LOW_GEAR_T_SENS = 1.3;
    private final int ECHO = 0;
    private final int PING = 0;
   
    // Robot parts.
    private final Talon lMotor = new Talon(RobotMap.DRIVE_LEFT_MOTOR);
    private final Talon rMotor = new Talon(RobotMap.DRIVE_RIGHT_MOTOR);
    private final Ultrasonic sensor = new Ultrasonic(PING, ECHO);
    
    public DriveTrain() {
        super(kp, ki, kd);
    }
    
    protected void initDefaultCommand() {
    }
    
    // Set tSens to appropriate gear.
    public void setTSens(boolean highGear) {
        if(highGear) {
            tSens = HIGH_GEAR_T_SENS;
        }
        else {
            tSens = LOW_GEAR_T_SENS;
        }
    }
    
    // Sets lMotor and rMotor to lPower and rPower.
    public void driveLR(double lPower, double rPower) {
        Print.printMessage("We moving for real.");
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
            angularPower = Math.abs(throttle) * wheel * tSens;
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
        else if (rPower < -1.0) {
            lPower += overPower * (-1.0 - rPower);
            rPower = -1.0;
        }
        driveLR(lPower, rPower);
    }
    
    // Stops motor.
    public void stop() {
        driveLR(0, 0);
    }

    protected double returnPIDInput() {
        return getDistanceInch();
    }

    protected void usePIDOutput(double d) {
        driveLR(d, d);
    }
    
    public double getDistanceInch() {
        return sensor.getRangeInches();
    }
    
    public double getDistanceMM() {
        return sensor.getRangeMM();
    }
    
}
