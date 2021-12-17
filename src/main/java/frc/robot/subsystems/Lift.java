package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import frc.robot.Constants;
import edu.wpi.first.wpilibj.XboxController;


public class Lift extends SubsystemBase {
  /* Lift Class */
  WPI_TalonSRX LiftMotor;
  public XboxController xboxTrigger = new XboxController(0);


  public Lift() {
    /* Creates a new Lift. */
    LiftMotor = new WPI_TalonSRX(Constants.LIFT_MOTOR);
  }

  public void up(){
    LiftMotor.set(Constants.LIFT_SPEED);
  }

  public void down(){
    LiftMotor.set(-Constants.LIFT_SPEED);
  }

  public void off() {
    LiftMotor.set(0);
  }
  @Override
  public void periodic() {
    if(xboxTrigger.getRawAxis(2) > 0.5)
    {
      LiftMotor.set(Constants.LIFT_SPEED);
    }
    else if(xboxTrigger.getRawAxis(3) > 0.5)
    {
      LiftMotor.set(-Constants.LIFT_SPEED);
    }
    else
    {
      LiftMotor.set(0);
    }
    
  }
}
