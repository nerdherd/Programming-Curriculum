/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.TankDrive;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX; 
/**
 * Add your docs here.
 */
public class Drive extends Subsystem {
  
  private TalonSRX m_leftMaster, m_leftSlave1, m_leftSlave2;
  private TalonSRX m_rightMaster, m_rightSlave1, m_rightSlave2;

  public Drive() {
    // Create TalonSRXs for the drivetrain, 3 on each side
    m_rightMaster = new TalonSRX(RobotMap.kRightMasterID);
    m_rightSlave1 = new TalonSRX(RobotMap.kRightSlave1ID);
    m_rightSlave2 = new TalonSRX(RobotMap.kRightSlave2ID);
    m_leftMaster = new TalonSRX(RobotMap.kLeftMasterID);
    m_leftSlave1 = new TalonSRX(RobotMap.kLeftSlave1ID);
    m_leftSlave2 = new TalonSRX(RobotMap.kLeftSlave2ID);
    
    // Make the slave motors follow the masters (the masters have the encoders)
    m_leftSlave1.follow(m_leftMaster);
    m_leftSlave2.follow(m_leftMaster);

    m_rightSlave1.follow(m_rightMaster);
    m_rightSlave2.follow(m_rightMaster);

    //invert half the drivetrain so giving each motor a positive value moves the robot forwards
    m_rightMaster.setInverted(false);
    m_rightSlave1.setInverted(false);
    m_rightSlave2.setInverted(false);

    m_leftMaster.setInverted(true);
    m_leftSlave1.setInverted(true);
    m_leftSlave2.setInverted(true);
  }

  public void setPower(double left, double right) {
    // Set left and right motor powers
    m_rightMaster.set(ControlMode.PercentOutput, right);
    m_leftMaster.set(ControlMode.PercentOutput, left);

  }
  @Override
  public void initDefaultCommand() {
    // Have the tank drive command run by defaul
    setDefaultCommand(new TankDrive());
  }
}
