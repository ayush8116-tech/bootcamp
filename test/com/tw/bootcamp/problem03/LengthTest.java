package com.tw.bootcamp.problem03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthTest {
    @Test
    void shouldReturnTrue_whenComparing1ftTo12Inch() {
        Length oneFt = Length.create(1, LengthUnits.FEET);
        Length twelveInches = Length.create(12, LengthUnits.INCH);

        assertTrue(oneFt.isEqualTo(twelveInches));
    }

    @Test
    void shouldReturnFalse_whenComparing1ftTo11Inch() {
        Length oneFt = Length.create(1, LengthUnits.FEET);
        Length twelveInches = Length.create(11, LengthUnits.INCH);

        assertFalse(oneFt.isEqualTo(twelveInches));
    }

    @Test
    void shouldReturnTrue_whenComparing5CmTo2Inch() {
        Length fiveCm = Length.create(5, LengthUnits.CM);
        Length twoInch = Length.create(2, LengthUnits.INCH);

        assertTrue(fiveCm.isEqualTo(twoInch));
    }

    @Test
    void shouldReturnFalse_whenComparing4CmTo2Inch() {
        Length fourCm = Length.create(4, LengthUnits.CM);
        Length twoInch = Length.create(2, LengthUnits.INCH);

        assertFalse(fourCm.isEqualTo(twoInch));
    }

    @Test
    void shouldReturnTrue_whenComparing1cmWith10mm() {
        Length oneCm = Length.create(1, LengthUnits.CM);
        Length tenMm = Length.create(10, LengthUnits.MM);

        assertTrue(oneCm.isEqualTo(tenMm));
    }

    @Test
    void shouldReturnFalse_whenComparing1cmWith9mm() {
        Length oneCm = Length.create(1, LengthUnits.CM);
        Length nineMM = Length.create(9, LengthUnits.MM);

        assertFalse(oneCm.isEqualTo(nineMM));
    }

    @Test
    void shouldReturn4inch_whenAdding2inchWith2Inch() {
        Length length1 = Length.create(2, LengthUnits.INCH);
        Length length2 = Length.create(2, LengthUnits.INCH);
        Length result = length1.add(length2);

        Length expectedLength = Length.create(4, LengthUnits.INCH);
        assertEquals(expectedLength, result);
    }

    @Test
    void shouldReturn3inch_whenAdding2inchWith2point5Cm() {
        Length length1 = Length.create(2, LengthUnits.INCH);
        Length length2 = Length.create(2.5, LengthUnits.CM);

        Length result = length1.add(length2);

        Length expectedLength = Length.create(3, LengthUnits.INCH);
        assertEquals(expectedLength, result);
    }
}
