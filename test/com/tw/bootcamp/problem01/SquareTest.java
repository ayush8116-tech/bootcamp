package com.tw.bootcamp.problem01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    @Test
    void shouldReturnAreaOf4_whenSideLengthIs2() {
        Rectangle square = Rectangle.createSquare(2);
        assertEquals(4,square.area());
    }

    @Test
    void shouldReturnAreaOf0_whenSideLengthIs0() {
        Rectangle square = Rectangle.createSquare(0);
        assertEquals(0,square.area());
    }

    @Test
    void shouldReturnAreaOf4point84_whenSideLengthIs2point2() {
        Rectangle square = Rectangle.createSquare(2.2);
        assertEquals(4.84,square.area(), 0.1);
    }

    @Test
    void shouldReturnPerimeterOf8_whenSideLengthIs2() {
        Rectangle square = Rectangle.createSquare(2);
        assertEquals(8,square.perimeter());
    }

    @Test
    void shouldReturnPerimeterOf0_whenSideLengthIs0() {
        Rectangle square = Rectangle.createSquare(0);
        assertEquals(0,square.perimeter());
    }

    @Test
    void shouldReturnPerimeterOf8point8_whenSideLengthIs2point2() {
        Rectangle square = Rectangle.createSquare(2.2);
        assertEquals(8.8, square.perimeter());
    }
}
