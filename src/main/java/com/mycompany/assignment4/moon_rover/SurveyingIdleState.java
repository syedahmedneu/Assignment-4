/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment4.moon_rover;

/**
 *
 * @author syedahmed
 */
public class SurveyingIdleState implements RoverState {
    @Override
    public String getStateName() { return "Surveying Mode :: Idle"; }

    @Override
    public void flipSwitchOff(RoverContext ctx) {
        ctx.setState(new NotMovingState());
    }

    @Override
    public void leftPedalTapTwice(RoverContext ctx) {
        ctx.setState(new DrillState());
    }

    @Override
    public void leftPedalHold5To10Sec(RoverContext ctx) {
        ctx.setState(new CameraState("16mm Camera"));
    }

    @Override
    public void leftPedalHold10PlusSec(RoverContext ctx) {
        ctx.setState(new CameraState("Color Camera"));
    }
}
