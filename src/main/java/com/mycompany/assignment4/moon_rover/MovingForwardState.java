/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment4.moon_rover;

/**
 * Rover moving forward, with accelerating, decelerating or constant-speed sub-states.
 *
 * @author syedahmed
 * @version 1.0
 */
public class MovingForwardState implements RoverState {
    /** Speed phases while moving forward. */
    private enum SubState { ACCELERATING, DECELERATING, CONSTANT_SPEED }
    /** Current speed phase; starts accelerating. */
    private SubState subState = SubState.ACCELERATING;

    /**
     * Gets the state name with its sub-state.
     *
     * @return the state name
     */
    @Override
    public String getStateName() { return "On :: Moving Forward (" + subState + ")"; }

    /**
     * Starts decelerating if accelerating or at constant speed.
     *
     * @param ctx the rover context whose state may change
     */
    @Override
    public void rightPedalTapOnce(RoverContext ctx) {
        if (subState == SubState.ACCELERATING || subState == SubState.CONSTANT_SPEED) {
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
     * Holds constant speed if accelerating.
     *
     * @param ctx the rover context whose state may change
     */
    @Override
    public void rightPedalHold3Sec(RoverContext ctx) {
        if (subState == SubState.ACCELERATING) {
            subState = SubState.CONSTANT_SPEED;
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