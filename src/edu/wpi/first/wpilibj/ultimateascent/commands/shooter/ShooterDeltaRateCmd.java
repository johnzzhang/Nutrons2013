package edu.wpi.first.wpilibj.ultimateascent.commands.shooter;

import edu.wpi.first.wpilibj.ultimateascent.commands.CommandBase;

/**
 *
 * @author root
 */
public class ShooterDeltaRateCmd extends CommandBase {

    private double deltaShooterRate;
    
    public ShooterDeltaRateCmd(double newRate) {
        requires(shooter);
        deltaShooterRate = newRate;
    }
    
    protected void initialize() {
        shooter.enable();
        shooter.setShooterEnabled(true);
        shooter.setSetpoint(shooter.getSetpoint() + deltaShooterRate);
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
