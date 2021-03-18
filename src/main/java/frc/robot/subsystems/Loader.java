package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;


public class Loader extends SubsystemBase
{
    private TalonSRX LoaderMotor = new TalonSRX(Constants.LOADER_MOTOR_ID);

    public void on()
    {
        LoaderMotor.set(ControlMode.PercentOutput, 1);
    }

    public void off()
    {
        LoaderMotor.set(ControlMode.PercentOutput, 0);
    }
}