package com.tw.bootcamp.problem03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ComparisonTest {
    @Test
    void shouldReturnTrue_whenCompares12inchTo1ft() {
        Feet feet = new Feet(1);
        Inch inch = new Inch(12);

        assertTrue(feet.compare(inch));
    }

    @Test
    void shouldReturnFalse_whenCompares11inchTo1ft() {
        Feet feet = new Feet(1);
        Inch inch = new Inch(11);

        assertFalse(feet.compare(inch));
    }

    @Test
    void shouldReturnTrue_whenCompares2inchTo5cm() {
        Inch inch = new Inch(2);
        Centimeter centimeter = new Centimeter(5);

        assertTrue(inch.compare(centimeter));
    }

    @Test
    void shouldReturnFalse_whenCompares2inchTo4cm() {
        Inch inch = new Inch(2);
        Centimeter centimeter = new Centimeter(4);

        assertFalse(inch.compare(centimeter));
    }
}
