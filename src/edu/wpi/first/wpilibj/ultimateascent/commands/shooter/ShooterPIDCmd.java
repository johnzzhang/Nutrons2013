/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.ultimateascent.commands.shooter;

import edu.wpi.first.wpilibj.ultimateascent.commands.CommandBase;

/**
 *
 * @author NUTRONSPROS
 */
public class ShooterPIDCmd extends CommandBase {
    
    public ShooterPIDCmd() {
        requires(shooter);
    }

    protected void initialize() {
    }

    protected void execute() {
        shooter.usePIDOutput(shooter.returnPIDInput());
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
        end();
    }
}
