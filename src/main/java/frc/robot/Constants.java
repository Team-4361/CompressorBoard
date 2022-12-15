// Copyright (c) FIRST and other WPILib contributors.

// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.XboxController;

import static edu.wpi.first.wpilibj.PneumaticsModuleType.CTREPCM;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    /**
     * The {@link Compressor} module type, either {@link PneumaticsModuleType#CTREPCM} or the
     * {@link PneumaticsModuleType#REVPH} system. We typically use the CTRE version of the
     * Pneumatics Module System.
     */
    public static final PneumaticsModuleType COMPRESSOR_MODULE_TYPE = CTREPCM;


    /** The Solenoid ID used for driving the piston. */
    public static final int SOLENOID_ID = 1;

    /**
     * The ID of the Compressor, unless you are using several Pneumatic Controllers, it should
     * <b>always be zero</b>.
     */
    public static final int COMPRESSOR_ID = 0;


    /** The ID of the {@link XboxController}. */
    public static final int XBOX_CONTROLLER_ID = 0;

    public static final int /* Xbox Controller Map */
            // BUTTONS
            XBOX_X = 3,
            XBOX_Y = 4,
            XBOX_B = 2,
            XBOX_A = 1,
            XBOX_START = 8,
            XBOX_END = 10;
}
