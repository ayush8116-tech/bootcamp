package com.tw.bootcamp.problem03;

public enum UnitProportions {
    FEET(12),
    CM(0.4),
    INCH(1),
    MM(0.04);

    private final double proportion;

    UnitProportions(double proportion) {
        this.proportion = proportion;
    }

    double getProportions() {
        return this.proportion;
    }
}
