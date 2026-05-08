package com.tw.bootcamp.problem03;

public class Inch {
    private final int inches;

    public Inch(int inches) {
        this.inches = inches;
    }

    public boolean compare(double convertedInches) {
        return inches == convertedInches;
    }

    public boolean compare(Centimeter centimeter) {
        return centimeter.compare(this.inchToCm());
    }

    private double inchToCm() {
        return this.inches * 2.5;
    }
}
