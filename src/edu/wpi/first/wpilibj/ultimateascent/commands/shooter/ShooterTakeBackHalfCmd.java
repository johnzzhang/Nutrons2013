package edu.wpi.first.wpilibj.ultimateascent.commands.shooter;

import edu.wpi.first.wpilibj.ultimateascent.commands.CommandBase;

/**
 *
 * @author NUTRONSPROS
 */
public class ShooterTakeBackHalfCmd extends CommandBase {

    protected void initialize() {
    }

    protected void execute() {
        tbhShooter.updateShooter();
    }

    protected boolean isFinished() {
        return true;
    }

    protected void end() {
    }

    protected void interrupted() {
    }

}
