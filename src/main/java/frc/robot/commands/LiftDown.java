package frc.robot.commands;

public class LiftDown extends CommandBase {
  @Override
  public void execute() {
    m_lift.on(false);
    while (m_button.get()) {}
    m_lift.off()
  }
}
