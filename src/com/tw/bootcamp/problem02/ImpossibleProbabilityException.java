package com.tw.bootcamp.problem02;

public class ImpossibleProbabilityException extends RuntimeException {
    @Override
    public String getMessage() {
        return "Invalid Probability";
}
}
