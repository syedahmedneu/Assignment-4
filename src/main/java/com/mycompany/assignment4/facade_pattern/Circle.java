/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment4.facade_pattern;

/**
 * Facade-pattern shape that draws a circle.
 *
 * @author syedahmed
 * @version 1.0
 */
public class Circle implements Shape{

    /** Prints that a circle was drawn. */
    @Override
    public void draw() {
        System.out.println("Circle Drawn");
    }
    
}
