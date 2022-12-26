package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.FeedingSubsystem;

public class ConveyorCommand extends CommandBase {
  private final FeedingSubsystem feedingSubsystem;

  public ConveyorCommand(FeedingSubsystem feedingSubsystem) {
    this.feedingSubsystem = feedingSubsystem;
    addRequirements(feedingSubsystem);
  }

  @Override
    public void initialize() {
        System.out.println("conveyor command started!");
    }

  @Override
  public void execute() {
    
  }

  @Override
  public boolean isFinished() {
    return false;
  }

  @Override
  public void end(boolean interrupted) {
  }
}

