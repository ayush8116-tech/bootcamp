package com.tw.bootcamp.problem03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class FeetTest {
    @Test
    void shouldReturnTrue_whenCompares12inchTo1ft() {
        Feet feet = new Feet(1);
        Inch inch = new Inch(12);

        assertTrue(feet.compare(inch));
    }
}