package com.tw.bootcamp.problem05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BagTest {
    @Test
    void shouldReturnTrue_whenBallIsAddedToBag() {
        Bag bag = new Bag(12);
        Ball ball = new Ball();

        assertTrue(bag.addBall(ball, "Green"));
    }

    @Test
    void shouldThrowError_whenTriesToAddMoreThan12Ball() {
        Bag bag = new Bag(12);
        for (int i = 0; i < 12; i++) {
            Ball ball = new Ball();
            bag.addBall(ball, "Green");
        }

        assertThrows(OutOfCapacityException.class, () -> {
            Ball ball = new Ball();
            bag.addBall(ball, "Blue");
        });
    }
}