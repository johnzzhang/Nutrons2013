package edu.wpi.first.wpilibj.ultimateascent.commands.auto;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.ultimateascent.commands.drivetrain.DTMoveToFrontOfPyramid;
import edu.wpi.first.wpilibj.ultimateascent.commands.drivetrain.DTMoveToSetDistance;
import edu.wpi.first.wpilibj.ultimateascent.commands.loader.LoaderBoltPositionCmd;

/**
 *
 * @author NUTRONSPROS
 */
public class AutoModeFIRSTry extends CommandGroup {
    
    public AutoModeFIRSTry() {
        addSequential(new DTMoveToFrontOfPyramid());
        addSequential(new DTMoveToSetDistance(0));
        addSequential(new LoaderBoltPositionCmd());
    }
    
}