// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Drivetrain;
import edu.wpi.first.wpilibj.Timer;
import frc.robot.Constants;

public class Auton extends CommandBase {
  /** Creates a new Auton. */
  private final Drivetrain m_drivetrain;
  private double m_time;
  private double startTime;
  boolean myAutonFinished = false;
  private double m_maxTime;

  public Auton(Drivetrain drivetrain, double time) {
    // Use addRequirements() here to declare subsystem dependencies.
    m_drivetrain = drivetrain;
    m_maxTime = time;
    addRequirements(drivetrain);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    startTime = System.currentTimeMillis();
    m_time = 0.0;
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_time = (System.currentTimeMillis()-startTime)/1000;
    if ((m_time>=0.0)&&(m_time<m_maxTime)){
      m_drivetrain.tankDrive(Constants.DRIVE_AUTON_SPEED, Constants.DRIVE_AUTON_SPEED);
    } 
    if ((m_time>=m_maxTime)){
      myAutonFinished = true;
    }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return myAutonFinished;
  }
}
