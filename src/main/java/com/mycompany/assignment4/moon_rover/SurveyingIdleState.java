/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment4.moon_rover;

/**
 * Surveying mode with no instrument active; entry point to drill and cameras.
 *
 * @author syedahmed
 * @version 1.0
 */
public class SurveyingIdleState implements RoverState {
    /**
     * Gets the state name.
     *
     * @return "Surveying Mode :: Idle"
     */
    @Override
    public String getStateName() { return "Surveying Mode :: Idle"; }

    /**
     * Exits surveying mode to Not Moving.
     *
     * @param ctx the rover context whose state may change
     */
    @Override
    public void flipSwitchOff(RoverContext ctx) {
        ctx.setState(new NotMovingState());
    }

    /**
     * Activates the drill.
     *
     * @param ctx the rover context whose state may change
     */
    @Override
    public void leftPedalTapTwice(RoverContext ctx) {
        ctx.setState(new DrillState());
    }

    /**
     * Activates the 16mm camera.
     *
     * @param ctx the rover context whose state may change
     */
    @Override
    public void leftPedalHold5To10Sec(RoverContext ctx) {
        ctx.setState(new CameraState("16mm Camera"));
    }

    /**
     * Activates the color camera.
     *
     * @param ctx the rover context whose state may change
     */
    @Override
    public void leftPedalHold10PlusSec(RoverContext ctx) {
        ctx.setState(new CameraState("Color Camera"));
    }
}
