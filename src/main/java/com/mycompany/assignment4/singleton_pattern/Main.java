/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment4.singleton_pattern;

import com.mycompany.assignment4.factory_pattern.*;

/**
 * Demo of the singleton pattern.
 *
 * @author syedahmed
 * @version 1.0
 */
public class Main {
    /**
     * Gets the singleton and shows its message.
     *
     * @param args command-line arguments (unused)
     */
    public static void main(String[] args){
        
        ShapeSingleton shapeSingleton = ShapeSingleton.getInstance();
        
        shapeSingleton.showMessage();
    }
}
