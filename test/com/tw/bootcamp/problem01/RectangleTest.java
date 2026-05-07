package com.tw.bootcamp.problem01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void area() {
        Shape shape = new Rectangle(2, 5);
        assertEquals(10, shape.area());
    }
}