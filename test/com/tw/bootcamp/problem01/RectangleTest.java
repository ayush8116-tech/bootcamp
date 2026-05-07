package com.tw.bootcamp.problem01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void shouldReturnTheAreaOfRectangleHavingDimension2by5() {
        Shape rectangle = new Rectangle(2, 5);
        assertEquals(10, rectangle.area());
    }

    @Test
    void shouldReturnTheAreaOfRectangleHavingDimension0by5() {
        Shape rectangle = new Rectangle(0, 5);
        assertEquals(0, rectangle.area());
    }

    @Test
    void shouldReturnThePerimeterHavingDimension2by5() {
        Shape rectangle = new Rectangle(2, 5);
        assertEquals(14, rectangle.perimeter());
    }

    @Test
    void shouldReturnThePerimeterHavingDimension0by5() {
        Shape rectangle = new Rectangle(0, 5);
        assertEquals(10, rectangle.perimeter());
    }
}
