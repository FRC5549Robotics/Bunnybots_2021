package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Drivetrain;
import edu.wpi.first.wpilibj.Joystick;

public class TankDrive extends CommandBase {
  /* Creates a new TankDrive */
  private final Drivetrain m_drivetrain;
  private final Joystick m_axis1;
  private final Joystick m_axis2;
  
  private Drivetrain instance;
  public TankDrive(Drivetrain drivetrain, Joystick leftJoystickAxis, Joystick rightJoystickAxis) {
    // Use addRequirements() here to declare subsystem dependencies.
    m_drivetrain = drivetrain;
    m_axis1 = leftJoystickAxis;
    m_axis2 = rightJoystickAxis;
    addRequirements(drivetrain);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_drivetrain.tankDrive(m_axis2.getY(), m_axis1.getY());
  }
    
  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}