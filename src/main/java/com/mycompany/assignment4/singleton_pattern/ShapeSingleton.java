/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment4.singleton_pattern;

/**
 * Singleton with exactly one shared instance.
 *
 * @author syedahmed
 * @version 1.0
 */
public class ShapeSingleton {

    /** The single instance, created eagerly so access is thread-safe without locking. */
    private static ShapeSingleton instance = new ShapeSingleton();
    /** Private constructor prevents outside instantiation. */
    private ShapeSingleton(){}

    /**
     * Gets the single instance.
     *
     * @return the shared instance
     */
    public static ShapeSingleton getInstance(){
        return instance;
    }
    
    /** Prints a message confirming the object exists. */
    public void showMessage(){
        System.out.println("Single Object created");
    }
}
