package edu.wpi.first.wpilibj.ultimateascent.commands.shooter;
import edu.wpi.first.wpilibj.ultimateascent.commands.CommandBase;
/**
 *
 * @author root
 */
public class ShooterSetPowerCmd extends CommandBase {

    // Variables
    private double shooterPower = 0;
    
    public ShooterSetPowerCmd(double newPower) {
        requires(shooter);
        this.shooterPower = newPower;
    }

    protected void initialize() {
        shooter.disable();
        shooter.setShooterEnabled(false);
    }

    protected void execute() {
        shooter.setShooterPower(shooterPower);
    }

    protected boolean isFinished() {
        return true;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
