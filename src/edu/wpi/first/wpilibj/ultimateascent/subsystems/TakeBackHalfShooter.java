package edu.wpi.first.wpilibj.ultimateascent.subsystems;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.ultimateascent.RobotMap;
import edu.wpi.first.wpilibj.ultimateascent.commands.shooter.ShooterMaintainPowerCmd;

/**
 *
 * @author NUTRONSPROS
 */
public class TakeBackHalfShooter extends Subsystem {
    
    // Motors
    private Talon shooterMotor = new Talon(RobotMap.SHOOTER_WHEEL);
    private Encoder shooterEncoder = new Encoder(RobotMap.SHOOTER_ENCODER_1, RobotMap.SHOOTER_ENCODER_2);
    private Solenoid shooterLevel = new Solenoid(RobotMap.SHOOTER_LEVEL);
    
    // Constants.
    private final double TARGET_RATE = 0;
    private final double POWER_INC = 0.1;
    
    // Variables
    private double currentPower = 0;
    private double powerLowerBound = 0;
    private double currentRate = 0;
    
    public TakeBackHalfShooter() {
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
    
    public void updateShooter() {
        currentRate = shooterEncoder.get();
        if(currentRate >= TARGET_RATE) {
            powerLowerBound = (currentPower + powerLowerBound) / 2;
            currentPower = powerLowerBound;
            setShooterPower(currentPower);
        }
        
        currentPower += POWER_INC * (TARGET_RATE - currentRate);
        setShooterPower(currentPower);
    }
    
    public void setLevel(boolean level) {
        shooterLevel.set(level);
    }
    
}
