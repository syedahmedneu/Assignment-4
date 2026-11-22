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
 * Tests for {@link ShapeMaker}.
 *
 * @author syedahmed
 * @version 1.0
 */
public class ShapeMakerTest {
    /** Captures console output for assertions. */
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    /** Original stdout, restored after each test. */
    private final PrintStream originalOut = System.out;
    /** Facade under test. */
    private ShapeMaker shapeMaker;
    
    /** Default constructor. */
    public ShapeMakerTest() {
    }
    
    /** Class-level setup (none needed). */
    @BeforeAll
    public static void setUpClass() {
        
    }
    
    /** Class-level teardown (none needed). */
    @AfterAll
    public static void tearDownClass() {
    }
    
    /** Redirects stdout and creates the facade. */
    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStream));
        shapeMaker = new ShapeMaker();

    }
    
    /** Restores stdout. */
    @AfterEach
    public void tearDown() {
        System.setOut(originalOut);

    }

    /** Verifies drawCircle output. */
    @Test
    public void testDrawCircle() {
        shapeMaker.drawCircle();
        assertEquals("Circle Drawn", outputStream.toString().trim());
    }

    /** Verifies drawRectangle output. */
    @Test
    public void testDrawRectangle() {
        shapeMaker.drawRectangle();
        assertEquals("Rectangle Drawn", outputStream.toString().trim());
    }

    /** Verifies drawSquare output. */
    @Test
    public void testDrawSquare() {
        shapeMaker.drawSquare();
        assertEquals("Square Drawn", outputStream.toString().trim());
    }
    
}
