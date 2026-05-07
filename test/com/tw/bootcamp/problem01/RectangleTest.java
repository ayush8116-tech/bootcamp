package com.tw.bootcamp.problem01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void shouldReturnAreaOf10_whenDimensionsAre2by5() {
        Shape rectangle = Rectangle.createRectangle(2, 5);
        assertEquals(10, rectangle.area());
    }

    @Test
    void shouldReturnAreaOf0_whenDimensionsAre0by5() {
        Shape rectangle = Rectangle.createRectangle(0, 5);
        assertEquals(0, rectangle.area());
    }

    @Test
    void shouldReturnPerimeterOf14_whenDimensionsAre2by5() {
        Shape rectangle = Rectangle.createRectangle(2, 5);
        assertEquals(14, rectangle.perimeter());
    }

    @Test
    void shouldReturnPerimeterOf10_whenDimensionsAre0by5() {
        Shape rectangle = Rectangle.createRectangle(0, 5);
        assertEquals(10, rectangle.perimeter());
    }
}
