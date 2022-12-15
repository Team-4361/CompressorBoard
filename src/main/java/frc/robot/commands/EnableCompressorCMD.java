package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;

public class EnableCompressorCMD extends CommandBase {
    @Override
    public void initialize() {
        addRequirements(Robot.compressor);
        Robot.compressor.startCompressor();
    }

    @Override
    public boolean isFinished() {
        return true;
    }
}
