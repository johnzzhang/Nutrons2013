
package edu.wpi.first.wpilibj.ultimateascent;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.DigitalIOButton;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.ultimateascent.commands.shooter.ShooterDeltaPowerCmd;
import edu.wpi.first.wpilibj.ultimateascent.commands.shooter.ShooterSetPowerCmd;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    public static final int SHOOTER_SET = 0;
    public static final int SHOOTER_INCREASE = 0;
    public static final int SHOOTER_DECREASE = 0;
    public static final int SHOOTER_STOP = 0;

    // Operator
    // vvvtl7: changed '4' and '10' to values in OI
    private Joystick opPad = new Joystick(RobotMap.OPERATOR_PAD);
    private Button startShooter = new JoystickButton(opPad, SHOOTER_SET);
    private Button stopShooter = new JoystickButton(opPad, SHOOTER_STOP);
    private Button increaseShooter = new JoystickButton(opPad, SHOOTER_INCREASE);
    private Button decreaseShooter = new JoystickButton(opPad, SHOOTER_DECREASE);
    
    // vvvtl7: Added some constants
    // Also added buttons for increase/decrease shooter
    // TODO: Correct the power increment
    private static final double POWER_INC = 0;
    
    public OI() {
        startShooter.whenPressed(new ShooterSetPowerCmd(1));
        stopShooter.whenPressed(new ShooterSetPowerCmd(0));
        increaseShooter.whenPressed(new ShooterDeltaPowerCmd(POWER_INC));
        decreaseShooter.whenPressed(new ShooterDeltaPowerCmd(-POWER_INC));
    }
    
}