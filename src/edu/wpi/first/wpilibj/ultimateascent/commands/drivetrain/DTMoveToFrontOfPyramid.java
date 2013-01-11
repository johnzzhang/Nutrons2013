package edu.wpi.first.wpilibj.ultimateascent.commands.drivetrain;

import edu.wpi.first.wpilibj.lib.Print;
import edu.wpi.first.wpilibj.ultimateascent.commands.CommandBase;

/**
 *
 * @author NUTRONSPROS
 */
public class DTMoveToFrontOfPyramid extends CommandBase {

    protected void initialize() {
    }

    protected void execute() {
        Print.printMessage("Bro we are moving to the front of the pyramid.");
    }

    protected boolean isFinished() {
        return true;
    }

    protected void end() {
    }

    protected void interrupted() {
    }

}
