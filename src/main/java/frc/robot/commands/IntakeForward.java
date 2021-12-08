// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Intake;
import frc.robot.Constants;

public class IntakeForward extends CommandBase {
  /* Creates a new IntakeForward. */
  private final Intake m_intake;
  private final double m_axis;

  public IntakeForward(Intake intake, double axis) {
    // Use addRequirements() here to declare subsystem dependencies.
    m_intake = intake;
    m_axis = axis;
    addRequirements(intake);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
  /* if (m_axis >= Constants.XBOX_TOLERANCE){
      m_intake.forward();
    } else {
      m_intake.stop();
    }
  } */
  m_intake.forward();
  }
  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_intake.stop();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return true;
  }
}
