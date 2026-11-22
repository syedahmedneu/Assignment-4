/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment4.moon_rover;


/**
 * Demo of the rover state machine: drive, drill, photograph, power off.
 *
 * @author syedahmed
 * @version 1.0
 */
public class Main {
    
    /**
     * Runs a scripted sequence of rover inputs.
     *
     * @param args command-line arguments (unused)
     */
    public static void main(String[] args){
        RoverContext rover = new RoverContext();

        // 1. Power On & Drive Forward
        rover.rightPedalTapOnce();       // Off -> Not Moving
        rover.leftPedalTapOnce();        // Not Moving -> Moving Forward (Accelerating)
        rover.rightPedalHold3Sec();      // Accelerating -> Constant Speed
        rover.rightPedalTapOnce();       // Constant Speed -> Decelerating
        rover.reachZeroSpeed();          // Decelerating -> Not Moving

        // 2. Enter Surveying Mode & Use Drill
        rover.flipSwitchOn();            // Not Moving -> Surveying Idle
        rover.leftPedalTapTwice();       // Surveying Idle -> Drill Interacting
        rover.leftPedalTapOnce();        // Toggle Drill Head Rotating ON
        rover.leftButtonHold();          // Move drill forward
        rover.releaseButtons();          // Stop drill linear motion
        rover.rightPedalTapOnce();       // Drill -> Surveying Idle

        // 3. Use 16mm Camera
        rover.leftPedalHold5To10Sec();   // Surveying Idle -> 16mm Camera
        rover.leftButtonDoubleTapHold(); // Rotate camera up
        rover.releaseButtons();          // Back to camera Idle
        rover.leftPedalTapOnce();        // Take picture
        rover.rightPedalTapOnce();       // 16mm Camera -> Surveying Idle

        // 4. Global Power Off
        rover.rightPedalHold5Sec();      // Anywhere in On -> Off
    }
    
}
