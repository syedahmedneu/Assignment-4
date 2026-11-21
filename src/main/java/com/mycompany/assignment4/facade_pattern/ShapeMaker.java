/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment4.facade_pattern;

/**
 *
 * @author syedahmed
 */
public class ShapeMaker {
    
    private Shape circle;
    private Shape rectangle;
    private Shape square;
    
    public ShapeMaker(){
        circle = new Circle();
        square = new Square();
        rectangle = new Rectangle();
    }
    
    public void drawCircle(){
        circle.draw();
    }
    
    public void drawRectangle(){
        rectangle.draw();
    }
    
    public void drawSquare(){
        square.draw();
    }
    
}
