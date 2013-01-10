package edu.wpi.first.wpilibj.ultimateascent.commands.shooter;

import edu.wpi.first.wpilibj.ultimateascent.commands.CommandBase;

/**
 *
 * @author root
 */
public class ShooterSetRateCmd extends CommandBase {

    private double shooterRate;
    
    public ShooterSetRateCmd(double newRate) {
        shooterRate = newRate;
    }
    
    protected void initialize() {
    }

    protected void execute() {
        shooter.enable();
        shooter.setShooterEnabled(true);
        shooter.setSetpoint(shooterRate);
    }

    protected boolean isFinished() {
        return true;
    }

    protected void end() {
    }

    protected void interrupted() {
    }

}
