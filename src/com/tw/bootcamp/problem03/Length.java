package com.tw.bootcamp.problem03;

import java.util.Objects;

public class Length {
    private final double value;
    private final RatioToInch unit;

    private Length(double value, RatioToInch unit) {
        this.value = value;
        this.unit = unit;
    }

    public static Length createCentimeterLength(double value) {
        return new Length(value, RatioToInch.CM);
    }

    public static Length createInchLength(double value) {
        return new Length(value, RatioToInch.INCH);
    }

    public static Length createFeetLength(double value) {
        return new Length(value, RatioToInch.FEET);
    }

    public static Length createMillimeterLength(double value) {
        return new Length(value, RatioToInch.MM);
    }

    public boolean isEqualTo(Length length) {
        double currentValue = this.convertToBase();
        double convertedValue = length.convertToBase();

        return currentValue == convertedValue;
    }

    public double convertToBase() {
        return this.value * this.unit.getRatioToInch();
    }


    public Length add(Length length) {
        return new Length(this.value + length.value, this.unit);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(value, length.value) == 0 && unit == length.unit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, unit);
    }
}
