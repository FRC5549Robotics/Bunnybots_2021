/* package frc.robot.subclass;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj2.command.button.Trigger;

public class TriggerActive extends Trigger {
    private GenericHID m_joystick;
    private int m_axisNumber;
    private double m_tolerance;
  
    public TriggerActive(GenericHID joystick, int buttonNumber, double tolerance) {
      m_joystick = joystick;
      m_axisNumber = buttonNumber;
      m_tolerance = tolerance;
    }
  
    @Override
    public boolean get() {
      return m_joystick.getRawAxis(m_axisNumber) > m_tolerance;
    }
<<<<<<< HEAD
  } */
=======
  } */
>>>>>>> b2e0534c863aed063d87a18c1c417aeb70d4de2d
