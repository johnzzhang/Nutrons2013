package edu.wpi.first.wpilibj.ultimateascent.commands.drivetrain;

import edu.wpi.first.wpilibj.DriverStationEnhancedIO.EnhancedIOException;
import edu.wpi.first.wpilibj.ultimateascent.commands.CommandBase;

/**
 *
 * @author NutronsPros
 */
public class DTManualCheesyCmd extends CommandBase {
    
    public DTManualCheesyCmd() {
        requires(dt);
    }
    
    protected void initialize() {
    }

    protected void execute() {
        try {
            dt.driveCheesy(oi.getDriveThrottle(), oi.getDriveWheel(), oi.getDriveQuickTurn());
        } catch (EnhancedIOException ex) {
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
