package edu.wpi.first.wpilibj.ultimateascent.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.ultimateascent.OI;
import edu.wpi.first.wpilibj.ultimateascent.subsystems.AngleShooter;
import edu.wpi.first.wpilibj.ultimateascent.subsystems.DriveTrain;
import edu.wpi.first.wpilibj.ultimateascent.subsystems.Intake;
import edu.wpi.first.wpilibj.ultimateascent.subsystems.Shifter;
import edu.wpi.first.wpilibj.ultimateascent.subsystems.Shooter;
import edu.wpi.first.wpilibj.ultimateascent.subsystems.Intake;
import edu.wpi.first.wpilibj.ultimateascent.subsystems.Loader;
import edu.wpi.first.wpilibj.ultimateascent.subsystems.Shooter;
import java.util.Random;
/**
 * The base for all commands. All atomic commands should subclass CommandBase.
 * CommandBase stores creates and stores each control system. To access a
 * subsystem elsewhere in your code in your code use CommandBase.exampleSubsystem
<<<<<<< HEAD
 * @author John
=======
 * @author Author
>>>>>>> ShooterWheel
 */
public abstract class CommandBase extends Command {

    public static OI oi;
    // Create a single static instance of all of your subsystems
    public static DriveTrain dt = new DriveTrain();
    public static Shifter shifter = new Shifter();
    public static AngleShooter angleShooter = new AngleShooter();
    public static Shooter shooter = new Shooter();
    public static Intake intake = new Intake();
    public static Loader loader = new Loader();

    public static void init() {
        // This MUST be here. If the OI creates Commands (which it very likely
        // will), constructing it during the construction of CommandBase (from
        // which commands extend), subsystems are not guaranteed to be
        // yet. Thus, their requires() statements may grab null pointers. Bad
        // news. Don't move it.
        oi = new OI();

        // Show what command your subsystem is running on the SmartDashboard
        SmartDashboard.putData(dt);
    }

    public CommandBase(String name) {
        super(name);
    }

    public CommandBase() {
        super();
    }
}

