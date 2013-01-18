package edu.wpi.first.wpilibj.ultimateascent.commands.shooter;

import edu.wpi.first.wpilibj.ultimateascent.commands.CommandBase;

/**
 *
 * @author NUTRONSPROS
 */
public class ShooterToggleLevelCmd extends CommandBase {

    public ShooterToggleLevelCmd() {
        requires(shooter);
    }
    
    protected void initialize() {
    }

    protected void execute() {
        shooter.setLevel(oi.getShooterLevel());
    }

    protected boolean isFinished() {
        return true;
    }

    protected void end() {
    }

    protected void interrupted() {
    }

}
