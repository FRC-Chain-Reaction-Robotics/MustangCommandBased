// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANEncoder;
import static com.revrobotics.CANSparkMaxLowLevel.MotorType.*;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.SPI.Port;
import edu.wpi.first.wpilibj2.command.*;
import edu.wpi.first.wpilibj.drive.MecanumDrive;
import edu.wpi.first.wpilibj.interfaces.Gyro;
import frc.robot.Constants;

public class Mecanum extends SubsystemBase
{
	private static CANSparkMax lf = new CANSparkMax(Constants.LF_MOTOR_ID, kBrushless);
	private static CANSparkMax lb = new CANSparkMax(Constants.LB_MOTOR_ID, kBrushless);
	private static CANSparkMax rf = new CANSparkMax(Constants.RF_MOTOR_ID, kBrushless);
	private static CANSparkMax rb = new CANSparkMax(Constants.RB_MOTOR_ID, kBrushless);
	
	MecanumDrive md = new MecanumDrive(lf, lb, rf, rb);

	CANEncoder m_leftFrontEncoder = lf.getEncoder();
    CANEncoder m_leftBackEncoder = lb.getEncoder();
    CANEncoder m_rightFrontEncoder = rf.getEncoder();
    CANEncoder m_rightBackEncoder = rb.getEncoder();

	Gyro gyro = new ADXRS450_Gyro(Port.kOnboardCS0);

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
		gyro.reset();

		m_leftFrontEncoder.setPosition(0);
		m_leftBackEncoder.setPosition(0);
		m_rightFrontEncoder.setPosition(0);
		m_rightBackEncoder.setPosition(0);
	}

	public double getDistance()
	{
		return (m_leftFrontEncoder.getPosition() - m_rightFrontEncoder.getPosition() + 
				m_leftBackEncoder.getPosition() - m_rightBackEncoder.getPosition()) / 4.0;
	}

	public double getAngle()
	{
		return gyro.getAngle();
	}
}
