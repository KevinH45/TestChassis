// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import static frc.robot.Constants.DrivetrainConstants.*;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

public class SUB_DriveTrain extends SubsystemBase {

  private WPI_TalonSRX leftLeader = new WPI_TalonSRX(LEFT_LEADER_ID);
  private WPI_TalonSRX leftFollower = new WPI_TalonSRX(LEFT_FOLLOWER_ID);
  private WPI_TalonSRX rightLeader = new WPI_TalonSRX(RIGHT_LEADER_ID);
  private WPI_TalonSRX rightFollower = new WPI_TalonSRX(RIGHT_FOLLOWER_ID);

  private MotorControllerGroup leftGroup = new MotorControllerGroup(leftLeader, leftFollower);
  private MotorControllerGroup rightGroup = new MotorControllerGroup(rightLeader, rightFollower);

  private DifferentialDrive drive = new DifferentialDrive(leftGroup, rightGroup);


  /** Creates a new SUB_DriveTrain. */
  public SUB_DriveTrain() {

  }

  public void tankDrive(double leftSpeed, double rightSpeed){
    drive.tankDrive(leftSpeed, rightSpeed);
  }

  public void configureMotor(){

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
