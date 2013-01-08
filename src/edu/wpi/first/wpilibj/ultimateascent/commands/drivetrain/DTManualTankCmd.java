package edu.wpi.first.wpilibj.ultimateascent.commands.drivetrain;

import edu.wpi.first.wpilibj.ultimateascent.commands.CommandBase;

/**
 *
 * @author John
 */
public class DTManualTankCmd extends CommandBase {

    public DTManualTankCmd() {
        requires(dt);
    }
    
    protected void initialize() {
    }

    protected void execute() {
        dt.driveLR(oi.getDriveLeft(), oi.getDriveRight());
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
    
}
