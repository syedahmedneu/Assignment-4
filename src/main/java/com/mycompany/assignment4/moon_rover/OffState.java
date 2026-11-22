/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment4.moon_rover;

/**
 * Rover is powered off; only a right pedal tap powers it on.
 *
 * @author syedahmed
 * @version 1.0
 */
public class OffState implements RoverState {
    /**
     * Gets the state name.
     *
     * @return "Off"
     */
    @Override
    public String getStateName() { return "Off"; }

    /**
     * Powers on, moving to Not Moving.
     *
     * @param ctx the rover context whose state may change
     */
    @Override
    public void rightPedalTapOnce(RoverContext ctx) {
        ctx.setState(new NotMovingState());
    }
}
