/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.assignment4.state_pattern;

/**
 * State contract for the simple state pattern demo.
 *
 * @author syedahmed
 * @version 1.0
 */
public interface State {
    /**
     * Performs the state's action and sets it as the context's state.
     *
     * @param context the context to update
     */
    public void doAction(Context context);
}
