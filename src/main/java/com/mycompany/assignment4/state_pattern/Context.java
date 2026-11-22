/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment4.state_pattern;

/**
 * Holds the current {@link State}.
 *
 * @author syedahmed
 * @version 1.0
 */
public class Context {
    /** Current state; null until a state sets itself. */
    private State state;
    
    /** Creates a context with no state. */
    public Context(){
        this.state = null;
    }

    /**
     * Gets the current state.
     *
     * @return the state, or null if none set
     */
    public State getState() {
        return state;
    }

    /**
     * Sets the current state.
     *
     * @param state the new state
     */
    public void setState(State state) {
        this.state = state;
    }
    
    
    
}
