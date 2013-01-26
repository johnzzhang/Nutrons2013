package edu.wpi.first.wpilibj.ultimateascent.subsystems;

import edu.wpi.first.wpilibj.AnalogChannel;
import edu.wpi.first.wpilibj.command.PIDSubsystem;
import edu.wpi.first.wpilibj.ultimateascent.RobotMap;

/**
 *
 * @author NUTRONSPROS
 */
public class Elevator extends PIDSubsystem {

    private AnalogChannel pot = new AnalogChannel(RobotMap.POTENTIOMETER);

    // PID values
    private static final double kp = 0;
    private static final double ki = 0;
    private static final double kd = 0;
    
    public Elevator() {
        super(kp, ki, kd);
    }
    
    protected void initDefaultCommand() {
    }

    protected double returnPIDInput() {
        return pot.pidGet();
    }

    protected void usePIDOutput(double d) {
    }
    
}
