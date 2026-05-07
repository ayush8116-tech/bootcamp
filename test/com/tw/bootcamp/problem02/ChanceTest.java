package com.tw.bootcamp.problem02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChanceTest {
    @Test
    void shouldReturnProbabilityOfGettingTails() {
        Chance chance = Chance.createChance(1,2, 1);
        assertEquals(50, chance.chanceOfGettingAFace());
    }

    @Test
    void shouldReturnProbabilityOfNotGettingTails() {
        Chance chance = Chance.createChance(1 ,2, 1);
        assertEquals(50, chance.chanceOfNotGettingAFace());
    }

    @Test
    void shouldReturnProbabilityOfGettingTails_whenCoinCountIs2() {
        Chance chance = Chance.createChance(2,2, 1);
        assertEquals(25, chance.chanceOfGettingAFace());
    }

    @Test
    void shouldReturnProbabilityOfGetting3_whenRollADice() {
        Chance chance = Chance.createChance(1 ,6, 1);
        assertEquals(16.66, chance.chanceOfGettingAFace(), 0.01);
    }
}