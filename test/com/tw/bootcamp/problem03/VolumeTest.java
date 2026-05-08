package com.tw.bootcamp.problem03;

import org.junit.jupiter.api.Test;

import static com.tw.bootcamp.problem03.VolumeUnits.GALLON;
import static com.tw.bootcamp.problem03.VolumeUnits.LITER;
import static org.junit.jupiter.api.Assertions.*;

class VolumeTest {
    @Test
    void shouldReturnTrue_whenComparesVolumeOf1GallonTo3point78Liter() {
        Volume gallon = Volume.create(1, GALLON);
        Volume liters = Volume.create(3.78, LITER);

        assertEquals(gallon, liters);
    }

    @Test
    void shouldReturnFalse_whenComparesVolumeOf1GallonTo4Liter() {
        Volume gallon = Volume.create(1, GALLON);
        Volume liters = Volume.create(4, LITER);

        assertNotEquals(gallon, liters);
    }

    @Test
    void shouldThrowError_whenVolumeValueIsNegative() {
        assertThrows(InvalidValueException.class, () -> Volume.create(-1, LITER));
    }

    @Test
    void shouldReturn4_78liters_whenAdding1gallonWith1liter() {
        Volume volume1 = Volume.create(1, GALLON);
        Volume volume2 = Volume.create(1, LITER);
        Volume result = volume1.add(volume2);

        Volume expectedVolume = Volume.create(4.78, LITER);
        assertEquals(expectedVolume, result);
    }
}
