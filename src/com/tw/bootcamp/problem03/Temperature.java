package com.tw.bootcamp.problem03;

import java.util.Objects;

public class Temperature {
    private final double value;
    private final TemperatureUnits unit;

    private Temperature(double value, TemperatureUnits unit) {
        this.value = value;
        this.unit = unit;
    }

    public static Temperature create(double value, TemperatureUnits unit) {
        return new Temperature(value, unit);
    }

    public double convertToBase() {
        if (this.unit == TemperatureUnits.FAHRENHEIT)
            return (this.value - 32) * 5 / 9;

        return this.value;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Temperature temperature = (Temperature) o;
        return Double.compare(convertToBase(), temperature.convertToBase()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, unit);
    }
}
