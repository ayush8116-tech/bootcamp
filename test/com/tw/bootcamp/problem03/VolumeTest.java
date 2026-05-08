package com.tw.bootcamp.problem03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VolumeTest {
    @Test
    void shouldReturnTrue_whenComparesVolumeOf1GallonTo3point78Liter() {
        Volume gallon = Volume.createGallon(1);
        Volume liters = Volume.createLiter(3.78);

        assertTrue(gallon.compare(liters));
    }

    @Test
    void shouldReturnFalse_whenComparesVolumeOf1GallonTo4Liter() {
        Volume gallon = Volume.createGallon(1);
        Volume liters = Volume.createLiter(4);

        assertFalse(gallon.compare(liters));
    }
}