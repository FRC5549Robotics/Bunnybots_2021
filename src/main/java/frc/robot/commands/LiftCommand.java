// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Drivetrain;

public class LiftGeneral extends CommandBase {
  /** Creates a new TankDrive. */
  private final Lift m_lift;
  private final JoystickButton m_button;
  
  private Drivetrain instance;
  public TankDrive(Lift lift, JoystickButton button) {
    // Use addRequirements() here to declare subsystem dependencies.
    m_lift = lift;
    m_button = button;
    addRequirements(lift);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}
  
  // execute: Called every time the scheduler runs while the command is scheduled.
  // Subclasses should override it (hopefully this works)
  // 
  // public void execute() {
  //   ...
  // }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}

public class LiftUp extends CommandBase {
  @Override
  public void execute() {
    m_lift.on();
    while (m_button.get()) {}
    m_lift.off()
  }
}

public class LiftDown extends CommandBase {
  @Override
  public void execute() {
    m_lift.on(false);
    while (m_button.get()) {}
    m_lift.off()
  }
}
