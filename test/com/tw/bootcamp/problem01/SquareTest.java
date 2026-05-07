package com.tw.bootcamp.problem01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    @Test
    void shouldReturnTheAreaWithSide2() {
        Rectangle square = Rectangle.createSquare(2);
        assertEquals(4,square.area());
    }

    @Test
    void shouldReturnTheAreaWithSide0() {
        Rectangle square = Rectangle.createSquare(0);
        assertEquals(0,square.area());
    }

    @Test
    void shouldReturnTheAreaWithSide2point2() {
        Rectangle square = Rectangle.createSquare(2.2);
        assertEquals(4.84,square.area(), 0.1);
    }

    @Test
    void shouldReturnThePerimeterWithSide2() {
        Rectangle square = Rectangle.createSquare(2);
        assertEquals(8,square.perimeter());
    }

    @Test
    void shouldReturnThePerimeterWithSide0() {
        Rectangle square = Rectangle.createSquare(0);
        assertEquals(0,square.perimeter());
    }

    @Test
    void shouldReturnThePerimeterWithSide2point2() {
        Rectangle square = Rectangle.createSquare(2.2);
        assertEquals(8.8, square.perimeter());
    }
}
