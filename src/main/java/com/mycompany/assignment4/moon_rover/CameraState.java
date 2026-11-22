/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment4.moon_rover;

/**
 * Surveying mode with a camera active; one class serves both camera types.
 *
 * @author syedahmed
 * @version 1.0
 */
public class CameraState implements RoverState {
    /** Camera name (e.g. "16mm Camera"); fixed so one class covers both cameras. */
    private final String cameraType;
    /** Current camera action, shown in the state name. */
    private String action = "Idle";

    /**
     * Creates a camera state.
     *
     * @param cameraType the camera name
     */
    public CameraState(String cameraType) {
        this.cameraType = cameraType;
    }

    /**
     * Gets the state name with camera and action.
     *
     * @return the state name
     */
    @Override
    public String getStateName() {
        return "Surveying :: " + cameraType + " (" + action + ")";
    }

    /**
     * Rotates the camera left.
     *
     * @param ctx the rover context whose state may change
     */
    @Override
    public void leftButtonHold(RoverContext ctx) {
        action = "Rotate camera left";
        System.out.println("  " + cameraType + " -> " + action);
    }

    /**
     * Rotates the camera right.
     *
     * @param ctx the rover context whose state may change
     */
    @Override
    public void rightButtonHold(RoverContext ctx) {
        action = "Rotate camera right";
        System.out.println("  " + cameraType + " -> " + action);
    }

    /**
     * Rotates the camera up.
     *
     * @param ctx the rover context whose state may change
     */
    @Override
    public void leftButtonDoubleTapHold(RoverContext ctx) {
        action = "Rotate camera up";
        System.out.println("  " + cameraType + " -> " + action);
    }

    /**
     * Rotates the camera down.
     *
     * @param ctx the rover context whose state may change
     */
    @Override
    public void rightButtonDoubleTapHold(RoverContext ctx) {
        action = "Rotate camera down";
        System.out.println("  " + cameraType + " -> " + action);
    }

    /**
     * Stops rotation and returns to idle.
     *
     * @param ctx the rover context whose state may change
     */
    @Override
    public void releaseButtons(RoverContext ctx) {
        action = "Idle";
        System.out.println("  " + cameraType + " -> " + action);
    }

    /**
     * Takes a picture, then idles.
     *
     * @param ctx the rover context whose state may change
     */
    @Override
    public void leftPedalTapOnce(RoverContext ctx) {
        System.out.println("  " + cameraType + " -> Take picture -> Picture taken! (Returning to Idle)");
        action = "Idle";
    }

    /**
     * Takes a picture with the timer, then idles.
     *
     * @param ctx the rover context whose state may change
     */
    @Override
    public void leftPedalHold5To10Sec(RoverContext ctx) {
        System.out.println("  " + cameraType + " -> Activate temporizer -> Picture taken! (Returning to Idle)");
        action = "Idle";
    }

    /**
     * Returns to Surveying Idle.
     *
     * @param ctx the rover context whose state may change
     */
    @Override
    public void rightPedalTapOnce(RoverContext ctx) {
        ctx.setState(new SurveyingIdleState());
    }
}
