package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.*;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

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
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
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


   

}

/**
 * package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.TalonFXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import frc.Constants;

public class Shooter
{        
    TalonFX shootMotorLeft =  new TalonFX(Constants.SHOOTER_MOTOR_LEFT_ID);
    TalonFX shootMotorRight = new TalonFX(Constants.SHOOTER_MOTOR_RIGHT_ID);

    TalonSRX loadMotor = new TalonSRX(Constants.LOAD_MOTOR_ID);
    
    public Shooter()
    {
        loadMotor.setInverted(true);

        shootMotorRight.follow(shootMotorLeft);
        shootMotorRight.setInverted(true);

        
        shootMotorLeft.config_kP(0, 0.01 * 0.25);   //  use 0.25 on talons
    }

    public void shoot()
    {
        shootMotorLeft.set(TalonFXControlMode.Velocity, 1000);  //  incorrect units. do we need a wrapper class??
        
        if (shootMotorLeft.getClosedLoopError(0) < 50) 
            loadMotor.set(ControlMode.PercentOutput, 1);
    }

    public void stop()
    {
        shootMotorLeft.set(TalonFXControlMode.Velocity, 0);
        loadMotor.set(ControlMode.PercentOutput, 0);
    }
}
 */