package com.tw.bootcamp.problem02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoinTest {
    @Test
    void shouldReturnProbability() {
        Coin coin = new Coin();
        assertEquals(0.5, coin.chanceOfGettingTails());
    }
}