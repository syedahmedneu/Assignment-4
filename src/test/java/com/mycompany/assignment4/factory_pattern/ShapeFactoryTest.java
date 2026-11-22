/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.assignment4.factory_pattern;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for {@link ShapeFactory}.
 *
 * @author syedahmed
 * @version 1.0
 */
public class ShapeFactoryTest {

    /** Factory under test. */
    private ShapeFactory shapeFactory;

    /** Creates a fresh factory. */
    @BeforeEach
    public void setUp() {
        shapeFactory = new ShapeFactory();
    }

    /** Verifies a circle is created. */
    @Test
    public void testGetCircle() {
        Shape shape = shapeFactory.getShape("CIRCLE");
        assertNotNull(shape);
        assertInstanceOf(Circle.class, shape);
    }

    /** Verifies a rectangle is created. */
    @Test
    public void testGetRectangle() {
        Shape shape = shapeFactory.getShape("RECTANGLE");
        assertNotNull(shape);
        assertInstanceOf(Rectangle.class, shape);
    }

    /** Verifies a square is created. */
    @Test
    public void testGetSquare() {
        Shape shape = shapeFactory.getShape("SQUARE");
        assertNotNull(shape);
        assertInstanceOf(Square.class, shape);
    }

    /** Verifies type names ignore case. */
    @Test
    public void testCaseInsensitivity() {
        Shape shape = shapeFactory.getShape("circle");
        assertNotNull(shape);
        assertInstanceOf(Circle.class, shape);
    }

    /** Verifies unknown types return null. */
    @Test
    public void testInvalidShapeType() {
        Shape shape = shapeFactory.getShape("HEXAGON");
        assertNull(shape);
    }

    /** Verifies null input returns null. */
    @Test
    public void testNullInput() {
        Shape shape = shapeFactory.getShape(null);
        assertNull(shape);

    }

}
