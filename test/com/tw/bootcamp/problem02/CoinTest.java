package com.tw.bootcamp.problem02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoinTest {
    @Test
    void shouldReturnProbability() {
        Coin coin = new Coin();
        assertEquals(50, coin.chanceOfGettingAFace());
    }

    @Test
    void shouldReturnProbabilityOf50_whenNotGettingTails() {
        Coin coin = new Coin();
        assertEquals(50, coin.chanceOfNotGettingAFace());
    }
}