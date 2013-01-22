package edu.wpi.first.wpilibj.ultimateascent.commands.auto;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.ultimateascent.commands.drivetrain.DTMoveToFrontOfPyramid;

/**
 *
 * @author NUTRONSPROS
 */
public class AutoModeFIRSTry extends CommandGroup {
    
    public AutoModeFIRSTry() {
        addSequential(new DTMoveToFrontOfPyramid());
    }
    
}
