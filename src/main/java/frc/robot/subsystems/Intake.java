package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.SpeedControllerGroup;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import frc.robot.Constants;

public class Intake extends SubsystemBase {
  /* Intake Class */
  WPI_TalonSRX motorIntakeLeft, motorIntakeRight;
  SpeedControllerGroup motorIntakeGroup;
  
  public Intake() {
    /* Creates a new Intake. */
    motorIntakeLeft = new WPI_TalonSRX(Constants.MOTOR_INTAKE_LEFT);
    motorIntakeRight = new WPI_TalonSRX(Constants.MOTOR_INTAKE_RIGHT);

    // turns right motor in opposite direction of left motor
    // allows for motors to rotate towards the center, intaking objects
    // or rotating outwards from the center, ejecting objects
    motorIntakeRight.setInverted(true);

    motorIntakeGroup = new SpeedControllerGroup(motorIntakeLeft, motorIntakeRight);
  }

  public void forward(){
    motorIntakeGroup.set(Constants.INTAKE_SPEED);
  }

  public void reverse(){
    motorIntakeGroup.set(-Constants.INTAKE_SPEED);
  }

  public void stop(){
    motorIntakeGroup.set(0);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
