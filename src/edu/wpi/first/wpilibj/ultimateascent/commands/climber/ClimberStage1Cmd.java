/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.ultimateascent.commands.climber;

import edu.wpi.first.wpilibj.ultimateascent.commands.CommandBase;

/**
 *
 * @author root
 */
public class ClimberStage1Cmd extends CommandBase {
    
    public ClimberStage1Cmd() {
        requires(climber);
    }

    protected void initialize() {
        climber.runClimber(1);
    }

    protected void execute() {
    }

    protected boolean isFinished() {
        return true;
    }

    protected void end() {
    }

    protected void interrupted() {
        end();
    }
}
