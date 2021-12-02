// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import frc.robot.Constants;

public class Drivetrain extends SubsystemBase {
  /** Creates a new Drivetrain. */
  private WPI_TalonSRX motorLeft1 = new WPI_TalonSRX(Constants.LEFTMOTOR1);
  private WPI_TalonSRX motorLeft2 = new WPI_TalonSRX(Constants.LEFTMOTOR2);
  private WPI_TalonSRX motorRight1 = new WPI_TalonSRX(Constants.RIGHTMOTOR1);
  private WPI_TalonSRX motorRight2 = new WPI_TalonSRX(Constants.RIGHTMOTOR2);
  private SpeedControllerGroup left = new SpeedControllerGroup(motorLeft1, motorLeft2);
  private SpeedControllerGroup right = new SpeedControllerGroup(motorRight1, motorRight2);
  


  public DifferentialDrive m_drive = new DifferentialDrive(left, right);
  public Drivetrain() {

  }

  public void tankDrive(double leftJoystickAxis, double rightJoystickAxis) {
    m_drive.tankDrive(leftJoystickAxis, rightJoystickAxis);
  }
  @Override
  public void periodic() {
  }
}
