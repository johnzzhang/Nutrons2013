package edu.wpi.first.wpilibj.ultimateascent.commands.shifter;

import edu.wpi.first.wpilibj.ultimateascent.commands.CommandBase;

/**
 *
 * @author John
 */
public class ShifterStaticCmd extends CommandBase {

    boolean highGear = false;
    
    public ShifterStaticCmd(boolean highGear) {
        requires(shifter);
        this.highGear = highGear;
    }
    
    protected void initialize() {
    }

    protected void execute() {
        shifter.shift(highGear);
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }

}
