package frc.robot.swervelib.parser.json;

import frc.robot.swervelib.parser.PIDFConfig;
import frc.robot.swervelib.parser.SwerveControllerConfiguration;
import frc.robot.swervelib.parser.SwerveDriveConfiguration;

/** {@link swervelib.SwerveController} parsed class. Used to access the JSON data. */
public class ControllerPropertiesJson {

  /**
   * The minimum radius of the angle control joystick to allow for heading adjustment of the robot.
   */
  public double angleJoystickRadiusDeadband;
  /** The PID used to control the robot heading. */
  public PIDFConfig heading;

  /**
   * Create the {@link SwerveControllerConfiguration} based on parsed and given data.
   *
   * @param driveConfiguration {@link SwerveDriveConfiguration} parsed configuration.
   * @return {@link SwerveControllerConfiguration} object based on parsed data.
   */
  public SwerveControllerConfiguration createControllerConfiguration(
      SwerveDriveConfiguration driveConfiguration) {
    return new SwerveControllerConfiguration(
        driveConfiguration, heading, angleJoystickRadiusDeadband);
  }
}
