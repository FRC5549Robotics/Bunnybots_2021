package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.XboxController;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import frc.robot.Constants;

public class Intake extends SubsystemBase {
  /* Intake Class */
  WPI_TalonSRX motorIntakeLeft, motorIntakeRight;
  SpeedControllerGroup motorIntakeGroup;

  public XboxController xboxTrigger = new XboxController(0);
  
  public Intake() {
    /* Creates a new Intake. */
    motorIntakeLeft = new WPI_TalonSRX(Constants.MOTOR_INTAKE_LEFT);
    motorIntakeRight = new WPI_TalonSRX(Constants.MOTOR_INTAKE_RIGHT);
    motorIntakeLeft.setInverted(true);
    // turns right motor in opposite direction of left motor
    // allows for motors to rotate towards the center, intaking objects
    // or rotating outwards from the center, ejecting objects

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
    if(xboxTrigger.getRawAxis(5) > 0.25) {
      motorIntakeRight.set(Constants.INTAKE_SPEED_OUT);
    } else if (xboxTrigger.getRawAxis(5) < -0.25) {
      motorIntakeRight.set(-Constants.INTAKE_SPEED);
    } else {
      motorIntakeRight.set(0);
    }

    if(xboxTrigger.getRawAxis(1) > 0.25){
      motorIntakeLeft.set(Constants.INTAKE_SPEED_OUT);
    } else if (xboxTrigger.getRawAxis(1) < -0.25) {
      motorIntakeLeft.set(-Constants.INTAKE_SPEED);
    } else {
      motorIntakeLeft.set(0);
    }
  }
<<<<<<< HEAD
}
=======
}
>>>>>>> b2e0534c863aed063d87a18c1c417aeb70d4de2d
