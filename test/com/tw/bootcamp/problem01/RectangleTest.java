package com.tw.bootcamp.problem01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void shouldReturnTheAreaOfRectangleHavingDimension2by5() {
        Shape shape = new Rectangle(2, 5);
        assertEquals(10, shape.area());
    }

    @Test
    void shouldReturnTheAreaOfRectangleHavingDimension0by5() {
        Shape shape = new Rectangle(0, 5);
        assertEquals(0, shape.area());
    }
}