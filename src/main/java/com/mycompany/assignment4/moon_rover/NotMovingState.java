/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment4.moon_rover;

/**
 *
 * @author syedahmed
 */
class NotMovingState implements RoverState {
    @Override
    public String getStateName() { return "On :: Not Moving"; }

    @Override
    public void leftPedalTapOnce(RoverContext ctx) {
        ctx.setState(new MovingForwardState());
    }

    @Override
    public void leftPedalHold3Sec(RoverContext ctx) {
        ctx.setState(new MovingBackwardState());
    }

    @Override
    public void flipSwitchOn(RoverContext ctx) {
        ctx.setState(new SurveyingIdleState());
    }
}
