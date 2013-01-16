package edu.wpi.first.wpilibj.lib;

import edu.wpi.first.wpilibj.buttons.Button;

/**
 *
 * @author root
 */
public class ToggleButton extends Button {
    
    private Button btn;
    private boolean state;
    private ToggleButtonFilter filter = new ToggleButtonFilter();
    
    public ToggleButton(Button newButton) {
        btn = newButton;
    }    
    
    public boolean get() {
        filter.feed(btn.get());
        if(filter.get()) {
            state = !state;
        }
        return state;
    }
}
