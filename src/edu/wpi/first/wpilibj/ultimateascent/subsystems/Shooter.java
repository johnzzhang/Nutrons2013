/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.ultimateascent.subsystems;

// vvvtl7: removed unused Victor and command.Subsystem imports
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.PIDSubsystem;
import edu.wpi.first.wpilibj.ultimateascent.RobotMap;
import edu.wpi.first.wpilibj.ultimateascent.commands.CommandBase;
import edu.wpi.first.wpilibj.ultimateascent.commands.shooter.ShooterMaintainPowerCmd;

/**
 *
 * @author root
 */
public class Shooter extends PIDSubsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    // Motors
    private Talon shooterMotor = new Talon(RobotMap.SHOOTER_WHEEL);
    private Encoder shooterEncoder = new Encoder(RobotMap.SHOOTER_ENCODER_1, RobotMap.SHOOTER_ENCODER_2);
    
    
    // Constants
    // TODO: Tune these constants once physical part is completed
    private static final int kp = 0;
    private static final int ki = 0;
    private static final int kd = 0;
    
    // Variables
    // vvvtl7: Removed 'camel' boolean
    private boolean enabled = false;
    
    public Shooter() {
        super(kp, ki, kd);
    }
    
    public void initDefaultCommand() {
        disable();
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
    
    public void setShooterEnabled(boolean newEnabled) {
        enabled = newEnabled;
    }
    
    public boolean isShooterEnabled() {
        return enabled;
    }
    
    protected double returnPIDInput() {
        return this.getShooterRate();
    }

    protected void usePIDOutput(double d) {
        setShooterPower(getShooterPower() + d);
    }
}
