package frc.robot.commands.shoot;

import frc.robot.subsystems.Shooter;
import edu.wpi.first.wpilibj2.command.CommandBase;



public class StopShooterCommand extends CommandBase
{
    Shooter shooter;
    double RPM;
    public StartShooterCommand(Shooter shooter, double RPM)
    {
        this.shooter = shooter;
        this.RPM = RPM;
        addRequirements(shooter);
    }

    // Called every time the scheduler runs while the command is scheduled.
	@Override
    public void execute()
    {
        shooter.stop(); 
    }

	@Override
    public boolean isFinished()
    {
        return shooter.atSetpoint();
	}

}