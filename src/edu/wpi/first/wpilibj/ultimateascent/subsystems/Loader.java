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
    
    private Solenoid loaderMotor1 = new Solenoid(RobotMap.SOLENOID_LOADER_1);
    private Solenoid loaderMotor2 = new Solenoid(RobotMap.SOLENOID_LOADER_2);
    private Solenoid loaderBolt = new Solenoid(RobotMap.SOLENOID_LOADER_BOLT);
    
    // Variables
    private boolean loader12Raised;
    private boolean boltExtended;
    
    public void initDefaultCommand() {
        loaderMotor1.set(false);
        loaderMotor2.set(false);
        loaderBolt.set(false);
        loader12Raised = false;
        boltExtended = false;
    }
    
    public void setLoaderPosition(boolean extended) {
        loaderMotor1.set(extended);
        loaderMotor2.set(extended);
        loader12Raised = extended;
    }
    
    public void setBoltPosition(boolean extended) {
        loaderBolt.set(extended);
        boltExtended = extended;
    }
    
    public boolean getLoaderPosition() {
        return loader12Raised;
    }
    
    public boolean getBoltExtended() {
        return boltExtended;
    }
    
}