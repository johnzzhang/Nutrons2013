package edu.wpi.first.wpilibj.ultimateascent.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.lib.Print;

/**
 *
 * @author Jeremy
 */
public class Intake extends Subsystem {
    
    public void intake() {
        Print.print("We seriously intook a frisbee."); 
    }
    
    protected void initDefaultCommand() {
        
    }

}
