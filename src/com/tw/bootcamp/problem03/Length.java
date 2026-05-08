package com.tw.bootcamp.problem03;

public class Length {
    private final double value;
    private final UnitProportions unit;

    public Length(double value, UnitProportions unit) {
        this.value = value;
        this.unit = unit;
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
