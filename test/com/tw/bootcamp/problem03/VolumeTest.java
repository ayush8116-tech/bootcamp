package com.tw.bootcamp.problem03;

import org.junit.jupiter.api.Test;
import static com.tw.bootcamp.problem03.VolumeUnits.*;
import static org.junit.jupiter.api.Assertions.*;

class VolumeTest {
    @Test
    void shouldReturnTrue_whenComparesVolumeOf1GallonTo3point78Liter() {
        Volume gallon = Volume.create(1, GALLON);
        Volume liters = Volume.create(3.78, LITER);

        assertTrue(gallon.isEqualTo(liters));
    }

    @Test
    void shouldReturnFalse_whenComparesVolumeOf1GallonTo4Liter() {
        Volume gallon = Volume.create(1, GALLON);
        Volume liters = Volume.create(4, LITER);

        assertFalse(gallon.isEqualTo(liters));
    }

    @Test
    void shouldThrowError_whenVolumeValueIsNegative() {
        assertThrows(InvalidValueException.class, () -> {
            Volume.create(-1, LITER);
        });
    }
}
