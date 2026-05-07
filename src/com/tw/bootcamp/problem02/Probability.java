package com.tw.bootcamp.problem02;

public class Probability {

    public static double possibilityOf(int noOfFavorableOutcomes, int possibleOutcomes) {
        return ((double) noOfFavorableOutcomes / possibleOutcomes) * 100;
    }
}
