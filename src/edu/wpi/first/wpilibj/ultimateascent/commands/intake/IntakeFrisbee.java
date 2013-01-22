package edu.wpi.first.wpilibj.ultimateascent.commands.intake;

import edu.wpi.first.wpilibj.ultimateascent.commands.CommandBase;

/**
 *
 * @author John
 */
public class IntakeFrisbee extends CommandBase {

    protected void initialize() {
    }

    protected void execute() {
        // We just intook that bitch.
        intake.intake();
    }

    protected boolean isFinished() {
        return true;
    }

    protected void end() {
    }

    protected void interrupted() {
    }

}
