package edu.wpi.first.wpilibj.ultimateascent.commands.shooter;

import edu.wpi.first.wpilibj.ultimateascent.commands.CommandBase;

/**
 *
 * @author Jeremy
 */
public class ChangeAngleOfShooter extends CommandBase {
    
    public ChangeAngleOfShooter() {
        requires(shooter);
    }

    protected void initialize() {
    }

    protected void execute() {
        angleShooter.changeAngle();
    }

    protected boolean isFinished() {
        return true;
    }

    protected void end() {
    }

    protected void interrupted() {
    }

}
