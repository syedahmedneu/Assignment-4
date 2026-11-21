/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.assignment4.state_pattern;

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
public class MainTest {
    
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private Context context;

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStream));
        context = new Context();
    }

    @AfterEach
    public void tearDown() {
        System.setOut(originalOut);
    }

    @Test
    public void testInitialContextStateIsNull() {
        assertNull(context.getState());
    }

    @Test
    public void testStateTransitionStartToEnd() {
        StartState startState = new StartState();
        EndState endState = new EndState();

        startState.doAction(context);
        assertInstanceOf(StartState.class, context.getState());
        assertEquals("Start State", context.getState().toString());

        endState.doAction(context);
        assertInstanceOf(EndState.class, context.getState());
        assertEquals("End State", context.getState().toString());
    }

    
}
