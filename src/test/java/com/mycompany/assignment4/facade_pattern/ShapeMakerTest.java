/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.assignment4.facade_pattern;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author syedahmed
 */
public class ShapeMakerTest {
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private ShapeMaker shapeMaker;
    
    public ShapeMakerTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
        
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStream));
        shapeMaker = new ShapeMaker();

    }
    
    @AfterEach
    public void tearDown() {
        System.setOut(originalOut);

    }

    @Test
    public void testDrawCircle() {
        shapeMaker.drawCircle();
        assertEquals("Circle Drawn", outputStream.toString().trim());
    }

    @Test
    public void testDrawRectangle() {
        shapeMaker.drawRectangle();
        assertEquals("Rectangle Drawn", outputStream.toString().trim());
    }

    @Test
    public void testDrawSquare() {
        shapeMaker.drawSquare();
        assertEquals("Square Drawn", outputStream.toString().trim());
    }
    
}
