package com.tw.bootcamp.problem03;

public class Volume {
    private final double value;
    private final String unit;

    public Volume(double value, String unit) {
        this.value = value;
        this.unit = unit;
    }

    public static Volume createLiter(double value) {
        return new Volume(value, "liter");
    }

    public static Volume createGallon(double value) {
        return new Volume(value, "gallon");
    }

    public boolean compare(Volume volume) {
        double currentValue = this.convertToBase();
        double convertedValue = volume.convertToBase();

        return currentValue == convertedValue;
    }

    private double convertToBase() {
        if(this.unit.equals("gallon")) {
            return 3.78 * this.value;
        }

        return this.value;
    }
}
