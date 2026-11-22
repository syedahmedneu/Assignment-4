/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment4.facade_pattern;

/**
 * Facade that hides the concrete shape classes behind simple draw methods.
 *
 * @author syedahmed
 * @version 1.0
 */
public class ShapeMaker {
    
    /** Circle instance, held privately so clients never depend on the concrete class. */
    private Shape circle;
    /** Rectangle instance, held privately so clients never depend on the concrete class. */
    private Shape rectangle;
    /** Square instance, held privately so clients never depend on the concrete class. */
    private Shape square;
    
    /** Creates the facade and instantiates each shape once. */
    public ShapeMaker(){
        circle = new Circle();
        square = new Square();
        rectangle = new Rectangle();
    }
    
    /** Draws a circle. */
    public void drawCircle(){
        circle.draw();
    }
    
    /** Draws a rectangle. */
    public void drawRectangle(){
        rectangle.draw();
    }
    
    /** Draws a square. */
    public void drawSquare(){
        square.draw();
    }
    
}
