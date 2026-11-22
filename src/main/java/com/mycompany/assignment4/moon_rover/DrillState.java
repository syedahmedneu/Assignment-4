/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment4.moon_rover;

/**
 * Surveying mode with the drill active.
 *
 * @author syedahmed
 * @version 1.0
 */
public class DrillState implements RoverState {
    /** Whether the drill head spins; independent of linear motion so both can occur together. */
    private boolean headRotating = false;
    /** Drill linear motion: forward, backward or stationary. */
    private String linearMotion = "Stationary"; // Move drill forward / backwards / Stationary

    /**
     * Gets the state name with drill status.
     *
     * @return the state name
     */
    @Override
    public String getStateName() {
        return "Surveying :: Drill [Head=" + (headRotating ? "Rotating" : "Off") + ", Motion=" + linearMotion + "]";
    }

    /**
     * Toggles drill head rotation.
     *
     * @param ctx the rover context whose state may change
     */
    @Override
    public void leftPedalTapOnce(RoverContext ctx) {
        headRotating = !headRotating;
        System.out.println("  Drill head rotating: " + headRotating);
    }

    /**
     * Moves the drill forward.
     *
     * @param ctx the rover context whose state may change
     */
    @Override
    public void leftButtonHold(RoverContext ctx) {
        linearMotion = "Move drill forward";
        System.out.println("  Drill motion -> " + linearMotion);
    }

    /**
     * Moves the drill backward.
     *
     * @param ctx the rover context whose state may change
     */
    @Override
    public void rightButtonHold(RoverContext ctx) {
        linearMotion = "Move drill backwards";
        System.out.println("  Drill motion -> " + linearMotion);
    }

    /**
     * Stops linear drill motion.
     *
     * @param ctx the rover context whose state may change
     */
    @Override
    public void releaseButtons(RoverContext ctx) {
        linearMotion = "Stationary";
        System.out.println("  Drill motion -> " + linearMotion);
    }

    /**
     * Returns to Surveying Idle.
     *
     * @param ctx the rover context whose state may change
     */
    @Override
    public void rightPedalTapOnce(RoverContext ctx) {
        ctx.setState(new SurveyingIdleState());
    }
}