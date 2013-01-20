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
public class BangBangShooterCmd extends CommandBase {
    
    private final double SHOOTER_RATE = 0;
    
    protected double error() {
        return SHOOTER_RATE - bangbang.getShooterRate();
    }
    protected boolean SmallError(double e) {
        return Math.abs(e) < 20;
    }
    
    public BangBangShooterCmd() {
        requires(bangbang);
    }

    protected void initialize() {
        
    }

    protected void execute() {
        if(error() < 0) {
            bangbang.setShooterPower(0);
        }else{
            bangbang.setShooterPower(1);
        }
    }

    protected boolean isFinished() {
        return SmallError(error());
    }

    protected void end() {
    }

    protected void interrupted() {
        end();
    }
}