package com.tw.bootcamp.problem03;

public class Volume {
    private final double value;
    private RatioToLiter unit;

    public Volume(double value, RatioToLiter unit) {
        this.value = value;
        this.unit = unit;
    }

    public static Volume createLiter(double value) {
        return new Volume(value, RatioToLiter.LITER);
    }

    public static Volume createGallon(double value) {
        return new Volume(value, RatioToLiter.GALLON);
    }

    public boolean compare(Volume volume) {
        double currentValue = this.convertToBase();
        double convertedValue = volume.convertToBase();

        return currentValue == convertedValue;
    }

    private double convertToBase() {
        return this.unit.getRatioValue() * this.value;
    }
}
