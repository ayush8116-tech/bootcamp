package com.tw.bootcamp.problem03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthTest {
    @Test
    void shouldReturnTrue_whenComparing1ftTo12Inch() {
        Length oneFt = Length.createFeetLength(1);
        Length twelveInches = Length.createInchLength(12);

        assertTrue(oneFt.compare(twelveInches));
    }

    @Test
    void shouldReturnFalse_whenComparing1ftTo11Inch() {
        Length oneFt = Length.createFeetLength(1);
        Length twelveInches = Length.createInchLength(11);

        assertFalse(oneFt.compare(twelveInches));
    }

    @Test
    void shouldReturnTrue_whenComparing5CmTo2Inch() {
        Length fiveCm = Length.createCentimeterLength(5);
        Length twoInch = Length.createInchLength(2);

        assertTrue(fiveCm.compare(twoInch));
    }

    @Test
    void shouldReturnFalse_whenComparing4CmTo2Inch() {
        Length fourCm = Length.createCentimeterLength(4);
        Length twoInch = Length.createInchLength(2);

        assertFalse(fourCm.compare(twoInch));
    }

    @Test
    void shouldReturnTrue_whenComparing1cmWith10mm() {
        Length oneCm = Length.createCentimeterLength(1);
        Length tenMm = Length.createMillimeterLength(10);

        assertTrue(oneCm.compare(tenMm));
    }

    @Test
    void shouldReturnFalse_whenComparing1cmWith9mm() {
        Length oneCm = Length.createCentimeterLength(1);
        Length nineMM = Length.createMillimeterLength(9);

        assertFalse(oneCm.compare(nineMM));
    }

}