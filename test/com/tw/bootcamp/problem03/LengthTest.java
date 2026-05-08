package com.tw.bootcamp.problem03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthTest {
    @Test
    void shouldReturnTrue_whenComparing1ftTo12Inch() {
        Length oneFt = new Length(1, UnitProportions.FEET);
        Length twelveInches = new Length(12, UnitProportions.INCH);

        assertTrue(oneFt.compare(twelveInches));
    }

    @Test
    void shouldReturnFalse_whenComparing1ftTo11Inch() {
        Length oneFt = new Length(1, UnitProportions.FEET);
        Length twelveInches = new Length(11, UnitProportions.INCH);

        assertFalse(oneFt.compare(twelveInches));
    }

    @Test
    void shouldReturnTrue_whenComparing5CmTo2Inch() {
        Length fiveCm = new Length(5, UnitProportions.CM);
        Length twoInch = new Length(2, UnitProportions.INCH);

        assertTrue(fiveCm.compare(twoInch));
    }

    @Test
    void shouldReturnFalse_whenComparing4CmTo2Inch() {
        Length fourCm = new Length(4, UnitProportions.CM);
        Length twoInch = new Length(2, UnitProportions.INCH);

        assertFalse(fourCm.compare(twoInch));
    }

    @Test
    void shouldReturnTrue_whenComparing1cmWith10mm() {
        Length oneCm = new Length(1, UnitProportions.CM);
        Length tenMm = new Length(10, UnitProportions.MM);

        assertTrue(oneCm.compare(tenMm));
    }

    @Test
    void shouldReturnFalse_whenComparing1cmWith9mm() {
        Length oneCm = new Length(1, UnitProportions.CM);
        Length nineMM = new Length(9, UnitProportions.MM);

        assertFalse(oneCm.compare(nineMM));
    }

}