package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;

public class ExtendPistonCMD extends CommandBase {
    @Override
    public void initialize() {
        addRequirements(Robot.compressor);
    }

    @Override
    public void execute() {
        Robot.compressor.extendPiston();
    }

    @Override
    public void end(boolean interrupted) {
        Robot.compressor.retractPiston();
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
