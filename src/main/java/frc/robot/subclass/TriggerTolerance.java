package frc.robot.subclass;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

public class TriggerActive extends JoystickButton {
    private final GenericHID m_joystick;
    private final int m_axisNumber;
    private final double m_tolerance;
  
    public TriggerActive(GenericHID joystick, int buttonNumber, double tolerance) {
  
      m_joystick = joystick;
      m_axisNumber = buttonNumber;
      m_tolerance = tolerance;
    }
  
    public boolean get() {
      return m_joystick.getRawAxis(m_axisNumber) > m_tolerance;
    }
  }
