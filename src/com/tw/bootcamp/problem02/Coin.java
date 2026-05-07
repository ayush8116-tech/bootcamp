package com.tw.bootcamp.problem02;

public class Coin {
    private final int noOfFavorableOutcomes = 1;
    private final int possibleOutcomes = 2;

    public double chanceOfGettingAFace() {
        return Probability.possibilityOf(noOfFavorableOutcomes, possibleOutcomes);
    }

    public double chanceOfNotGettingAFace() {
        return 100 - chanceOfGettingAFace();
    }
}
