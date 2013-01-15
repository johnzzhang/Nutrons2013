/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.ultimateascent.subsystems;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.ultimateascent.RobotMap;

/**
 *
 * @author root
 */
public class Loader extends Subsystem {
    
    private Solenoid loader = new Solenoid(RobotMap.LOAD_MECHANISM);

    public void initDefaultCommand() {
        loader.set(false);
    }
    
    public void loadFrisbee() {
        loader.set(true);
    }
}