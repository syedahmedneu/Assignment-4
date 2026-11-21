/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment4.singleton_pattern;

/**
 *
 * @author syedahmed
 */
public class ShapeSingleton {

    private static ShapeSingleton instance = new ShapeSingleton();
    private ShapeSingleton(){}

    public static ShapeSingleton getInstance(){
        return instance;
    }
    
    public void showMessage(){
        System.out.println("Single Object created");
    }
}
