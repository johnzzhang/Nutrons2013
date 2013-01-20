/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.ultimateascent.subsystems;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.ultimateascent.RobotMap;

/**
 *
 * @author NUTRONSPROS
 */
public class Climber extends Subsystem {
    
    //Parts of robot
    //vvvtl7: TODO: Replace these with ACTUAL climbing mechanisms
    private Talon climber_1 = new Talon(RobotMap.STAGE_1);
    private Talon climber_2 = new Talon(RobotMap.STAGE_2);
    private Talon climber_3 = new Talon(RobotMap.STAGE_3);
    
    public void initDefaultCommand() {
    
    }
    
    public void runClimber(int stage) {
        switch(stage) {
            case 1: climber_1.set(1);
                break;
            case 2: climber_1.set(0);
                climber_2.set(1);
                break;
            case 3: climber_1.set(-1);
                climber_2.set(0);
                climber_3.set(1);
                break;
            default:
                break;
        }
    }
}
