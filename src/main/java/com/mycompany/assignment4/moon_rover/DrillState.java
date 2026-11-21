/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment4.moon_rover;

/**
 *
 * @author syedahmed
 */
public class DrillState implements RoverState {
    private boolean headRotating = false;
    private String linearMotion = "Stationary"; // Move drill forward / backwards / Stationary

    @Override
    public String getStateName() {
        return "Surveying :: Drill [Head=" + (headRotating ? "Rotating" : "Off") + ", Motion=" + linearMotion + "]";
    }

    @Override
    public void leftPedalTapOnce(RoverContext ctx) {
        headRotating = !headRotating;
        System.out.println("  Drill head rotating: " + headRotating);
    }

    @Override
    public void leftButtonHold(RoverContext ctx) {
        linearMotion = "Move drill forward";
        System.out.println("  Drill motion -> " + linearMotion);
    }

    @Override
    public void rightButtonHold(RoverContext ctx) {
        linearMotion = "Move drill backwards";
        System.out.println("  Drill motion -> " + linearMotion);
    }

    @Override
    public void releaseButtons(RoverContext ctx) {
        linearMotion = "Stationary";
        System.out.println("  Drill motion -> " + linearMotion);
    }

    @Override
    public void rightPedalTapOnce(RoverContext ctx) {
        ctx.setState(new SurveyingIdleState());
    }
}