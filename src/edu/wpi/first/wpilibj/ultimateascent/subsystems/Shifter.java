package edu.wpi.first.wpilibj.ultimateascent.subsystems;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.ultimateascent.RobotMap;
import edu.wpi.first.wpilibj.ultimateascent.commands.CommandBase;

/**
 *
 * @author John
 */
public class Shifter extends Subsystem {

    private final Solenoid shifter = new Solenoid(RobotMap.SHIFTER);
    public static final boolean DEFAULT = false; // Default is high gear.
    
    protected void initDefaultCommand() {
    }

    // Set gear to high or low.
    public void shift(boolean highGear) {
        CommandBase.dt.setTSens(highGear);
        shifter.set(highGear);
    }
    
}
