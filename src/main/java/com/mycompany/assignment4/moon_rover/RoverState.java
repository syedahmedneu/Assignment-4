/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.assignment4.moon_rover;

import com.mycompany.assignment4.state_pattern.*;

/**
 * State contract for the moon rover; unhandled events are ignored by default.
 *
 * @author syedahmed
 * @version 1.0
 */
public interface RoverState {
    /**
     * Gets the display name of the state.
     *
     * @return the state name
     */
    String getStateName();

    // Pedal Events
    /**
     * Handles a left pedal tap.
     *
     * @param ctx the rover context whose state may change
     */
    default void leftPedalTapOnce(RoverContext ctx) { unhandled("Left pedal tapped once"); }
    /**
     * Handles two left pedal taps.
     *
     * @param ctx the rover context whose state may change
     */
    default void leftPedalTapTwice(RoverContext ctx) { unhandled("Left pedal tapped twice"); }
    /**
     * Handles a left pedal hold of 3+ seconds.
     *
     * @param ctx the rover context whose state may change
     */
    default void leftPedalHold3Sec(RoverContext ctx) { unhandled("Left pedal held >= 3s"); }
    /**
     * Handles a left pedal hold of 5-10 seconds.
     *
     * @param ctx the rover context whose state may change
     */
    default void leftPedalHold5To10Sec(RoverContext ctx) { unhandled("Left pedal held 5-10s"); }
    /**
     * Handles a left pedal hold of 10+ seconds.
     *
     * @param ctx the rover context whose state may change
     */
    default void leftPedalHold10PlusSec(RoverContext ctx) { unhandled("Left pedal held >= 10s"); }

    /**
     * Handles a right pedal tap.
     *
     * @param ctx the rover context whose state may change
     */
    default void rightPedalTapOnce(RoverContext ctx) { unhandled("Right pedal tapped once"); }
    /**
     * Handles a right pedal hold of 3+ seconds.
     *
     * @param ctx the rover context whose state may change
     */
    default void rightPedalHold3Sec(RoverContext ctx) { unhandled("Right pedal held >= 3s"); }
    /**
     * Handles a right pedal hold of 5 seconds; powers off from any On state.
     *
     * @param ctx the rover context whose state may change
     */
    default void rightPedalHold5Sec(RoverContext ctx) {
        // Global transition from anywhere inside 'On' -> 'Off'
        if (!(this instanceof OffState)) {
            System.out.println("[Global Power Off] Right pedal held 5s -> Shutting down.");
            ctx.setState(new OffState());
        } else {
            unhandled("Right pedal held 5s");
        }
    }

    // Switch & Button Events
    /**
     * Handles the switch flipped on.
     *
     * @param ctx the rover context whose state may change
     */
    default void flipSwitchOn(RoverContext ctx) { unhandled("Flip switch ON"); }
    /**
     * Handles the switch flipped off.
     *
     * @param ctx the rover context whose state may change
     */
    default void flipSwitchOff(RoverContext ctx) { unhandled("Flip switch OFF"); }

    /**
     * Handles the left button held.
     *
     * @param ctx the rover context whose state may change
     */
    default void leftButtonHold(RoverContext ctx) { unhandled("Left button held"); }
    /**
     * Handles the left button tapped then held.
     *
     * @param ctx the rover context whose state may change
     */
    default void leftButtonDoubleTapHold(RoverContext ctx) { unhandled("Left button tap + hold"); }
    /**
     * Handles the right button held.
     *
     * @param ctx the rover context whose state may change
     */
    default void rightButtonHold(RoverContext ctx) { unhandled("Right button held"); }
    /**
     * Handles the right button tapped then held.
     *
     * @param ctx the rover context whose state may change
     */
    default void rightButtonDoubleTapHold(RoverContext ctx) { unhandled("Right button tap + hold"); }
    /**
     * Handles buttons being released.
     *
     * @param ctx the rover context whose state may change
     */
    default void releaseButtons(RoverContext ctx) { unhandled("Buttons released"); }

    // Internal Condition Events
    /**
     * Handles the vehicle reaching zero speed.
     *
     * @param ctx the rover context whose state may change
     */
    default void reachZeroSpeed(RoverContext ctx) { unhandled("Vehicle reached zero speed"); }

    /**
     * Logs that an event is ignored in this state.
     *
     * @param event description of the ignored event
     */
    default void unhandled(String event) {
        System.out.println("  (Ignored '" + event + "' in state: " + getStateName() + ")");
    }


}
