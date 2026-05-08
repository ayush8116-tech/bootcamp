package com.tw.bootcamp.problem03;

public class Volume {
    private final double value;
    private RatioToLiter unit;

    public Volume(double value, RatioToLiter unit) {
        this.value = value;
        this.unit = unit;
    }

    public static Volume create(double value, RatioToLiter unit) {
        return new Volume(value, unit);
    }
    public boolean compare(Volume volume) {
        double currentValue = this.convertToBase();
        double convertedValue = volume.convertToBase();

        return currentValue == convertedValue;
    }

    public double convertToBase() {
        return this.unit.getRatioValue() * this.value;
    }
}
