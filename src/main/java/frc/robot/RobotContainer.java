// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.Joystick;
import frc.robot.subsystems.Drivetrain;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Constants;
import frc.robot.commands.TankDrive;
import frc.robot.subsystems.Intake;
import frc.robot.commands.IntakeForward;
import frc.robot.commands.IntakeReverse;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  public final Drivetrain drivetrain = new Drivetrain();
  public final Lift lift = new Lift()
  public final Intake intake = new Intake();
  public static Joystick joystickLeft = new Joystick(Constants.JOYSTICK_LEFT);
  public static Joystick joystickRight = new Joystick(Constants.JOYSTICK_RIGHT);
  public static XboxController xbox =  new XboxController(Constants.XBOX_CONTROLLER);
  public static double intakebutton = xbox.getRawAxis(Constants.INTAKE_AXIS);

  public static double joystickLeftAxis = joystickLeft.getRawAxis(Constants.JOYSTICK_LEFTAXIS);
  public static double joystickRightAxis = joystickRight.getRawAxis(Constants.JOYSTICK_RIGHTAXIS);
  public static double joystickRightRotate = joystickLeft.getRawAxis(Constants.JOYSTICK_ROTATEAXIS);

  public static JoystickButton liftUpButton = new JoystickButton(xbox, Constants.LIFTUP_AXIS);
  public static JoystickButton liftDownButton = new JoystickButton(xbox, Constants.LIFTDOWN_AXIS);

  public static double liftButton = xbox.getRawAxis(ButtonConstants.LIFT_AXIS);

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the button bindings
    configureButtonBindings();
  }

  /**
   * Use this method to define your button->command mappings. Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
    drivetrain.setDefaultCommand(new TankDrive(drivetrain, joystickLeftAxis, joystickRightAxis, joystickRightRotate));
    liftUpButton.whenPressed(new LiftUp(lift, liftUpButton));
    liftDownButton.whenPressed(new LiftDown(lift, liftDownButton));
    intake.setDefaultCommand(new IntakeForward(intake, intakebutton));
  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return null;
  }
}
