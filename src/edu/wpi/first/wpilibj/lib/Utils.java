package edu.wpi.first.wpilibj.lib;

/**
 *
 * @author John
 */
public class Utils {
    
    // If a value is within center +- deadband then it returns center. Else it returns the value.
    public static double deadband(double value, double deadband, double center) {
        return (value < (center + deadband) && value > (center - deadband)) ? center : value;
    }
    
    // Limits the number to be within min and max.
    public static double limit(double x, double min, double max) {
        return Math.max(Math.min(x, max), min);
    }
    
}