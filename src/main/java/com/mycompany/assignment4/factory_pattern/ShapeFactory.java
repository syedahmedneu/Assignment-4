/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment4.factory_pattern;

/**
 *
 * @author syedahmed
 */
public class ShapeFactory {
    
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
