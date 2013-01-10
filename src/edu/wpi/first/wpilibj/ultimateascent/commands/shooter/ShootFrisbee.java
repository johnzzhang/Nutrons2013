package edu.wpi.first.wpilibj.ultimateascent.commands.shooter;

import edu.wpi.first.wpilibj.ultimateascent.commands.CommandBase;

/**
 *
 * @author NUTRONS_1
 */
public class ShootFrisbee extends CommandBase {

    protected void initialize() {
    }

    protected void execute() {
        shooter.shoot();
    }

    protected boolean isFinished() {
        return true;
    }

    protected void end() {
    }

    protected void interrupted() {
    }

}
