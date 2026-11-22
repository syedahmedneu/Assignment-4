/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment4.moon_rover;

/**
 * Rover moving backward, with accelerating or decelerating sub-states.
 *
 * @author syedahmed
 * @version 1.0
 */

class MovingBackwardState implements RoverState {
    /** Speed phases while moving backward (no constant speed). */
    private enum SubState { ACCELERATING, DECELERATING }
    /** Current speed phase; starts accelerating. */
    private SubState subState = SubState.ACCELERATING;

    /**
     * Gets the state name with its sub-state.
     *
     * @return the state name
     */
    @Override
    public String getStateName() { return "On :: Moving Backwards (" + subState + ")"; }

    /**
     * Starts decelerating if accelerating.
     *
     * @param ctx the rover context whose state may change
     */
    @Override
    public void rightPedalTapOnce(RoverContext ctx) {
        if (subState == SubState.ACCELERATING) {
            subState = SubState.DECELERATING;
            System.out.println("  Sub-state -> " + subState);
        }
    }

    /**
     * Resumes accelerating if decelerating.
     *
     * @param ctx the rover context whose state may change
     */
    @Override
    public void leftPedalTapOnce(RoverContext ctx) {
        if (subState == SubState.DECELERATING) {
            subState = SubState.ACCELERATING;
            System.out.println("  Sub-state -> " + subState);
        }
    }

    /**
     * Stops, moving to Not Moving.
     *
     * @param ctx the rover context whose state may change
     */
    @Override
    public void reachZeroSpeed(RoverContext ctx) {
        ctx.setState(new NotMovingState());
    }
}