package edu.wpi.first.wpilibj.ultimateascent.commands.shooter;

import edu.wpi.first.wpilibj.ultimateascent.commands.CommandBase;

/**
 *
 * @author root
 */
public class ShooterDeltaPowerCmd extends CommandBase{

    // Variables
    private double deltaShooterPower = 0;
    
    public ShooterDeltaPowerCmd(double newDeltaPower) {
        requires(shooter);
        this.deltaShooterPower = newDeltaPower;
    }
    
    protected void initialize() {
        shooter.disable();
        shooter.setShooterEnabled(false);
    }
    
    protected void execute() {
        shooter.setShooterPower(shooter.getShooterPower() + deltaShooterPower);
    }

    protected boolean isFinished() {
        return true;
    }

    protected void end() {
    }

    protected void interrupted() {
    }

}
