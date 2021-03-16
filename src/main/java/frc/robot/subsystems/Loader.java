import edu.wpi.first.wpilibj2.command.SubsystemBase;
import robot.subsystem.Constants;


public class Loader extends SubsystemBase {   //  you have to extend subsystembase in all subsystems btw
    private TalonSRX LoaderMotor = new TalonSRX(LOADER_MOTOR_ID);
    public On()
    {
        LoadeNMotor.set(TalonSRXControlMode,1);
    }
    public off(){
        LoaderMotor.set(TalonSRXControlMode,0);
    }
}