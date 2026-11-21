/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment4.moon_rover;

/**
 *
 * @author syedahmed
 */

class MovingBackwardState implements RoverState {
    private enum SubState { ACCELERATING, DECELERATING }
    private SubState subState = SubState.ACCELERATING;

    @Override
    public String getStateName() { return "On :: Moving Backwards (" + subState + ")"; }

    @Override
    public void rightPedalTapOnce(RoverContext ctx) {
        if (subState == SubState.ACCELERATING) {
            subState = SubState.DECELERATING;
            System.out.println("  Sub-state -> " + subState);
        }
    }

    @Override
    public void leftPedalTapOnce(RoverContext ctx) {
        if (subState == SubState.DECELERATING) {
            subState = SubState.ACCELERATING;
            System.out.println("  Sub-state -> " + subState);
        }
    }

    @Override
    public void reachZeroSpeed(RoverContext ctx) {
        ctx.setState(new NotMovingState());
    }
}