/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.assignment4.moon_rover;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;

/**
 * Tests for the rover state machine transitions.
 *
 * @author syedahmed
 * @version 1.0
 */
public class RoverStateTest {
    
    /** Rover under test. */
    private RoverContext rover;

    /** Creates a rover in the Off state. */
    @BeforeEach
    void setUp() {
        rover = new RoverContext();
    }

    /** Verifies power-on from Off. */
    @Test
    void testPowerOn() {
        assertEquals("Off", rover.getState().getStateName());

        rover.rightPedalTapOnce();
        assertEquals("On :: Not Moving", rover.getState().getStateName());
    }

    /** Verifies inputs are ignored while Off. */
    @Test
    void testIgnoreInputsWhenOff() {
        rover.leftPedalTapOnce();
        rover.flipSwitchOn();
        rover.leftPedalTapTwice();

        assertEquals("Off", rover.getState().getStateName());
    }

    /** Verifies a 5s right pedal hold powers off from any On state. */
    @Test
    void testGlobalPowerOff() {
        // From Not Moving
        rover.rightPedalTapOnce();
        rover.rightPedalHold5Sec();
        assertEquals("Off", rover.getState().getStateName());

        // From Moving Forward
        rover.rightPedalTapOnce();
        rover.leftPedalTapOnce();
        rover.rightPedalHold5Sec();
        assertEquals("Off", rover.getState().getStateName());

        // From Drill Interacting
        rover.rightPedalTapOnce();
        rover.flipSwitchOn();
        rover.leftPedalTapTwice();
        rover.rightPedalHold5Sec();
        assertEquals("Off", rover.getState().getStateName());
    }

    /** Verifies forward sub-state transitions. */
    @Test
    void testMovingForwardCycle() {
        rover.rightPedalTapOnce();

        rover.leftPedalTapOnce();
        assertEquals("On :: Moving Forward (ACCELERATING)", rover.getState().getStateName());

        rover.rightPedalHold3Sec();
        assertEquals("On :: Moving Forward (CONSTANT_SPEED)", rover.getState().getStateName());

        rover.rightPedalTapOnce();
        assertEquals("On :: Moving Forward (DECELERATING)", rover.getState().getStateName());

        rover.leftPedalTapOnce();
        assertEquals("On :: Moving Forward (ACCELERATING)", rover.getState().getStateName());

        rover.reachZeroSpeed();
        assertEquals("On :: Not Moving", rover.getState().getStateName());
    }

    /** Verifies backward sub-state transitions. */
    @Test
    void testMovingBackwardCycle() {
        rover.rightPedalTapOnce();

        rover.leftPedalHold3Sec();
        assertEquals("On :: Moving Backwards (ACCELERATING)", rover.getState().getStateName());

        // Constant speed is not valid in Moving Backwards
        rover.rightPedalHold3Sec();
        assertEquals("On :: Moving Backwards (ACCELERATING)", rover.getState().getStateName());

        rover.rightPedalTapOnce();
        assertEquals("On :: Moving Backwards (DECELERATING)", rover.getState().getStateName());

        rover.leftPedalTapOnce();
        assertEquals("On :: Moving Backwards (ACCELERATING)", rover.getState().getStateName());

        rover.reachZeroSpeed();
        assertEquals("On :: Not Moving", rover.getState().getStateName());
    }

    /** Verifies entering and exiting surveying mode. */
    @Test
    void testExitSurveyingMode() {
        rover.rightPedalTapOnce();
        rover.flipSwitchOn();
        assertEquals("Surveying Mode :: Idle", rover.getState().getStateName());

        rover.flipSwitchOff();
        assertEquals("On :: Not Moving", rover.getState().getStateName());
    }

    /** Verifies drill rotation and motion together. */
    @Test
    void testDrillConcurrentOperations() {
        rover.rightPedalTapOnce();
        rover.flipSwitchOn();

        rover.leftPedalTapTwice();
        assertEquals("Surveying :: Drill [Head=Off, Motion=Stationary]", rover.getState().getStateName());

        rover.leftPedalTapOnce();
        rover.leftButtonHold();
        assertEquals("Surveying :: Drill [Head=Rotating, Motion=Move drill forward]", rover.getState().getStateName());

        rover.rightButtonHold();
        assertEquals("Surveying :: Drill [Head=Rotating, Motion=Move drill backwards]", rover.getState().getStateName());

        rover.releaseButtons();
        rover.leftPedalTapOnce();
        assertEquals("Surveying :: Drill [Head=Off, Motion=Stationary]", rover.getState().getStateName());

        rover.rightPedalTapOnce();
        assertEquals("Surveying Mode :: Idle", rover.getState().getStateName());
    }

    /** Verifies 16mm camera actions. */
    @Test
    void test16mmCameraOperations() {
        rover.rightPedalTapOnce();
        rover.flipSwitchOn();

        rover.leftPedalHold5To10Sec();
        assertEquals("Surveying :: 16mm Camera (Idle)", rover.getState().getStateName());

        rover.leftButtonHold();
        assertEquals("Surveying :: 16mm Camera (Rotate camera left)", rover.getState().getStateName());

        rover.rightButtonHold();
        assertEquals("Surveying :: 16mm Camera (Rotate camera right)", rover.getState().getStateName());

        rover.leftButtonDoubleTapHold();
        assertEquals("Surveying :: 16mm Camera (Rotate camera up)", rover.getState().getStateName());

        rover.rightButtonDoubleTapHold();
        assertEquals("Surveying :: 16mm Camera (Rotate camera down)", rover.getState().getStateName());

        rover.releaseButtons();
        assertEquals("Surveying :: 16mm Camera (Idle)", rover.getState().getStateName());

        rover.leftPedalTapOnce();
        assertEquals("Surveying :: 16mm Camera (Idle)", rover.getState().getStateName());

        rover.leftPedalHold5To10Sec();
        assertEquals("Surveying :: 16mm Camera (Idle)", rover.getState().getStateName());

        rover.rightPedalTapOnce();
        assertEquals("Surveying Mode :: Idle", rover.getState().getStateName());
    }

    /** Verifies color camera entry and exit. */
    @Test
    void testColorCameraEntryAndExit() {
        rover.rightPedalTapOnce();
        rover.flipSwitchOn();

        rover.leftPedalHold10PlusSec();
        assertEquals("Surveying :: Color Camera (Idle)", rover.getState().getStateName());

        rover.leftButtonHold();
        assertEquals("Surveying :: Color Camera (Rotate camera left)", rover.getState().getStateName());

        rover.rightPedalTapOnce();
        assertEquals("Surveying Mode :: Idle", rover.getState().getStateName());
    }
}