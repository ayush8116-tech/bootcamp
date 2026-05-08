package com.tw.bootcamp.problem03;

public class Volume {
    private final double value;
    private VolumeUnits unit;

    public Volume(double value, VolumeUnits unit) {
        this.value = value;
        this.unit = unit;
    }

    public static Volume create(double value, VolumeUnits unit) {
        return new Volume(value, unit);
    }
    public boolean compare(Volume volume) {
        double currentValue = this.convertToBase();
        double convertedValue = volume.convertToBase();

        return currentValue == convertedValue;
    }

    public double convertToBase() {
        return this.unit.getLiterEquivalent() * this.value;
    }
}
