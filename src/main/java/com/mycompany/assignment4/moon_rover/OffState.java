/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment4.moon_rover;

/**
 *
 * @author syedahmed
 */
public class OffState implements RoverState {
    @Override
    public String getStateName() { return "Off"; }

    @Override
    public void rightPedalTapOnce(RoverContext ctx) {
        ctx.setState(new NotMovingState());
    }
}
