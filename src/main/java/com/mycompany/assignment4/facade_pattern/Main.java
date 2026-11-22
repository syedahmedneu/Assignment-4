/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment4.facade_pattern;

/**
 * Demo of the facade pattern: draws shapes only through {@link ShapeMaker}.
 *
 * @author syedahmed
 * @version 1.0
 */
public class Main {
    
    /**
     * Draws a circle, square and rectangle via the facade.
     *
     * @param args command-line arguments (unused)
     */
    public static void main(String[] args){
        ShapeMaker shapeMaker = new ShapeMaker();
        
        shapeMaker.drawCircle();
        shapeMaker.drawSquare();
        shapeMaker.drawRectangle();
    }
    
}
