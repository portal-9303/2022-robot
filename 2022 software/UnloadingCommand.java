package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.FeedingSubsystem;

public class UnloadingCommand extends CommandBase {
  private FeedingSubsystem feedingSubsystem;

  public UnloadingCommand(FeedingSubsystem feedingSubsystem) {
    this.feedingSubsystem = feedingSubsystem;
    addRequirements(feedingSubsystem);
  }

  @Override
  public void execute() {
    feedingSubsystem.setconveyormotor(-1);
  }

  @Override
  public boolean isFinished() {
    return false;
  }

}
