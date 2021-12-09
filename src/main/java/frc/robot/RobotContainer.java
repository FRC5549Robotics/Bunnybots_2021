package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.Constants;
import frc.robot.subsystems.Drivetrain;
import frc.robot.subsystems.Intake;
import frc.robot.subsystems.Lift;
import frc.robot.commands.Auto;
import frc.robot.commands.IntakeForward;
import frc.robot.commands.IntakeReverse;
import frc.robot.commands.LiftDown;
import frc.robot.commands.LiftUp;
import frc.robot.commands.TankDrive;
import frc.robot.subclass.TriggerActive;


/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */

public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  public final Drivetrain drivetrain = new Drivetrain();
  public final Intake intake = new Intake();
  public final Lift lift  = new Lift();

  /* Joysticks */
  public static Joystick joystickLeft = new Joystick(Constants.JOYSTICK_LEFT);
  public static Joystick joystickRight = new Joystick(Constants.JOYSTICK_RIGHT);

  public static double joystickLeftAxis = joystickLeft.getRawAxis(Constants.JOYSTICK_LEFTAXIS);
  public static double joystickRightAxis = joystickRight.getRawAxis(Constants.JOYSTICK_RIGHTAXIS);
  public static double joystickRightRotate = joystickLeft.getRawAxis(Constants.JOYSTICK_ROTATEAXIS);

  /* Xbox Controller */
  public static XboxController xbox =  new XboxController(Constants.XBOX_CONTROLLER);

  public static double intakeButton = xbox.getRawAxis(Constants.INTAKE_AXIS);
  // public static TriggerActive intakeButton = new TriggerActive(xbox, Constants.INTAKE_AXIS, Constants.XBOX_TOLERANCE);
  public static JoystickButton liftUpButton = new JoystickButton(xbox, Constants.LIFTUP_AXIS);
  public static JoystickButton liftDownButton = new JoystickButton(xbox, Constants.LIFTDOWN_AXIS);
  

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
    intake.setDefaultCommand(new IntakeForward(intake, intakeButton));
    // intakeButton.whenActive(new IntakeForward(intake));
    liftUpButton.whenPressed(new LiftUp(lift));
    liftDownButton.whenPressed(new LiftDown(lift));
  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return (new Auto(drivetrain, Constants.AUTONOMOUS_TIME));
  }
}
