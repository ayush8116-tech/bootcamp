package com.tw.bootcamp.problem03;

import java.util.Objects;

public class Volume {
    private final double value;
    private final VolumeUnits unit;

    public Volume(double value, VolumeUnits unit) {
        this.value = value;
        this.unit = unit;
    }

    public static Volume create(double value, VolumeUnits unit) {
        if (value < 0) {
            throw new InvalidValueException();
        }

        return new Volume(value, unit);
    }

    public boolean isEqualTo(Volume volume) {
        double currentValue = this.convertToBase();
        double convertedValue = volume.convertToBase();

        return currentValue == convertedValue;
    }

    public double convertToBase() {
        return this.unit.getLiterEquivalent() * this.value;
    }

    public Volume add(Volume volume) {
        double result = this.convertToBase() + volume.convertToBase();
        return new Volume(result, VolumeUnits.LITER);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Volume volume = (Volume) o;
        double delta = value - volume.value;
        return delta > -0.01 && delta < 0.01 && unit == volume.unit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, unit);
    }
}
