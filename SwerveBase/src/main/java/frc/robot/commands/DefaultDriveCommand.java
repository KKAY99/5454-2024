package frc.robot.commands;

import java.util.function.DoubleSupplier;

import javax.lang.model.util.ElementScanner14;

import java.util.function.BooleanSupplier;
import edu.wpi.first.wpilibj2.command.Command;

import edu.wpi.first.math.geometry.Translation2d;
import edu.wpi.first.networktables.BooleanSubscriber;
import frc.robot.subsystems.TestSwerveModuleSubsystem;

import frc.robot.Constants;
public class DefaultDriveCommand extends Command {
   
  private final TestSwerveModuleSubsystem m_drive;
  //private final SwerveSubsystem m_drive;
  private final DoubleSupplier m_drive_fwd;
  private final DoubleSupplier m_drive_rcw;
  
  /**
   * Creates a new DefaultDrive.
   *
   * @param subsystem The drive subsystem this command wil run on.
   * @param forward   The control input for driving left
   * @param rotation  The control input for driving right
   */
  public DefaultDriveCommand(TestSwerveModuleSubsystem subsystem, DoubleSupplier drive_rcw, DoubleSupplier drive_fwd) {
    m_drive = subsystem;
    m_drive_fwd = drive_fwd;
    m_drive_rcw = drive_rcw;
    addRequirements(m_drive);
  }

  @Override
  public void execute() {
    double forward = m_drive_fwd.getAsDouble();
    
    double turn = m_drive_rcw.getAsDouble();
      m_drive.drive(forward, turn);
    
    
   
  }
}