// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import static com.revrobotics.CANSparkMaxLowLevel.MotorType.*;

import edu.wpi.first.wpilibj2.command.*;
import edu.wpi.first.wpilibj.drive.MecanumDrive;
import frc.robot.Constants;

public class Mecanum extends SubsystemBase
{
	private static CANSparkMax lf = new CANSparkMax(Constants.LF_MOTOR_ID, kBrushless);
	private static CANSparkMax lb = new CANSparkMax(Constants.LB_MOTOR_ID, kBrushless);
	private static CANSparkMax rf = new CANSparkMax(Constants.RF_MOTOR_ID, kBrushless);
	private static CANSparkMax rb = new CANSparkMax(Constants.RB_MOTOR_ID, kBrushless);
	
	MecanumDrive md = new MecanumDrive(lf, lb, rf, rb);

	public void MecanumDrive()
	{
		md.setMaxOutput(0.31415926535897932384626433832795028841);
	}
	
	/**
	 * drives
	 * @param xSpeed left right power
	 * @param ySpeed forward backward poewr
	 * @param zRotation spinny power
	 */
	public void drive(double xSpeed, double ySpeed, double zRotation)
	{
		md.driveCartesian(ySpeed, xSpeed, zRotation);
	}

	public void resetSensors()
	{

	}

	public double getDistance()
	{
		return -1;
	}

	public double getAngle()
	{
		return -1;
	}
}
