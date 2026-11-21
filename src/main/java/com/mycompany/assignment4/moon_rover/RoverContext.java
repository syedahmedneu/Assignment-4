/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment4.moon_rover;

import com.mycompany.assignment4.state_pattern.*;

/**
 *
 * @author syedahmed
 */
public class RoverContext {
   
    private RoverState currentState;

    public RoverContext() {
        this.currentState = new OffState();
        System.out.println("System initialized in state: " + currentState.getStateName());
    }

    public void setState(RoverState newState) {
        this.currentState = newState;
        System.out.println("--> Transitioned to: " + currentState.getStateName());
    }

    public RoverState getState() {
        return currentState;
    }

    // Delegate all hardware inputs to the current state
    public void leftPedalTapOnce() { currentState.leftPedalTapOnce(this); }
    public void leftPedalTapTwice() { currentState.leftPedalTapTwice(this); }
    public void leftPedalHold3Sec() { currentState.leftPedalHold3Sec(this); }
    public void leftPedalHold5To10Sec() { currentState.leftPedalHold5To10Sec(this); }
    public void leftPedalHold10PlusSec() { currentState.leftPedalHold10PlusSec(this); }

    public void rightPedalTapOnce() { currentState.rightPedalTapOnce(this); }
    public void rightPedalHold3Sec() { currentState.rightPedalHold3Sec(this); }
    public void rightPedalHold5Sec() { currentState.rightPedalHold5Sec(this); }

    public void flipSwitchOn() { currentState.flipSwitchOn(this); }
    public void flipSwitchOff() { currentState.flipSwitchOff(this); }

    public void leftButtonHold() { currentState.leftButtonHold(this); }
    public void leftButtonDoubleTapHold() { currentState.leftButtonDoubleTapHold(this); }
    public void rightButtonHold() { currentState.rightButtonHold(this); }
    public void rightButtonDoubleTapHold() { currentState.rightButtonDoubleTapHold(this); }
    public void releaseButtons() { currentState.releaseButtons(this); }

    public void reachZeroSpeed() { currentState.reachZeroSpeed(this); }

    
    
}
