/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment4.state_pattern;

/**
 * State representing the start of the game.
 *
 * @author syedahmed
 * @version 1.0
 */
public class StartState implements State {

    /**
     * Prints a start message and sets this as the current state.
     *
     * @param context the context to update
     */
    @Override
    public void doAction(Context context) {
        
        System.out.println("Game is in start state");
        context.setState(this);
    }

    /**
     * Gets the state name.
     *
     * @return "Start State"
     */
    @Override
    public String toString() {
        return "Start State";
    }
    
    
    
}
