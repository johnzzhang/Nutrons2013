package edu.wpi.first.wpilibj.ultimateascent.commands.auto;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.ultimateascent.commands.intake.IntakeFrisbee;
import edu.wpi.first.wpilibj.ultimateascent.commands.shooter.ShootFrisbee;

/**
 *
 * @author NUTRONSPROS
 */
public class AutoModeFIRSTry extends CommandGroup {
    
    public AutoModeFIRSTry() {
        addSequential(new IntakeFrisbee());
        addSequential(new ShootFrisbee());
    }
    
}
