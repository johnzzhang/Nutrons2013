package edu.wpi.first.wpilibj.ultimateascent.subsystems;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.lib.Print;
import edu.wpi.first.wpilibj.ultimateascent.RobotMap;

/**
 *
 * @author Jeremy
 */
public class Intake extends Subsystem {
    
    /*
     * vvvtl7: So, I made this subsystem and its one command
     * I'm not sure exactly how to count the amount of firsbees
     *  that enter and leave the robot.
     * The best so far is this:
     *  'public static int frisbees'
     *  'if(intakeSuccess){frisbees += 1}'
     *  'if(shooterSuccess){frisbees -= 1}'
     *  'if(frisbees >= 4){don't intake)'
     */
    
    private Talon intakeMotor = new Talon(RobotMap.INTAKE_MOTOR);

    public void initDefaultCommand() {
        intakeMotor.set(0);
    }
    
    public void setIntakeMotor(double pow) {
        Print.printMessage("We seriously intook a frisbee."); 
        intakeMotor.set(pow);
    }
    
    // vvvtl7: TODO: devise some sort of logic for counting frisbees
    protected int countFrisbees() {
        return 0;
    }
}
