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
  DifferentialDrive drive;

  public Drivetrain() {
    /* Creates a new Drivetrain. */
    leftFront = new WPI_TalonSRX(Constants.LEFT_MOTOR1);
    leftBack = new WPI_TalonSRX(Constants.LEFT_MOTOR2);
    rightFront = new WPI_TalonSRX(Constants.RIGHT_MOTOR1);
    rightBack = new WPI_TalonSRX(Constants.RIGHT_MOTOR2);
    rightFront.setInverted(true);

    rightBack.setInverted(true);
    leftGroup = new SpeedControllerGroup(leftFront, leftBack);
    rightGroup = new SpeedControllerGroup(rightFront, rightBack);

    drive = new DifferentialDrive(rightGroup, leftGroup);
  }

  public void tankDrive(double leftJoystickAxis, double rightJoystickAxis) {
    double ScalingFactor = Constants.SCALING_FACTOR;
    drive.tankDrive(leftJoystickAxis * ScalingFactor, rightJoystickAxis * ScalingFactor);
  }

  @Override
  public void periodic() {
  }
}
