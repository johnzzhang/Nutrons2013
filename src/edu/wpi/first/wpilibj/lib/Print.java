package edu.wpi.first.wpilibj.lib;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 * @author John
 */
public class Print {
    
    public static void print(String message) {
        System.out.println(message);
        SmartDashboard.putString("CURRENT ACTION: ", message);
    }
    
}
