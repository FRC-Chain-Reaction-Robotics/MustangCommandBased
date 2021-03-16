package frc.robot.commands.drive;

import edu.wpi.first.wpilibj.controller.PIDController;
import edu.wpi.first.wpilibj2.command.PIDCommand;
import frc.robot.subsystems.Mecanum;

public class TurnToAngleCommand extends PIDCommand {
    MecanumDrive md;

    public TurnToAngleCommand(double targetAngleDegrees, Mecanum md) 
    {
        super(new PIDController(0.09, 0.22, 0),
            dt::getAngle,
            targetAngleDegrees,
            output -> md.drive(0, 0, output),
            md);

        this.md = md;
        
        getController().setTolerance(0.2);
    }

    // Called when the command is initially scheduled.
	public void initialize() {
        md.resetSensors();
    }

	// Returns true when the command should end.
	public boolean isFinished() {
		return getController().atSetpoint();
	}
}
