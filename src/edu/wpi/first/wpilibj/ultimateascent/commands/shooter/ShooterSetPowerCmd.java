package edu.wpi.first.wpilibj.ultimateascent.commands.shooter;
import edu.wpi.first.wpilibj.ultimateascent.commands.CommandBase;
/**
 *
 * @author root
 */
public class ShooterSetPowerCmd extends CommandBase {

    // Variables
    private double power = 0;
    
    public ShooterSetPowerCmd(double newPower) {
        requires(shooter);
        this.power = newPower;
    }

    protected void initialize() {
    }

    protected void execute() {
        shooter.setShooterPower(power);
        if(power != 0) {
            shooter.setShooterEnabled(true);
        } else {
            shooter.setShooterEnabled(false);
        }
    }

    protected boolean isFinished() {
        return true;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
