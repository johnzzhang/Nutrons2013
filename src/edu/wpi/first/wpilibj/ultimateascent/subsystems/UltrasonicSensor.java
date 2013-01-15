/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.ultimateascent.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Ultrasonic;
import edu.wpi.first.wpilibj.ultimateascent.RobotMap;

/**
 *
 * @author root
 */
public class UltrasonicSensor extends Subsystem {
    
    // vvvtl7: Added the Ultrasonics
    private Ultrasonic ultras = new Ultrasonic(RobotMap.ULTRASONIC_PING, RobotMap.ULTRASONIC_ECHO);
    
    // Variables
    //private static final boolean ENGLISH_UNITS = true;
    private static final boolean METRIC_UNITS = false;

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    // vvvtl7: There should be a better way to implement this
    public void setUnits(boolean u) {
        if(u == METRIC_UNITS) {
            ultras.setDistanceUnits(Ultrasonic.Unit.kMillimeter);
        }else{
            ultras.setDistanceUnits(Ultrasonic.Unit.kInches);
        }
    }
    
    // vvvtl7: TODO: Put these values onto the dashboard
    protected double DistanceIN() {
        return ultras.getRangeInches();
    }
    
    protected double DistanceMM() {
        return ultras.getRangeMM();
    }
}