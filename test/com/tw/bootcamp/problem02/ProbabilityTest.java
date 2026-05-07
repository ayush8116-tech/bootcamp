package com.tw.bootcamp.problem02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ProbabilityTest {
    @Test
    void shouldReturnProbabilityOfGettingTails() {
        Probability chanceOfGettingTails = Probability.create(0.5);
        assertEquals(Probability.create(0.5), chanceOfGettingTails);
    }

    @Test
    void shouldReturnProbabilityOfNotGettingTails() {
        Probability probability = Probability.create(0.5);
        Probability chanceOfNotGettingTails = probability.not();

        assertEquals(Probability.create(0.5), chanceOfNotGettingTails);
    }

    @Test
    void shouldReturnProbabilityOfGettingTails_whenCoinCountIs2() {
        Probability probabilityA = Probability.create(0.5);
        Probability probabilityB = Probability.create(0.5);
        Probability chancesOfGettingTwoTails = probabilityA.and(probabilityB);

        assertEquals(Probability.create(0.25), chancesOfGettingTwoTails);
    }

    @Test
    void shouldReturnProbabilityOfGetting3_whenRollADice() {
        Probability chanceOfGetting3 = Probability.create(0.16);
        assertEquals(Probability.create(0.16), chanceOfGetting3);
    }

    @Test
    void shouldReturnProbabilityOfNotGetting3_whenRollDice() {
        Probability probability = Probability.create(0.16);
        Probability chanceOfNotGetting3 = probability.not();

        assertEquals(Probability.create(0.84), chanceOfNotGetting3);
    }

    @Test
    void shouldReturnProbabilityOfGettingAtLeastTails_whenCoinCountIs2() {
        Probability probabilityA = Probability.create(0.5);
        Probability probabilityB = Probability.create(0.5);
        Probability chanceOfGettingAtLeastOneTail = probabilityA.or(probabilityB);

        assertEquals(Probability.create(0.75), chanceOfGettingAtLeastOneTail);
    }

    @Test
    void shouldThrowsAnError_whenProbabilityValueIsInvalid() {
        ImpossibleProbabilityException valueUnderThresholdError = assertThrows(
                ImpossibleProbabilityException.class,
                () -> Probability.create(-1)
        );

        assertEquals("Invalid Probability", valueUnderThresholdError.getMessage());

        ImpossibleProbabilityException valueOverThresholdError = assertThrows(
                ImpossibleProbabilityException.class,
                () -> Probability.create(2)
        );

        assertEquals("Invalid Probability", valueOverThresholdError.getMessage());
    }
}
