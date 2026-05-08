package com.tw.bootcamp.problem03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureTest {
    @Test
    void shouldReturnTrue_whenComparing212FWith100C() {
        Temperature fahrenheit = Temperature.create(212, TemperatureUnits.FAHRENHEIT);
        Temperature celsius = Temperature.create(100, TemperatureUnits.CELSIUS);

        assertEquals(fahrenheit, celsius);
    }
}