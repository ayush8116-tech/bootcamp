package com.tw.bootcamp.problem03;

import org.junit.jupiter.api.Test;

import static com.tw.bootcamp.problem03.LengthUnits.*;
import static org.junit.jupiter.api.Assertions.*;

class LengthTest {
    @Test
    void shouldReturnTrue_whenComparing1ftTo12Inch() {
        Length oneFt = Length.create(1, FEET);
        Length twelveInches = Length.create(12, INCH);

        assertTrue(oneFt.isEqualTo(twelveInches));
    }

    @Test
    void shouldReturnFalse_whenComparing1ftTo11Inch() {
        Length oneFt = Length.create(1, FEET);
        Length twelveInches = Length.create(11, INCH);

        assertFalse(oneFt.isEqualTo(twelveInches));
    }

    @Test
    void shouldReturnTrue_whenComparing5CmTo2Inch() {
        Length fiveCm = Length.create(5, CM);
        Length twoInch = Length.create(2, INCH);

        assertTrue(fiveCm.isEqualTo(twoInch));
    }

    @Test
    void shouldReturnFalse_whenComparing4CmTo2Inch() {
        Length fourCm = Length.create(4, CM);
        Length twoInch = Length.create(2, INCH);

        assertFalse(fourCm.isEqualTo(twoInch));
    }

    @Test
    void shouldReturnTrue_whenComparing1cmWith10mm() {
        Length oneCm = Length.create(1, CM);
        Length tenMm = Length.create(10, MM);

        assertTrue(oneCm.isEqualTo(tenMm));
    }

    @Test
    void shouldReturnFalse_whenComparing1cmWith9mm() {
        Length oneCm = Length.create(1, CM);
        Length nineMM = Length.create(9, MM);

        assertFalse(oneCm.isEqualTo(nineMM));
    }

    @Test
    void shouldReturn4inch_whenAdding2inchWith2Inch() {
        Length length1 = Length.create(2, INCH);
        Length length2 = Length.create(2, INCH);
        Length result = length1.add(length2);

        Length expectedLength = Length.create(4, INCH);
        assertEquals(expectedLength, result);
    }

    @Test
    void shouldReturn3inch_whenAdding2inchWith2point5Cm() {
        Length length1 = Length.create(2, INCH);
        Length length2 = Length.create(2.5, CM);

        Length result = length1.add(length2);

        Length expectedLength = Length.create(3, INCH);
        assertEquals(expectedLength, result);
    }

    @Test
    void shouldReturn10inch_whenAdding6inchWith100mm() {
        Length length1 = Length.create(6, INCH);
        Length length2 = Length.create(100, MM);

        Length result = length1.add(length2);

        Length expectedLength = Length.create(10, INCH);
        assertEquals(expectedLength, result);
    }

    @Test
    void shouldThrowError_whenLengthValueIsNegative() {
        assertThrows(InvalidValueException.class, () -> {
            Length.create(-1, INCH);
        });
    }
}
