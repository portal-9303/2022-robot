package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
public class FeedingSubsystem extends SubsystemBase {

  private final WPI_TalonSRX conveyorMotor = new WPI_TalonSRX(0);
  
  public FeedingSubsystem() {

  }

  public void Moveconveyor(double speed){
    conveyorMotor.set(speed);
  }

  public void startConveyor() {
    conveyorCommand.schedule();
  }

 /*  public void stopConveyor() {
    conveyorCommand.cancel();
  }

  public void startUnloading() {
    unloadingCommand.schedule();
  }

  public void stopUnloading() {
    unloadingCommand.cancel();
  }*/
}
