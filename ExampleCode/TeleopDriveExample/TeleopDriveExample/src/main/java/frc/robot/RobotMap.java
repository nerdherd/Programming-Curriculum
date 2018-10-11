/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

  public static final int kRightMasterID = 0;
  public static final int kRightSlave1ID = 1;
  public static final int kRightSlave2ID = 2;
  public static final int kLeftMasterID = 3;
  public static final int kLeftSlave1ID = 4;
  public static final int kLeftSlave2ID = 5;

  public static final int kArmID = 6;

  public static final int kClaw1ID = 0;
  public static final int kClaw2ID = 1;
}
