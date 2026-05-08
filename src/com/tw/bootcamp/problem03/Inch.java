package com.tw.bootcamp.problem03;

public class Inch {
    private final int inches;

    public Inch(int inches) {
        this.inches = inches;
    }

    public boolean compare(double convertedInches) {
        return inches == convertedInches;
    }
}
