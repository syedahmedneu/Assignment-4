/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment4.moon_rover;

import com.mycompany.assignment4.state_pattern.*;

/**
 * Context for the rover state machine; delegates each input to the current state.
 *
 * @author syedahmed
 * @version 1.0
 */
public class RoverContext {
   
    /** Current state; changes on transitions so behavior varies without conditionals. */
    private RoverState currentState;

    /** Creates the rover in the Off state. */
    public RoverContext() {
        this.currentState = new OffState();
        System.out.println("System initialized in state: " + currentState.getStateName());
    }

    /**
     * Transitions to a new state.
     *
     * @param newState the state to enter
     */
    public void setState(RoverState newState) {
        this.currentState = newState;
        System.out.println("--> Transitioned to: " + currentState.getStateName());
    }

    /**
     * Gets the current state.
     *
     * @return the current state
     */
    public RoverState getState() {
        return currentState;
    }

    // Delegate all hardware inputs to the current state
    /** Delegates the left pedal tap input to the current state. */
    public void leftPedalTapOnce() { currentState.leftPedalTapOnce(this); }
    /** Delegates the left pedal double tap input to the current state. */
    public void leftPedalTapTwice() { currentState.leftPedalTapTwice(this); }
    /** Delegates the left pedal 3s hold input to the current state. */
    public void leftPedalHold3Sec() { currentState.leftPedalHold3Sec(this); }
    /** Delegates the left pedal 5-10s hold input to the current state. */
    public void leftPedalHold5To10Sec() { currentState.leftPedalHold5To10Sec(this); }
    /** Delegates the left pedal 10s+ hold input to the current state. */
    public void leftPedalHold10PlusSec() { currentState.leftPedalHold10PlusSec(this); }

    /** Delegates the right pedal tap input to the current state. */
    public void rightPedalTapOnce() { currentState.rightPedalTapOnce(this); }
    /** Delegates the right pedal 3s hold input to the current state. */
    public void rightPedalHold3Sec() { currentState.rightPedalHold3Sec(this); }
    /** Delegates the right pedal 5s hold input to the current state. */
    public void rightPedalHold5Sec() { currentState.rightPedalHold5Sec(this); }

    /** Delegates the switch-on input to the current state. */
    public void flipSwitchOn() { currentState.flipSwitchOn(this); }
    /** Delegates the switch-off input to the current state. */
    public void flipSwitchOff() { currentState.flipSwitchOff(this); }

    /** Delegates the left button hold input to the current state. */
    public void leftButtonHold() { currentState.leftButtonHold(this); }
    /** Delegates the left button tap-and-hold input to the current state. */
    public void leftButtonDoubleTapHold() { currentState.leftButtonDoubleTapHold(this); }
    /** Delegates the right button hold input to the current state. */
    public void rightButtonHold() { currentState.rightButtonHold(this); }
    /** Delegates the right button tap-and-hold input to the current state. */
    public void rightButtonDoubleTapHold() { currentState.rightButtonDoubleTapHold(this); }
    /** Delegates the button release input to the current state. */
    public void releaseButtons() { currentState.releaseButtons(this); }

    /** Delegates the zero-speed input to the current state. */
    public void reachZeroSpeed() { currentState.reachZeroSpeed(this); }

    
    
}
