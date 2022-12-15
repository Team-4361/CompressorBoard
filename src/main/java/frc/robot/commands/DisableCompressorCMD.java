package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;

public class DisableCompressorCMD extends CommandBase {
    @Override
    public void initialize() {
        addRequirements(Robot.compressor);
        Robot.compressor.stopCompressor();
    }

    @Override
    public boolean isFinished() {
        return true;
    }
}
