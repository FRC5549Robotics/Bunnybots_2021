// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import frc.robot.Constants;

public class Intake extends SubsystemBase {
  /** Creates a new Intake. */
  WPI_TalonSRX motorIntakeLeft, motorIntakeRight;
   
  
  public Intake() {
    motorIntakeLeft = new WPI_TalonSRX(Constants.MOTOR_INTAKE_LEFT_ID);
    motorIntakeRight = new WPI_TalonSRX(Constants.MOTOR_INTAKE_RIGHT_ID);
    
  }

    public void forward(){
      motorIntakeLeft.set(Constants.INTAKE_SPEED);
      motorIntakeRight.set(-Constants.INTAKE_SPEED);
    }
    public void reverse(){
      motorIntakeLeft.set(-Constants.INTAKE_SPEED);
      motorIntakeRight.set(Constants.INTAKE_SPEED);
    }

    public void stop(){
      motorIntakeLeft.set(0);
      motorIntakeRight.set(0);
    }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
