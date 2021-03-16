// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Mecanum extends SubsystemBase {
    private static CANSparkMax lf = new CANSparkMax(Constants.LF_MOTOR_ID, kBrushless);
    private static CANSparkMax lb = new CANSparkMax(Constants.LB_MOTOR_ID, kBrushless);
    private static CANSparkMax rf = new CANSparkMax(Constants.RF_MOTOR_ID, kBrushless);
    private static CANSparkMax rb = new CANSparkMax(Constants.RB_MOTOR_ID, kBrushless);

    

    MecanumDrive md = new MecanumDrive(lf, lb, rf, rb);

  public void MecanumDrive() {
      md.setMaxOutput(0.31415926535897932384626433832795028841);
  }
  public void drive(double xSpeed, double ySpeed, double zRotation)
  {
      md.driveCartesian(xSpeed, ySpeed, zRotation);
  }
}
