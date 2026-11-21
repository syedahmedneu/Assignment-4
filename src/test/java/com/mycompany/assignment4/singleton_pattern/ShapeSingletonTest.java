/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.assignment4.singleton_pattern;

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
public class ShapeSingletonTest {
    
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStream));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(originalOut);
    }

    @Test
    public void testGetInstanceNotNull() {
        ShapeSingleton instance = ShapeSingleton.getInstance();
        assertNotNull(instance);
    }

    @Test
    public void testSameInstanceReturned() {
        ShapeSingleton firstInstance = ShapeSingleton.getInstance();
        ShapeSingleton secondInstance = ShapeSingleton.getInstance();
        assertSame(firstInstance, secondInstance);
    }

    @Test
    public void testShowMessageOutput() {
        ShapeSingleton instance = ShapeSingleton.getInstance();
        instance.showMessage();
        assertEquals("Single Object created", outputStream.toString().trim());
    }


    
}
