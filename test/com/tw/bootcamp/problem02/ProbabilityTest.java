package com.tw.bootcamp.problem02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProbabilityTest {
    @Test
    void shouldReturnProbabilityOfGettingTails() {
        Probability probability = Probability.create(1,2, 1);
        assertEquals(50, probability.successProbability());
    }

    @Test
    void shouldReturnProbabilityOfNotGettingTails() {
        Probability probability = Probability.create(1 ,2, 1);
        assertEquals(50, probability.failureProbability());
    }

    @Test
    void shouldReturnProbabilityOfGettingTails_whenCoinCountIs2() {
        Probability probability = Probability.create(2,2, 1);
        assertEquals(25, probability.successProbability());
    }

    @Test
    void shouldReturnProbabilityOfGetting3_whenRollADice() {
        Probability probability = Probability.create(1 ,6, 1);
        assertEquals(16.66, probability.successProbability(), 0.01);
    }

    @Test
    void shouldReturnProbabilityOfNotGetting3_whenRollDice() {
        Probability probability = Probability.create(1 ,6, 1);
        assertEquals(83.33, probability.failureProbability(), 0.01);
    }
}
