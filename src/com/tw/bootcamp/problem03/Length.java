package com.tw.bootcamp.problem03;

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

    public boolean compare(Length length) {
        double convertedValue = length.convertToBase();
        double currentValue = this.convertToBase();

        return currentValue == convertedValue;
    }

    private double convertToBase() {
        return this.value * this.unit.getRatioToInch();
    }
}
