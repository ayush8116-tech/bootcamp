package com.tw.bootcamp.problem03;

public class Feet {
    private final double ft;

    public Feet(double ft) {
        this.ft = ft;
    }

    public double toInch() {
        return ft * 12;
    }


    public boolean compare(Inch inch) {
        return inch.compare(this.toInch());
    }
}
