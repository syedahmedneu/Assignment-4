/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment4.singleton_pattern;

import com.mycompany.assignment4.factory_pattern.*;

/**
 *
 * @author syedahmed
 */
public class Main {
    public static void main(String[] args){
        
        ShapeSingleton shapeSingleton = ShapeSingleton.getInstance();
        
        shapeSingleton.showMessage();
    }
}
