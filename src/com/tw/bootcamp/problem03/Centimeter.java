package com.tw.bootcamp.problem03;

public class Centimeter {
    private final double cm;

    public Centimeter(double cm) {
        this.cm = cm;
    }


    public boolean compare(double convertedCm) {
        return this.cm == convertedCm;
    }
}
