package com.tw.bootcamp.problem03;

public enum LengthUnitProportions {
    FEET(12),
    CM(0.4),
    INCH(1),
    MM(0.04);

    private final double proportion;

    LengthUnitProportions(double proportion) {
        this.proportion = proportion;
    }

    double getProportions() {
        return this.proportion;
    }
}
