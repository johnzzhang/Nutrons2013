package edu.wpi.first.wpilibj.ultimateascent;

import edu.wpi.first.wpilibj.ultimateascent.commands.CommandBase;
import edu.wpi.first.wpilibj.Dashboard;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * Sends data back to LabVIEW dashboard on computer. For camera targeting data,
 * sensor feedback, etc.
 *
 * @author Ziv
 */
public class Dashboards {

    private DriverStation ds = DriverStation.getInstance();
    private Dashboard lowDash = ds.getDashboardPackerLow();
    private static Dashboards instance = null;

    private Dashboards() {
    }

    public static Dashboards getInstance() {
        if(instance == null) {
            instance = new Dashboards();
        }
        return instance;
    }

    // vvvtl7: TODO: Take out non-existent & un-needed data
    // TODO: Add non-existent & necessary data to correct classes
    public void sendContinuousData() {
            // Shooter.
            lowDash.addDouble(CommandBase.shooter.getSetpoint());
            lowDash.addDouble(CommandBase.shooter.getShooterRate());
            lowDash.addDouble(CommandBase.shooter.getShooterPower());
        lowDash.finalizeCluster();
        lowDash.commit();
    }

    public void sendPeriodicData() {
        // SmartDashboard output stuff.
        // vvvtl7: Are we using a gyro for dt?
        // vvvtl7: TODO: Fix drive train Dashboard displays and uncomment
//        SmartDashboard.putDouble("Yaw position", CommandBase.dt.yawGyro.getAngle());
        SmartDashboard.putDouble("Shooter rate", CommandBase.shooter.getShooterRate());
//        SmartDashboard.putDouble("DT left", CommandBase.dt.getLeftPos());
//        SmartDashboard.putDouble("DT right", CommandBase.dt.getRightPos());
        SmartDashboard.putDouble("Shooter power", CommandBase.shooter.getShooterPower());
//        SmartDashboard.putDouble("Throttle", CommandBase.oi.getDriveThrottle());
//        SmartDashboard.putDouble("Wheel", CommandBase.oi.getDriveWheel());
    }
}