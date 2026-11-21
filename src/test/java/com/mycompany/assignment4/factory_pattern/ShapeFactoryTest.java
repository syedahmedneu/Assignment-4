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
 *
 * @author syedahmed
 */
public class ShapeFactoryTest {

    private ShapeFactory shapeFactory;

    @BeforeEach
    public void setUp() {
        shapeFactory = new ShapeFactory();
    }

    @Test
    public void testGetCircle() {
        Shape shape = shapeFactory.getShape("CIRCLE");
        assertNotNull(shape);
        assertInstanceOf(Circle.class, shape);
    }

    @Test
    public void testGetRectangle() {
        Shape shape = shapeFactory.getShape("RECTANGLE");
        assertNotNull(shape);
        assertInstanceOf(Rectangle.class, shape);
    }

    @Test
    public void testGetSquare() {
        Shape shape = shapeFactory.getShape("SQUARE");
        assertNotNull(shape);
        assertInstanceOf(Square.class, shape);
    }

    @Test
    public void testCaseInsensitivity() {
        Shape shape = shapeFactory.getShape("circle");
        assertNotNull(shape);
        assertInstanceOf(Circle.class, shape);
    }

    @Test
    public void testInvalidShapeType() {
        Shape shape = shapeFactory.getShape("HEXAGON");
        assertNull(shape);
    }

    @Test
    public void testNullInput() {
        Shape shape = shapeFactory.getShape(null);
        assertNull(shape);

    }

}
