package edu.wpi.first.wpilibj.ultimateascent.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.ultimateascent.OI;
import edu.wpi.first.wpilibj.ultimateascent.subsystems.BangBangShooter;
import edu.wpi.first.wpilibj.ultimateascent.subsystems.Intake;
import edu.wpi.first.wpilibj.ultimateascent.subsystems.Loader;
import edu.wpi.first.wpilibj.ultimateascent.subsystems.PIDShooter;
import edu.wpi.first.wpilibj.ultimateascent.subsystems.UltrasonicSensor;
import java.util.Random;

/**
 * The base for all commands. All atomic commands should subclass CommandBase.
 * CommandBase stores creates and stores each control system. To access a
 * subsystem elsewhere in your code in your code use CommandBase.exampleSubsystem
 * @author Author
 */
public abstract class CommandBase extends Command {

    public static OI oi;
    // Create a single static instance of all of your subsystems
    
    public static BangBangShooter bangbang;
    public static PIDShooter shooter;
    public static UltrasonicSensor ultrason;
    public static Intake intake;
    public static Loader loader;

    public static void init() {
        // This MUST be here. If the OI creates Commands (which it very likely
        // will), constructing it during the construction of CommandBase (from
        // which commands extend), subsystems are not guaranteed to be
        // yet. Thus, their requires() statements may grab null pointers. Bad
        // news. Don't move it.
        oi = new OI();
        bangbang = new BangBangShooter();
        shooter = new PIDShooter();
        intake = new Intake();
        ultrason = new UltrasonicSensor();
        loader = new Loader();

        // Show what command your subsystem is running on the SmartDashboard
        SmartDashboard.putData(shooter);
    }

    public CommandBase(String name) {
        super(name);
    }

    public CommandBase() {
        super();
    }
    
    public static boolean isOperatorCamel() {
        return new Random().nextInt(2) == 0;
    }
}