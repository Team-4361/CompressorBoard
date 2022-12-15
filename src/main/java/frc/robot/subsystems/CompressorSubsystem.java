package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

import static frc.robot.Constants.*;

/**
 * This {@link CompressorSubsystem} is designed to contain the information regarding
 * the {@link Compressor} and any {@link Solenoid} that the module is using. Any specific
 * values and IDs can be found in the {@link Constants} file.
 */
public class CompressorSubsystem extends SubsystemBase {

    private final Solenoid pistonSolenoid;
    private final Compressor compressor;

    /**
     * Initializes the default constructor for the {@link CompressorSubsystem}. It will
     * create a new Solenoid and Compressor using the values specified in the Constants
     * file.
     */
    public CompressorSubsystem() {
        this.pistonSolenoid = new Solenoid(COMPRESSOR_MODULE_TYPE, SOLENOID_ID);
        this.compressor = new Compressor(COMPRESSOR_ID, COMPRESSOR_MODULE_TYPE);

        // As of right now, the system we are using only supports a digital on/off switch,
        // with no support for reading the pressure or gauges. Because of this, we are using
        // the enableDigital method.
        compressor.enableDigital();
    }

    /**
     * Starts the {@link Compressor} closed-loop control system. Note this method
     * will not force-on the Compressor, instead only running the system controlling
     * it.
     */
    public void startCompressor() {
        compressor.enableDigital();
    }

    /**
     * Stops the Compressor System from running, even when the pressure drops.
     */
    public void stopCompressor() {
        compressor.disable();
    }

    /**
     * Manually sets the value to the Solenoid of it is enabled or not.
     * @param val Boolean value specifying the state of the Piston.
     */
    public void setPistonSolenoid(boolean val) {
        pistonSolenoid.set(val);
    }

    /** Extends the Piston {@link Solenoid} */
    public void extendPiston() {
        pistonSolenoid.set(true);
    }

    /** Retracts the Piston {@link Solenoid} */
    public void retractPiston() {
        pistonSolenoid.set(false);
    }

    /**
     * In this periodic method, we log the potentially useful information to the
     * {@link SmartDashboard}. It will be readable while the board is running.
     */
    @Override
    public void periodic() {
        SmartDashboard.putBoolean("Compressor Active", compressor.enabled());
        SmartDashboard.putNumber("Compressor AMPS", compressor.getCurrent());
        SmartDashboard.putBoolean("Solenoid Active", pistonSolenoid.get());
    }
}
