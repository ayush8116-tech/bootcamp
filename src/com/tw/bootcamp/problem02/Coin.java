package com.tw.bootcamp.problem02;

public class Coin {
    private final int faceCount;

    public Coin() {
        this.faceCount = 2;
    }

    public double chanceOfGettingTails() {
        return 1.0 / faceCount;
    }
}
