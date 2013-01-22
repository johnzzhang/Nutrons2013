package edu.wpi.first.wpilibj.ultimateascent.commands.loader;

import edu.wpi.first.wpilibj.ultimateascent.commands.CommandBase;

/**
 *
 * @author root
 */
public class LoaderBoltPositionCmd extends CommandBase {
    
    public LoaderBoltPositionCmd() {
        requires(loader);
    }

    protected void initialize() {
    }

    protected void execute() {
        loader.setBoltPosition(true);
    }

    protected boolean isFinished() {
        return true;
    }

    protected void end() {
        loader.setBoltPosition(false);
    }

    protected void interrupted() {
        end();
    }

}
