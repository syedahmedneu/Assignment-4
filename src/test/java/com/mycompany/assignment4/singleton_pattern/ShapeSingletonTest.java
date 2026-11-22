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
 * Tests for {@link ShapeSingleton}.
 *
 * @author syedahmed
 * @version 1.0
 */
public class ShapeSingletonTest {
    
    /** Captures console output for assertions. */
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    /** Original stdout, restored after each test. */
    private final PrintStream originalOut = System.out;

    /** Redirects stdout. */
    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStream));
    }

    /** Restores stdout. */
    @AfterEach
    public void tearDown() {
        System.setOut(originalOut);
    }

    /** Verifies an instance is returned. */
    @Test
    public void testGetInstanceNotNull() {
        ShapeSingleton instance = ShapeSingleton.getInstance();
        assertNotNull(instance);
    }

    /** Verifies the same instance is always returned. */
    @Test
    public void testSameInstanceReturned() {
        ShapeSingleton firstInstance = ShapeSingleton.getInstance();
        ShapeSingleton secondInstance = ShapeSingleton.getInstance();
        assertSame(firstInstance, secondInstance);
    }

    /** Verifies the message output. */
    @Test
    public void testShowMessageOutput() {
        ShapeSingleton instance = ShapeSingleton.getInstance();
        instance.showMessage();
        assertEquals("Single Object created", outputStream.toString().trim());
    }


    
}
