package edu.wpi.first.wpilibj.lib;

import edu.wpi.first.wpilibj.buttons.Button;

/**
 *
 * @author John
 */
public class ReverseButton extends Button {
    private Button btn;

    public ReverseButton(Button btn) {
        this.btn = btn;
    }

    public boolean get() {
        return !btn.get();
    }
}
