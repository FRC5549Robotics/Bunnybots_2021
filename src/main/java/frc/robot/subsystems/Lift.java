package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import frc.robot.Constants;

public class Lift extends SubsystemBase {
  /* Lift Class */
  WPI_TalonSRX LiftMotor;

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
}
