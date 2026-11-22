/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment4.state_pattern;

/**
 * Demo of the state pattern: moves from start to end state.
 *
 * @author syedahmed
 * @version 1.0
 */
public class Main {
    
    /**
     * Runs start then end state, printing each.
     *
     * @param args command-line arguments (unused)
     */
    public static void main(String[] args){
        Context context = new Context();
        
        StartState startState = new StartState();
        startState.doAction(context);
        
        System.out.println(context.getState().toString());
        
        EndState endState = new EndState();
        endState.doAction(context);
        
        System.out.println(context.getState().toString());
        
    }
    
}
