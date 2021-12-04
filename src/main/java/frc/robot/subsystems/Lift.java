// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import frc.robot.Constants;

public class Lift extends SubsystemBase {
  /** Creates a new Lift. */
  private WPI_TalonSRX motor = new WPI_TalonSRX(Constants.LIFTMOTOR);

  public Lift() {}

  public void on() {                        // TOO MUCH OVERLOADING!!! TODO: REDUCE!!!
    motor.set(Constants.LIFTSPEED);
  }

  public void on(double s = 1) {
    motor.set(s)
  }

  public void on(boolean b) {
    if (b) {
      motor.set(Constants.LIFTSPEED);
    } else {
      motor.set(-Constants.LIFTSPEED);
    }

  public void off() {
    motor.set(0);
  }
}
