package edu.wpi.first.wpilibj.ultimateascent;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.lib.ToggleButton;
import edu.wpi.first.wpilibj.ultimateascent.commands.intake.IntakeCmd;
import edu.wpi.first.wpilibj.ultimateascent.commands.loader.LoaderBoltPositionCmd;
import edu.wpi.first.wpilibj.ultimateascent.commands.loader.LoaderToggleLoaderPositionCmd;
import edu.wpi.first.wpilibj.ultimateascent.commands.shooter.ShooterSetPowerCmd;
import edu.wpi.first.wpilibj.ultimateascent.commands.shooter.ShooterToggleLevelCmd;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
   
    // Operator
    private Joystick opPad = new Joystick(RobotMap.OPERATOR_PAD);
    private Button startShooter = new JoystickButton(opPad, 4);
    private Button stopShooter = new JoystickButton(opPad, 10);
    private Button runIntake = new JoystickButton(opPad, 3);
    // private Button toggleLoader = new JoystickButton(opPad, 5);
    private Button toggleLoader = new ToggleButton(new JoystickButton(opPad, 5));
    private Button toggleLevel = new ToggleButton(new JoystickButton(opPad, 0));
    private Button loaderBolt = new JoystickButton(opPad, 6);
    
    public OI() {
        startShooter.whenPressed(new ShooterSetPowerCmd(1));
        stopShooter.whenPressed(new ShooterSetPowerCmd(0));
        runIntake.whileHeld(new IntakeCmd());
        toggleLoader.whenPressed(new LoaderToggleLoaderPositionCmd());
        loaderBolt.whenPressed(new LoaderBoltPositionCmd());
    }
    
    public boolean getShooterLevel() {
        return toggleLevel.get();
    }
    
}