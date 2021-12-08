public class TriggerActive extends JoystickButton {
  private final GenericHID m_joystick;
  private final int m_axisNumber;
  private final double m_tolerance;

  public JoystickButton(GenericHID joystick, int buttonNumber, double tolerance) {
    requireNonNullParam(joystick, "joystick", "JoystickButton");

    m_joystick = joystick;
    m_axisNumber = axisNumber;
    m_tolerance = tolerance;
  }

  public boolean get() {
    return m_joystick.getRawAxis(m_axisNumber) > m_tolerance;
  }
}
isActive
