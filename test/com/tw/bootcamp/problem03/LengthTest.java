package com.tw.bootcamp.problem03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthTest {
    @Test
    void shouldReturnTrue_whenComparing1ftTo12Inch() {
        Length oneFt = Length.create(1, RatioToInch.FEET);
        Length twelveInches = Length.create(12, RatioToInch.INCH);

        assertTrue(oneFt.isEqualTo(twelveInches));
    }

    @Test
    void shouldReturnFalse_whenComparing1ftTo11Inch() {
        Length oneFt = Length.create(1, RatioToInch.FEET);
        Length twelveInches = Length.create(11, RatioToInch.INCH);

        assertFalse(oneFt.isEqualTo(twelveInches));
    }

    @Test
    void shouldReturnTrue_whenComparing5CmTo2Inch() {
        Length fiveCm = Length.create(5, RatioToInch.CM);
        Length twoInch = Length.create(2, RatioToInch.INCH);

        assertTrue(fiveCm.isEqualTo(twoInch));
    }

    @Test
    void shouldReturnFalse_whenComparing4CmTo2Inch() {
        Length fourCm = Length.create(4, RatioToInch.CM);
        Length twoInch = Length.create(2, RatioToInch.INCH);

        assertFalse(fourCm.isEqualTo(twoInch));
    }

    @Test
    void shouldReturnTrue_whenComparing1cmWith10mm() {
        Length oneCm = Length.create(1, RatioToInch.CM);
        Length tenMm = Length.create(10, RatioToInch.MM);

        assertTrue(oneCm.isEqualTo(tenMm));
    }

    @Test
    void shouldReturnFalse_whenComparing1cmWith9mm() {
        Length oneCm = Length.create(1, RatioToInch.CM);
        Length nineMM = Length.create(9, RatioToInch.MM);

        assertFalse(oneCm.isEqualTo(nineMM));
    }

    @Test
    void shouldReturn4inch_whenAdding2inchWith2Inch() {
        Length length1 = Length.create(2, RatioToInch.INCH);
        Length length2 = Length.create(2, RatioToInch.INCH);
        Length result = length1.add(length2);

        Length expectedLength = Length.create(4, RatioToInch.INCH);
        assertEquals(expectedLength, result);

    }
}
