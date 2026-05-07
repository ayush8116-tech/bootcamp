package com.tw.bootcamp.problem02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProbabilityTest {
    @Test
    void shouldReturnProbabilityOfGettingTails() {
        Probability chanceOfGettingTails = Probability.chanceOfGetting(0.5);
        assertEquals(Probability.chanceOfGetting(0.5), chanceOfGettingTails);
    }

    @Test
    void shouldReturnProbabilityOfNotGettingTails() {
        Probability chanceOfNotGettingTails = Probability.chanceOfNotGetting(0.5);
        assertEquals(Probability.chanceOfNotGetting(0.5), chanceOfNotGettingTails);
    }

    @Test
    void shouldReturnProbabilityOfGettingTails_whenCoinCountIs2() {
        Probability probability = Probability.chanceOfGetting(0.25);
        assertEquals(Probability.chanceOfGetting(0.25), probability);
    }

    @Test
    void shouldReturnProbabilityOfGetting3_whenRollADice() {
        Probability probability = Probability.chanceOfGetting(0.16);
        assertEquals(Probability.chanceOfGetting(0.16), probability);
    }

    @Test
    void shouldReturnProbabilityOfNotGetting3_whenRollDice() {
        Probability probability = Probability.chanceOfGetting(0.83);
        assertEquals(Probability.chanceOfGetting(0.83), probability);
    }

    @Test
    void shouldReturnProbabilityOfGettingAtLeastTails_whenCoinCountIs2() {
        Probability probability = Probability.chanceOfGettingAtLeastOne(0.5, 0.5);
        assertEquals(Probability.chanceOfGetting(0.75), probability);
    }
}
