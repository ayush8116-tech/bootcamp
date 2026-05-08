package com.tw.bootcamp.problem03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthTest {
    @Test
    void shouldReturnTrue_whenComparing1ftTo12Inch() {
        Length oneFt = Length.createFeetLength(1);
        Length twelveInches = Length.createInchLength(12);

        assertTrue(oneFt.isEqualTo(twelveInches));
    }

    @Test
    void shouldReturnFalse_whenComparing1ftTo11Inch() {
        Length oneFt = Length.createFeetLength(1);
        Length twelveInches = Length.createInchLength(11);

        assertFalse(oneFt.isEqualTo(twelveInches));
    }

    @Test
    void shouldReturnTrue_whenComparing5CmTo2Inch() {
        Length fiveCm = Length.createCentimeterLength(5);
        Length twoInch = Length.createInchLength(2);

        assertTrue(fiveCm.isEqualTo(twoInch));
    }

    @Test
    void shouldReturnFalse_whenComparing4CmTo2Inch() {
        Length fourCm = Length.createCentimeterLength(4);
        Length twoInch = Length.createInchLength(2);

        assertFalse(fourCm.isEqualTo(twoInch));
    }

    @Test
    void shouldReturnTrue_whenComparing1cmWith10mm() {
        Length oneCm = Length.createCentimeterLength(1);
        Length tenMm = Length.createMillimeterLength(10);

        assertTrue(oneCm.isEqualTo(tenMm));
    }

    @Test
    void shouldReturnFalse_whenComparing1cmWith9mm() {
        Length oneCm = Length.createCentimeterLength(1);
        Length nineMM = Length.createMillimeterLength(9);

        assertFalse(oneCm.isEqualTo(nineMM));
    }

    @Test
    void shouldReturn4inch_whenAdding2inchWith2Inch() {
        Length length1 = Length.createInchLength(2);
        Length length2 = Length.createInchLength(2);
        Length result = length1.add(length2);

        Length expectedLength = Length.createInchLength(4);
        assertEquals(expectedLength, result);

    }
}
