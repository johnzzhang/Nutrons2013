package edu.wpi.first.wpilibj.ultimateascent.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.lib.Print;

/**
 *
 * @author Jeremy
 */
public class Shooter extends Subsystem {
    
    public void shoot() {
        Print.printMessage("We just shot for real this time.");
    }
    
    protected void initDefaultCommand() {
    }

}
