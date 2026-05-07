package com.tw.bootcamp.problem01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    @Test
    void shouldReturnTheAreaWithSide2() {
        Shape square = new Square(2);
        assertEquals(4,square.area());
    }

    @Test
    void shouldReturnTheAreaWithSide0() {
        Shape square = new Square(0);
        assertEquals(0,square.area());
    }

    @Test
    void shouldReturnThePerimeterWithSide2() {
        Shape square = new Square(2);
        assertEquals(8,square.perimeter());
    }

    @Test
    void shouldReturnThePerimeterWithSide0() {
        Shape square = new Square(0);
        assertEquals(0,square.perimeter());
    }
}