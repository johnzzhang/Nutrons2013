package edu.wpi.first.wpilibj.ultimateascent.subsystems;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.ultimateascent.RobotMap;

/**
 *
 * @author 
 */
public class Flipper extends Subsystem {
    
    private final Solenoid flipperPiston = new Solenoid(RobotMap.FLIPPER_PISTON);
    
    protected void initDefaultCommand() {
    }
    
    public void flipFrisbee(boolean flip) {
        flipperPiston.set(true);
    }
    
}
