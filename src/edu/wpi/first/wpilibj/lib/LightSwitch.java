package edu.wpi.first.wpilibj.lib;

import edu.wpi.first.wpilibj.buttons.Button;

/**
 *
 * @author NUTRONSPROS
 * Must use whileHeld() method.
 */
public class LightSwitch extends Button {
    private Button btn;

    public LightSwitch(Button btn) {
        this.btn = btn;
    }
    
    public boolean get() {
        return btn.get();
    }
}
