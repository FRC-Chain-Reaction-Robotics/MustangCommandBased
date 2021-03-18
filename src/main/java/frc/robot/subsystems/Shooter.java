package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.*;
import com.ctre.phoenix.motorcontrol.can.*;
import frc.robot.Constants;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;



public class Shooter extends SubsystemBase
{
	TalonFX shootMotorLeft = new TalonFX(Constants.SHOOT_MOTOR_LEFT_ID );
	TalonFX shootMotorRight = new TalonFX(Constants.SHOOT_MOTOR_RIGHT_ID );
	
	public Shooter()
	{
		shootMotorRight.follow(shootMotorLeft);
		shootMotorRight.setInverted(true);

		shootMotorLeft.config_kP(0, 0.01 * 0.25);   //  use 0.25 on talons
	}

	@Override
	public void periodic()
	{
		SmartDashboard.putNumber("shooter rpm", shootMotorLeft.getSelectedSensorVelocity());
	}

	public void shoot()
	{
		shootMotorLeft.set(TalonFXControlMode.Velocity, 1000);  //  incorrect units. do we need a wrapper class??
	}

	//overloaded, referenced in StartShooterCommand.java
	public void shoot(double RPM)
	{
		shootMotorLeft.set(TalonFXControlMode.Velocity, RPM);  
	}

	public void stop()
	{
		shootMotorLeft.set(TalonFXControlMode.Velocity, 0);
	}

	public boolean atSetpoint()
	{
		return false;
	}
}