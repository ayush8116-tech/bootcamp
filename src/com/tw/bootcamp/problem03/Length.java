package com.tw.bootcamp.problem03;

public class Length {
    private final double value;
    private final UnitProportions unit;

    private Length(double value, UnitProportions unit) {
        this.value = value;
        this.unit = unit;
    }

    public static Length createCentimeterLength(double value) {
        return new Length(value, UnitProportions.CM);
    }

    public static Length createInchLength(double value) {
        return new Length(value, UnitProportions.INCH);
    }

    public static Length createFeetLength(double value) {
        return new Length(value, UnitProportions.FEET);
    }

    public static Length createMillimeterLength(double value) {
        return new Length(value, UnitProportions.MM);
    }

    public boolean compare(Length length) {
        double convertedValue = length.convertToBase();
        double currentValue = this.convertToBase();

        return currentValue == convertedValue;
    }

    private double convertToBase() {
        return this.value * this.unit.getProportions();
    }
}
