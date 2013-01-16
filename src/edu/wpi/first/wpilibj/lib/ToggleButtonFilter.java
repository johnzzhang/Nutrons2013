package edu.wpi.first.wpilibj.lib;

/**
 *
 * @author root
 */
public class ToggleButtonFilter {

    private boolean state = false;
    private boolean oldInput = false;
    
    public void feed(boolean in) {
        if(oldInput == false && in == true) {
            state = true;
        }
        oldInput = in;
    }
    
    public boolean get() {
        return state;
    }    
}
