package com.tw.bootcamp.problem05;

import org.junit.jupiter.api.Test;

import static com.tw.bootcamp.problem05.Color.*;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BagTest {
    @Test
    void shouldReturnTrue_whenBallIsAddedToBag() {
        Bag bag = new Bag(12);
        Ball ball = new Ball();

        assertTrue(bag.addBall(ball, GREEN));
    }

    @Test
    void shouldThrowError_whenTriesToAddMoreThan12Ball() {
        Bag bag = new Bag(12);
        for (int i = 0; i < 12; i++) {
            Ball ball = new Ball();
            bag.addBall(ball, YELLOW);
        }

        assertThrows(OutOfCapacityException.class, () -> {
            Ball ball = new Ball();
            bag.addBall(ball, BLUE);
        });
    }

    @Test
    public void shouldThrowError_whenTriesToAddMoreThan3GreenBalls() {
        Bag bag = new Bag(12);
        for (int i = 0; i < 3; i++) {
            Ball ball = new Ball();
            bag.addBall(ball, GREEN);
        }

        assertThrows(OutOfCapacityException.class, () -> {
            Ball ball = new Ball();
            bag.addBall(ball, GREEN);
        });
    }

    @Test
    public void shouldThrowError_whenTriesToAddRedBallsMoreThanDoubleOfGreenBalls() {
        Bag bag = new Bag(12);
        Ball ball = new Ball();
        bag.addBall(ball, GREEN);
        for (int i = 0; i < 2; i++) {
            Ball redBall = new Ball();
            bag.addBall(redBall, RED);
        }

        assertThrows(OutOfCapacityException.class, () -> {
            Ball redBall = new Ball();
            bag.addBall(redBall, RED);
        });
    }

}