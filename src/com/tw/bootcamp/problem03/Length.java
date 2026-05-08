package com.tw.bootcamp.problem03;

import java.util.Objects;

public class Length {
    private final double value;
    private final LengthUnits unit;

    private Length(double value, LengthUnits unit) {
        this.value = value;
        this.unit = unit;
    }

    public static Length create(double value, LengthUnits unit) {
        if(value < 0) {
            throw new InvalidValueException();
        }

        return new Length(value, unit);
    }

    public double convertToBase() {
        return this.value * this.unit.getInchEquivalent();
    }

    public Length add(Length length) {
        double result = this.convertToBase() + length.convertToBase();
        return new Length(result, LengthUnits.INCH);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(convertToBase(), length.convertToBase()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, unit);
    }
}
