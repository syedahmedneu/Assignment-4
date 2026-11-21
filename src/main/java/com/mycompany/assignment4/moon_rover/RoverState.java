/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.assignment4.moon_rover;

import com.mycompany.assignment4.state_pattern.*;

/**
 *
 * @author syedahmed
 */
public interface RoverState {
    String getStateName();

    // Pedal Events
    default void leftPedalTapOnce(RoverContext ctx) { unhandled("Left pedal tapped once"); }
    default void leftPedalTapTwice(RoverContext ctx) { unhandled("Left pedal tapped twice"); }
    default void leftPedalHold3Sec(RoverContext ctx) { unhandled("Left pedal held >= 3s"); }
    default void leftPedalHold5To10Sec(RoverContext ctx) { unhandled("Left pedal held 5-10s"); }
    default void leftPedalHold10PlusSec(RoverContext ctx) { unhandled("Left pedal held >= 10s"); }

    default void rightPedalTapOnce(RoverContext ctx) { unhandled("Right pedal tapped once"); }
    default void rightPedalHold3Sec(RoverContext ctx) { unhandled("Right pedal held >= 3s"); }
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
    default void flipSwitchOn(RoverContext ctx) { unhandled("Flip switch ON"); }
    default void flipSwitchOff(RoverContext ctx) { unhandled("Flip switch OFF"); }

    default void leftButtonHold(RoverContext ctx) { unhandled("Left button held"); }
    default void leftButtonDoubleTapHold(RoverContext ctx) { unhandled("Left button tap + hold"); }
    default void rightButtonHold(RoverContext ctx) { unhandled("Right button held"); }
    default void rightButtonDoubleTapHold(RoverContext ctx) { unhandled("Right button tap + hold"); }
    default void releaseButtons(RoverContext ctx) { unhandled("Buttons released"); }

    // Internal Condition Events
    default void reachZeroSpeed(RoverContext ctx) { unhandled("Vehicle reached zero speed"); }

    default void unhandled(String event) {
        System.out.println("  (Ignored '" + event + "' in state: " + getStateName() + ")");
    }


}
