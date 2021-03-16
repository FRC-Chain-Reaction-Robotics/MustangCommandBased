package frc.robot.commands.drive;

import edu.wpi.first.wpilibj.controller.PIDController;
import edu.wpi.first.wpilibj2.command.PIDCommand;
import frc.robot.subsystems.Mecanum;

public class DriveToDistanceCommand extends PIDCommand {
    MecanumDrive md;

    public DriveToDistanceCommand(double targetDistanceMeters, Mecanum md) 
    {  
        super(new PIDContrller(2.5, 0, 0),
            dt::getDistance,
            targetDistanceMeters,
            output -> md.drive(0, output, 0),
            md);
            
        this.md = md;

        getController().setTolerance(0.01);
        // thank you mr thooyavan
    }

    // Called when the command is initially scheduled.
	public void initialize() {
        md.resetSensors();
    }

	// Returns true when the command should end.
	public boolean isFinished() {
		return getController().atSetpoint(); // go to github desktop and clone the repository its called CommandStyle-Test
    }
}
