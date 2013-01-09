package edu.wpi.first.wpilibj.ultimateascent.commands.shooter;

import edu.wpi.first.wpilibj.ultimateascent.commands.CommandBase;

/**
 *
 * @author root
 */
public class ShooterDeltaPowerCmd extends CommandBase{

    // Variables
    private double deltaPower = 0;
    
    public ShooterDeltaPowerCmd(double newDeltaPower) {
        requires(shooter);
        this.deltaPower = newDeltaPower;
    }
    
    protected void initialize() {
    }

    protected void execute() {
    }

    protected boolean isFinished() {
        return true;
    }

    protected void end() {
    }

    protected void interrupted() {
    }

}
