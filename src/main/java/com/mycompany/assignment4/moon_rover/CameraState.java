/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment4.moon_rover;

/**
 *
 * @author syedahmed
 */
public class CameraState implements RoverState {
    private final String cameraType;
    private String action = "Idle";

    public CameraState(String cameraType) {
        this.cameraType = cameraType;
    }

    @Override
    public String getStateName() {
        return "Surveying :: " + cameraType + " (" + action + ")";
    }

    @Override
    public void leftButtonHold(RoverContext ctx) {
        action = "Rotate camera left";
        System.out.println("  " + cameraType + " -> " + action);
    }

    @Override
    public void rightButtonHold(RoverContext ctx) {
        action = "Rotate camera right";
        System.out.println("  " + cameraType + " -> " + action);
    }

    @Override
    public void leftButtonDoubleTapHold(RoverContext ctx) {
        action = "Rotate camera up";
        System.out.println("  " + cameraType + " -> " + action);
    }

    @Override
    public void rightButtonDoubleTapHold(RoverContext ctx) {
        action = "Rotate camera down";
        System.out.println("  " + cameraType + " -> " + action);
    }

    @Override
    public void releaseButtons(RoverContext ctx) {
        action = "Idle";
        System.out.println("  " + cameraType + " -> " + action);
    }

    @Override
    public void leftPedalTapOnce(RoverContext ctx) {
        System.out.println("  " + cameraType + " -> Take picture -> Picture taken! (Returning to Idle)");
        action = "Idle";
    }

    @Override
    public void leftPedalHold5To10Sec(RoverContext ctx) {
        System.out.println("  " + cameraType + " -> Activate temporizer -> Picture taken! (Returning to Idle)");
        action = "Idle";
    }

    @Override
    public void rightPedalTapOnce(RoverContext ctx) {
        ctx.setState(new SurveyingIdleState());
    }
}
