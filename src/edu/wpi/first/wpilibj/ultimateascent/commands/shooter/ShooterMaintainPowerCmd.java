package edu.wpi.first.wpilibj.ultimateascent.commands.shooter;

import edu.wpi.first.wpilibj.ultimateascent.commands.CommandBase;

/**
 *
 * @author root
 */
public class ShooterMaintainPowerCmd extends CommandBase {

    public ShooterMaintainPowerCmd() {
        requires(shooter);
    }
    
    protected void initialize() {
    }

    protected void execute() {
        if(shooter.isShooterEnabled()) {
            shooter.setShooterPower(shooter.getShooterPower());
        }
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }

}
