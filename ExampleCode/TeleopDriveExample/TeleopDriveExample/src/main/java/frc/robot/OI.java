/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.CloseClaw;
import frc.robot.commands.OpenClaw;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

  // Make new joysticks
  private Joystick m_leftStick = new Joystick(0);
  private Joystick m_rightStick = new Joystick(1);
  private Joystick m_operatorStick = new Joystick(2);

  private JoystickButton m_closeClaw5, m_openClaw6;

  public OI() {
    // Make joystick buttons for joysticks 5 and 6 on the operator joystick
    m_closeClaw5= new JoystickButton(m_operatorStick, 5);
    m_openClaw6 = new JoystickButton(m_operatorStick, 6);
    // Run the open and close commands when the buttons are pressed
    m_closeClaw5.whenPressed(new CloseClaw());
    m_openClaw6.whenPressed(new OpenClaw());
  }

  // Get joystick x and y values,
  public double getLeftX() {
    return m_leftStick.getX();
  }

  public double getLeftY() {
    //y value should be inverted so pushing the joystick away from the driver returns a positive value
    return -m_leftStick.getY();
  }

  public double getRightY() {
    return -m_rightStick.getY();
  }

  public double getRightX() {
    return m_rightStick.getX();
  }

  public double getArticY() {
    return -m_operatorStick.getY();
  }
}
