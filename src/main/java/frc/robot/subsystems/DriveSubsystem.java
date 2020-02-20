/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.PWMSparkMax;

import edu.wpi.first.wpilibj.drive.MecanumDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.DriveConstants;

public class DriveSubsystem extends SubsystemBase {
  /**
   * Creates a new DriveSubsystem.
   */
  private static PWMSparkMax leftOne = new PWMSparkMax(DriveConstants.kleftOne);
  private static PWMSparkMax leftTwo = new PWMSparkMax(DriveConstants.kleftTwo);
  private static PWMSparkMax rightOne = new PWMSparkMax(DriveConstants.krightOne);
  private static PWMSparkMax rightTwo = new PWMSparkMax(DriveConstants.krightTwo);
  
  private static MecanumDrive mecanumDrive = new MecanumDrive(leftOne, leftTwo, rightOne, rightTwo);
  
  public DriveSubsystem() {
  }

  public void driveCartesian (double ySpeed, double xSpeed, double zRotation){
    mecanumDrive.driveCartesian(ySpeed, xSpeed, zRotation);
  }

  public void setMaxOutput (double maxOutput){
    mecanumDrive.setMaxOutput(maxOutput);
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
