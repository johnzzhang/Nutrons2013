/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.ultimateascent.subsystems;

// vvvtl7: removed unused Victor and command.Subsystem imports
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.PIDSubsystem;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.ultimateascent.RobotMap;
import edu.wpi.first.wpilibj.ultimateascent.commands.CommandBase;
import edu.wpi.first.wpilibj.ultimateascent.commands.shooter.ShooterMaintainPowerCmd;

/**
 *
 * @author NUTRONSPROS
 */
public class BangBangShooter extends Subsystem {

    // Motors
    private Talon shooterMotor = new Talon(RobotMap.SHOOTER_WHEEL);
    private Encoder shooterEncoder = new Encoder(RobotMap.SHOOTER_ENCODER_1, RobotMap.SHOOTER_ENCODER_2);
    
    // Variables
    private boolean enabled = false;
    private double count1 = 0;
    private double count2 = 0;
    
    public BangBangShooter() {
    }
    
    public void initDefaultCommand() {
        setDefaultCommand(new ShooterMaintainPowerCmd());
    }
    
    public void setShooterPower(double newPower) {
        shooterMotor.set(newPower);
    }
    
    public double getShooterPower() {
        return shooterMotor.get();
    }

    public double getShooterRate() {
        return shooterEncoder.getRate();
    }
    public void updateCount() {
        count1 = count2;
        count2 = shooterEncoder.get();
    }
    
    public double getRawRate() {
        return (count2 - count1) / 0.01 / 60;
    }
    
    public void setShooterEnabled(boolean newEnabled) {
        enabled = newEnabled;
    }
    
    public boolean isShooterEnabled() {
        return enabled;
    }
}