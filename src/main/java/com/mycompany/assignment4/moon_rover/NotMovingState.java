/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment4.moon_rover;

/**
 * Rover is on and stationary.
 *
 * @author syedahmed
 * @version 1.0
 */
class NotMovingState implements RoverState {
    /**
     * Gets the state name.
     *
     * @return "On :: Not Moving"
     */
    @Override
    public String getStateName() { return "On :: Not Moving"; }

    /**
     * Starts moving forward.
     *
     * @param ctx the rover context whose state may change
     */
    @Override
    public void leftPedalTapOnce(RoverContext ctx) {
        ctx.setState(new MovingForwardState());
    }

    /**
     * Starts moving backward.
     *
     * @param ctx the rover context whose state may change
     */
    @Override
    public void leftPedalHold3Sec(RoverContext ctx) {
        ctx.setState(new MovingBackwardState());
    }

    /**
     * Enters surveying mode.
     *
     * @param ctx the rover context whose state may change
     */
    @Override
    public void flipSwitchOn(RoverContext ctx) {
        ctx.setState(new SurveyingIdleState());
    }
}
