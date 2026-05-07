package com.tw.bootcamp.problem02;

public class Probability {
    private final int totalPossibleOutcomes;
    private final int favorableOutcomes;

    private Probability(int favorableOutcomes, int totalPossibleOutcomes) {
        this.totalPossibleOutcomes = totalPossibleOutcomes;
        this.favorableOutcomes = favorableOutcomes;
    }

    public static Probability create(int itemCount, int facesPerItem, int favorableOutcomes) {
        int possibleOutcomes = itemCount * facesPerItem;

        return new Probability(favorableOutcomes, possibleOutcomes);
    }

    public double successProbability() {
        return ((double) favorableOutcomes / totalPossibleOutcomes) * 100;
    }

    public double failureProbability() {
        return 100 - successProbability();
    }
}
