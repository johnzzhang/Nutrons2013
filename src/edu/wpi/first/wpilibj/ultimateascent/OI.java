
package edu.wpi.first.wpilibj.ultimateascent;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.DriverStationEnhancedIO;
import edu.wpi.first.wpilibj.DriverStationEnhancedIO.EnhancedIOException;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.DigitalIOButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // Another type of button you can create is a DigitalIOButton, which is
    // a button or switch hooked up to the cypress module. These are useful if
    // you want to build a customized operator interface.
    // Button button = new DigitalIOButton(1);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
    
    // Constants.
    private final int DRIVE_LEFT_AXIS = 2;
    private final int DRIVE_RIGHT_AXIS = 4;
    private final int DRIVE_THROTTLE_AXIS = 2;
    private final int DRIVE_WHEEL_AXIS = 3;
    
    private DriverStationEnhancedIO io = DriverStation.getInstance().getEnhancedIO();
    
    // Joysticks.
    private final Joystick driverPad = new Joystick(RobotMap.PAD_DRIVER);
    
    private boolean getIODigital(int port) throws EnhancedIOException {
        boolean in = false;
        try {
            in = !io.getDigital(port); //active low
        }
        catch(EnhancedIOException ex) {
        }
        return in;
    }

    
    // Returns  value of the left joystick.
    public double getDriveLeft() {
        return driverPad.getRawAxis(DRIVE_LEFT_AXIS);
    }
    
    // Returns the value of the right joystick.
    public double getDriveRight() {
        return driverPad.getRawAxis(DRIVE_RIGHT_AXIS);
    }
    
    public double getDriveThrottle() {
        return driverPad.getRawAxis(DRIVE_THROTTLE_AXIS);
    }
    
    public double getDriveWheel() {
        return driverPad.getRawAxis(DRIVE_WHEEL_AXIS);
        
    }
    
    public boolean getDriveQuickTurn() throws EnhancedIOException {
        return getIODigital(3);
    }
}

