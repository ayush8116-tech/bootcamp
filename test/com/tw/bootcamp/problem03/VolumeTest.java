package com.tw.bootcamp.problem03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VolumeTest {
    @Test
    void shouldReturnTrue_whenComparesVolumeOf1GallonTo3point78Liter() {
        Volume gallon = Volume.create(1, RatioToLiter.GALLON);
        Volume liters = Volume.create(3.78, RatioToLiter.LITER);

        assertTrue(gallon.compare(liters));
    }

    @Test
    void shouldReturnFalse_whenComparesVolumeOf1GallonTo4Liter() {
        Volume gallon = Volume.create(1, RatioToLiter.GALLON);
        Volume liters = Volume.create(4, RatioToLiter.LITER);

        assertFalse(gallon.compare(liters));
    }
}