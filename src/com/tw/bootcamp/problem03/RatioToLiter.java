package com.tw.bootcamp.problem03;

public enum RatioToLiter {
    LITER(1),
    GALLON(3.78);

    private final double ratio;

    RatioToLiter(double ratio) {
        this.ratio = ratio;
    }

    public double getRatioValue() {
        return this.ratio;
    }
}
