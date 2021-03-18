package frc.robot.commands.auton;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;

import frc.robot.commands.drive.*;
// import frc.robot.commands.shoot.*;
import frc.robot.subsystems.*;

public class AutoTestCommand extends SequentialCommandGroup
{
    public AutoTestCommand(Mecanum md)
    {
        addCommands
        (
            new DriveToDistanceCommand(1, md),
            new TurnToAngleCommand(90, md)
        );
    }
}
