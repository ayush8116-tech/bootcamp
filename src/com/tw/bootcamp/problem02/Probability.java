package com.tw.bootcamp.problem02;

public class Probability {
    private final double value;

    private Probability(double value) {
        this.value = value;
    }

    public static Probability create(double value) throws ImpossibleProbabilityException{
        if(value < 0 || value > 1) throw new ImpossibleProbabilityException();

        return new Probability(value);
    }

    public Probability not() {
        return create(1 - value);
    }

    public Probability or(Probability otherProbability) {
        double value = this.value + otherProbability.value - this.value * otherProbability.value;
        return create(value);
    }

    public Probability and(Probability otherProbability) {
        double value = this.value * otherProbability.value;
        return create(value);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Probability that = (Probability) o;
        return Double.compare(value, that.value) == 0;
    }
}
