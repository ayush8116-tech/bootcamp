package com.tw.bootcamp.problem03;

public enum LengthUnits {
    FEET(12),
    CM(0.4),
    INCH(1),
    MM(0.04);

    private final double ratio;

    LengthUnits(double ratio) {
        this.ratio = ratio;
    }

    double getInchEquivalent() {
        return this.ratio;
    }
}
