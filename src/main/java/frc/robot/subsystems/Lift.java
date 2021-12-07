// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import frc.robot.Constants;

public class Lift extends SubsystemBase {
  /** Creates a new Lift. */
  WPI_TalonSRX LiftMotor;

  public Lift() {
    LiftMotor = new WPI_TalonSRX(Constants.LIFTMOTOR);
  }

  public void up(){
    LiftMotor.set(Constants.LIFTSPEED);
  }

  public void down(){
    LiftMotor.set(-Constants.LIFTSPEED);
  }

  public void off() {
    LiftMotor.set(0);
  }
}