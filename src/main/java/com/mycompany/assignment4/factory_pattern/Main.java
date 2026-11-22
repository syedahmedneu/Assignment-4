/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment4.factory_pattern;

/**
 * Demo of the factory pattern: requests shapes by name and draws them.
 *
 * @author syedahmed
 * @version 1.0
 */
public class Main {
    /**
     * Obtains and draws a circle, rectangle and square.
     *
     * @param args command-line arguments (unused)
     */
    public static void main(String[] args){
        
        ShapeFactory shapeFactory = new ShapeFactory();
        
        Shape circle = shapeFactory.getShape("Circle");
        Shape rectangle = shapeFactory.getShape("Rectangle");
        Shape square = shapeFactory.getShape("Square");
        
        circle.draw();
        rectangle.draw();
        square.draw();
    }
}
