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
public class LoaderCycleCmd extends CommandBase {
    
    public LoaderCycleCmd() {
        requires(loader);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        loader.loadFrisbee();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
