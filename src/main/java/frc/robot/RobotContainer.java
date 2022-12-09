// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.XboxController.Button;
import frc.robot.commands.ExampleCommand;
import frc.robot.subsystems.ExampleSubsystem;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.PrintCommand;

import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import edu.wpi.first.wpilibj2.command.button.Trigger;

/**
 * This class is where the bulk of the robot should be declared. Since
 * Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in
 * the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of
 * the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
    // The robot's subsystems and commands are defined here...
    private final ExampleSubsystem m_exampleSubsystem = new ExampleSubsystem();

    private final ExampleCommand m_autoCommand = new ExampleCommand(m_exampleSubsystem);

    // xbox controller
    private final XboxController m_drivController = new XboxController(Constants.DRIVER_CONTROLLER_PORT);

    /**
     * The container for the robot. Contains subsystems, OI devices, and commands.
     */
    public RobotContainer() {
        // Configure the button bindings
        configureButtonBindings();
    }

    /**
     * Use this method to define your button->command mappings. Buttons can be
     * created by
     * instantiating a {@link GenericHID} or one of its subclasses ({@link
     * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing
     * it to a {@link
     * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
     */
    private void configureButtonBindings() {
        new JoystickButton(m_drivController, Button.kA.value)
                .whenPressed(new PrintCommand("Button A (" + Button.kA.value + ") whenPressed >>>"))
                .whileHeld(new PrintCommand(" Button A (" + Button.kA.value + ") whileHeld..."))
                .whenReleased(new PrintCommand("  Button A (" + Button.kA.value + ") whenReleased <<<"));

        new JoystickButton(m_drivController, Button.kB.value)
                .whenPressed(new PrintCommand("Button B (" + Button.kB.value + ") whenPressed >>>"))
                .whileHeld(new PrintCommand(" Button B (" + Button.kB.value + ") whileHeld..."))
                .whenReleased(new PrintCommand("  Button B (" + Button.kB.value + ") whenReleased <<<"));

        new JoystickButton(m_drivController, Button.kX.value)
                .whenPressed(new PrintCommand("Button X (" + Button.kX.value + ") whenPressed >>>"))
                .whileHeld(new PrintCommand(" Button X (" + Button.kX.value + ") whileHeld..."))
                .whenReleased(new PrintCommand("  Button X (" + Button.kX.value + ") whenReleased <<<"));

        new JoystickButton(m_drivController, Button.kY.value)
                .whenPressed(new PrintCommand("Button Y (" + Button.kY.value + ") whenPressed >>>"))
                .whileHeld(new PrintCommand(" Button Y (" + Button.kY.value + ") whileHeld..."))
                .whenReleased(new PrintCommand("  Button Y (" + Button.kY.value + ") whenReleased <<<"));

        new JoystickButton(m_drivController, Button.kLeftBumper.value)
                .whenPressed(new PrintCommand("Button LeftBumper (" + Button.kLeftBumper.value + ") whenPressed >>>"))
                .whileHeld(new PrintCommand(" Button LeftBumper (" + Button.kLeftBumper.value + ") whileHeld..."))
                .whenReleased(new PrintCommand("  Button LeftBumper (" + Button.kLeftBumper.value + ") whenReleased <<<"));

        new JoystickButton(m_drivController, Button.kRightBumper.value)
                .whenPressed(new PrintCommand("Button RightBumper (" + Button.kRightBumper.value + ") whenPressed >>>"))
                .whileHeld(new PrintCommand(" Button RightBumper (" + Button.kRightBumper.value + ") whileHeld..."))
                .whenReleased(new PrintCommand("  Button RightBumper (" + Button.kRightBumper.value + ") whenReleased <<<"));

        new JoystickButton(m_drivController, Button.kBack.value)
                .whenPressed(new PrintCommand("Button Back (" + Button.kBack.value + ") whenPressed >>>"))
                .whileHeld(new PrintCommand(" Button Back (" + Button.kBack.value + ") whileHeld..."))
                .whenReleased(new PrintCommand("  Button Back (" + Button.kBack.value + ") whenReleased <<<"));

        new JoystickButton(m_drivController, Button.kStart.value)
                .whenPressed(new PrintCommand("Button Start (" + Button.kStart.value + ") whenPressed >>>"))
                .whileHeld(new PrintCommand(" Button Start (" + Button.kStart.value + ") whileHeld.."))
                .whenReleased(new PrintCommand("  Button Start (" + Button.kStart.value + ") whenReleased <<<"));

        new JoystickButton(m_drivController, Button.kLeftStick.value)
                .whenPressed(new PrintCommand("Button LeftStick (" + Button.kLeftStick.value + ") whenPressed >>>"))
                .whileHeld(new PrintCommand(" Button LeftStick (" + Button.kLeftStick.value + ") whileHeld..."))
                .whenReleased(new PrintCommand("  Button LeftStick (" + Button.kLeftStick.value + ") whenReleased <<<"));

        new JoystickButton(m_drivController, Button.kRightStick.value)
                .whenPressed(new PrintCommand("Button RightStick (" + Button.kRightStick.value + ") whenPressed >>>"))
                .whileHeld(new PrintCommand(" Button RightStick (" + Button.kRightStick.value + ") whileHeld..."))
                .whenReleased(new PrintCommand("  Button RightStick (" + Button.kRightStick.value + ") whenReleased <<<"));
    }

    /**
     * Use this to pass the autonomous command to the main {@link Robot} class.
     *
     * @return the command to run in autonomous
     */
    public Command getAutonomousCommand() {
        // An ExampleCommand will run in autonomous
        return m_autoCommand;
    }
}
