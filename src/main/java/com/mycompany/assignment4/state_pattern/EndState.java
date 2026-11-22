/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment4.state_pattern;

/**
 * State representing the end of the game.
 *
 * @author syedahmed
 * @version 1.0
 */
public class EndState implements State{

    /**
     * Prints an end message and sets this as the current state.
     *
     * @param context the context to update
     */
    @Override
    public void doAction(Context context) {
        System.out.println("Game is in End state");
        context.setState(this);
    }
    
    /**
     * Gets the state name.
     *
     * @return "End State"
     */
        @Override
    public String toString() {
        return "End State";
    }
    
}
