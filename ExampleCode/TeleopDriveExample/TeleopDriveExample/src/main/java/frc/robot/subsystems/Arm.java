/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.ManualArmControl;

/**
 * Add your docs here.
 */
public class Arm extends Subsystem {
  
  private TalonSRX m_arm;

  public Arm() {
    m_arm = new TalonSRX(RobotMap.kArmID);
    m_arm.setInverted(true);
  }

  public void setPower(double power) {
    m_arm.set(ControlMode.PercentOutput, power);
  }
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new ManualArmControl());
  }
}