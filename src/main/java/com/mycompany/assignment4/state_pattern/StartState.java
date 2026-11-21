/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment4.state_pattern;

/**
 *
 * @author syedahmed
 */
public class StartState implements State {

    @Override
    public void doAction(Context context) {
        
        System.out.println("Game is in start state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Start State";
    }
    
    
    
}
