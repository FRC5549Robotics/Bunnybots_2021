package frc.robot.commands;

public class LiftUp extends LiftGeneral {
  @Override
  public void execute() {
    m_lift.on(true);
    while (m_button.get()) {}
    m_lift.off()
  }
}
