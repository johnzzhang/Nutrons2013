/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.ultimateascent.commands.loader;

import edu.wpi.first.wpilibj.ultimateascent.commands.CommandBase;

/**
 *
 * @author root
 */
public class LoaderToggleLoaderPositionCmd extends CommandBase {
    
    
    
    public LoaderToggleLoaderPositionCmd() {
        requires(loader);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        loader.setLoaderPosition(!loader.getLoaderPosition());
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        loader.setLoaderPosition(loader.getLoaderPosition());
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
        loader.setLoaderPosition(false);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        end();
    }
}
