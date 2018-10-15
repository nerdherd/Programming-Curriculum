/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
public class Claw extends Subsystem {
  
  private DoubleSolenoid m_claw;

  public Claw() {
    // Make new piston (Double Solenoid) 
    m_claw = new DoubleSolenoid(RobotMap.kClaw1ID, RobotMap.kClaw2ID);
  }

  public void openClaw() {
    //Opens claw, if this function doesn't open the claw reverse the solenid ports
    m_claw.set(Value.kForward);
  }

  public void closeClaw() {
     //Close claw, if this function doesn't close the claw reverse the solenid ports
    m_claw.set(Value.kReverse);
  }
  
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
