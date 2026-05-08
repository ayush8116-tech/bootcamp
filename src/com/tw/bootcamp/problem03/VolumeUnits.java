package com.tw.bootcamp.problem03;

public enum VolumeUnits {
    LITER(1),
    GALLON(3.78);

    private final double ratio;

    VolumeUnits(double ratio) {
        this.ratio = ratio;
    }

    public double getLiterEquivalent() {
        return this.ratio;
    }
}
