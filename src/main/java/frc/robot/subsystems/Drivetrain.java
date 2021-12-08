package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import frc.robot.Constants;


public class Drivetrain extends SubsystemBase {
  /* Drivetrain Class */
  WPI_TalonSRX leftFront, rightFront, leftBack, rightBack;
  SpeedControllerGroup leftGroup, rightGroup;

  public Drivetrain() {
    /* Creates a new Drivetrain. */
    leftMotor1 = new WPI_TalonSRX(Constants.LEFT_MOTOR1);
    leftMotor2 = new WPI_TalonSRX(Constants.LEFT_MOTOR2);
    rightMotor1 = new WPI_TalonSRX(Constants.RIGHT_MOTOR1);
    rightMotor2 = new WPI_TalonSRX(Constants.RIGHT_MOTOR2);
    leftGroup = new SpeedControllerGroup(leftMotor1, leftMotor2);
    rightGroup = new SpeedControllerGroup(rightMotor1, rightMotor2);

    drive = new DifferentialDrive(leftGroup, rightGroup);
  }

  public void tankDrive(double leftJoystickAxis, double rightJoystickAxis) {
    drive.tankDrive(leftJoystickAxis, rightJoystickAxis);
  }

  @Override
  public void periodic() {
  }
}
