/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment4.factory_pattern;

/**
 * Factory that creates shapes from a type name.
 *
 * @author syedahmed
 * @version 1.0
 */
public class ShapeFactory {
    
    /**
     * Creates a shape for the given type name (case-insensitive).
     *
     * @param shapeType "Circle", "Rectangle" or "Square"; may be null
     * @return the new shape, or null if the type is null or unknown
     */
    public Shape getShape(String shapeType){
        if (shapeType!= null && shapeType.equalsIgnoreCase("Circle")){
            return new Circle();
        }
        else if (shapeType!= null && shapeType.equalsIgnoreCase("Rectangle")){
            return new Rectangle();
        }
        else if (shapeType!= null && shapeType.equalsIgnoreCase("Square")){
            return new Square();
        }
        else return null;
    }
    
}
