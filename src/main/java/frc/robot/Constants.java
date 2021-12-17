// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    //Drive Motors
    public static final int LEFT_MOTOR1 = 9;
    public static final int LEFT_MOTOR2 = 7;
    public static final int RIGHT_MOTOR1 = 5;
    public static final int RIGHT_MOTOR2 = 11;
    public static final double SCALING_FACTOR = -0.75;

    //Joystick Declaration
    public static final int JOYSTICK_LEFT = 2;
    public static final int JOYSTICK_RIGHT = 1;
    public static final int JOYSTICK_LEFTAXIS = 1;
    public static final int JOYSTICK_RIGHTAXIS = 1;
    public static final int JOYSTICK_ROTATEAXIS = 0;

    public static final int MOTOR_INTAKE_LEFT = 3;
    public static final int MOTOR_INTAKE_RIGHT = 12;
    
    public static final double INTAKE_SPEED = 0.5;
    public static final double INTAKE_SPEED_OUT = 0.75;
    public static final int INTAKE_AXIS = 1;
    public static final int INTAKE_BUTTON = 3;
    public static final int INTAKE_REVERSE_BUTTON = 1;
    public static final double INTAKE_SCALING_FACTOR = 0.5;
    
    public static final double XBOX_TOLERANCE = 0.25;
    public static final int XBOX_CONTROLLER = 0;
    
    public static final int LIFT_MOTOR = 4;
    public static final double LIFT_SPEED = 0.5;
    
    public static final int LIFTUP_AXIS = 4;
    public static final int LIFTDOWN_AXIS = 2;
    
    public static final double DRIVE_AUTO_SPEED = 0.5;
    public static final int AUTONOMOUS_TIME = 7;
}
