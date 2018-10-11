/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

  private Joystick m_leftStick = new Joystick(0);
  private Joystick m_rightStick = new Joystick(1);
  private Joystick m_articStick = new Joystick(2);

  public OI() {

  }

  public double getLeftX() {
    return m_leftStick.getX();
  }

  public double getLeftY() {
    return -m_leftStick.getY();
  }

  public double getRightY() {
    return -m_rightStick.getY();
  }

  public double getRightX() {
    return m_rightStick.getX();
  }

  public double getArticY() {
    return m_articStick.getY();
  }
}
