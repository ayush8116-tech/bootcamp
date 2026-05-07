package com.tw.bootcamp.problem02;

public class Chance {
    private final int possibleOutcomes;
    private final int noOfFavorableOutcomes;

    private Chance(int possibleOutcomes, int noOfFavorableOutcomes) {
        this.possibleOutcomes = possibleOutcomes;
        this.noOfFavorableOutcomes = noOfFavorableOutcomes;
    }

    public static Chance createChance(int itemCount, int facesCount, int noOfFavorableOutcomes) {
        int possibleOutcomes = itemCount * facesCount;
        return new Chance(possibleOutcomes, noOfFavorableOutcomes);
    }

    public double chanceOfGettingAFace() {
        return ((double) noOfFavorableOutcomes / possibleOutcomes) * 100;
    }

    public double chanceOfNotGettingAFace() {
        return 100 - chanceOfGettingAFace();
    }
}
