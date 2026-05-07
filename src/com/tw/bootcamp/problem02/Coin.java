package com.tw.bootcamp.problem02;

public class Coin {
    public final double noOfFavorableOutcomes = 1.0;
    private final int faceCount;

    public Coin() {
        this.faceCount = 2;
    }

    public double chanceOfGettingAFace() {
        return (noOfFavorableOutcomes / faceCount) * 100;
    }

    public double chanceOfNotGettingAFace() {
        return 100 - chanceOfGettingAFace();
    }
}
