package com.tw.bootcamp.problem02;

import java.util.Objects;

public class Probability {
    private final double value;

    private Probability(double value) {
        this.value = value;
    }

    public static Probability chanceOfGetting(double value) {
        return new Probability(value);
    }

    public static Probability chanceOfNotGetting(double value) {
        return chanceOfGetting(1 - value);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Probability that = (Probability) o;
        return Double.compare(value, that.value) == 0;
    }
}
