package com.tw.bootcamp.problem05;

import org.junit.jupiter.api.Test;

import static com.tw.bootcamp.problem05.Color.*;
import static org.junit.jupiter.api.Assertions.*;

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
            bag.addBall(ball, BLUE);
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


    @Test
    public void shouldNotThrowError_whenTriesToAddYellowBallsNotMoreThanFortyPerCent() {
        assertDoesNotThrow(() -> {
            Bag bag = new Bag(12);
            Ball ball = new Ball();
            bag.addBall(ball, GREEN);
            for (int i = 0; i < 2; i++) {
                Ball blueBall = new Ball();
                bag.addBall(blueBall, BLUE);

                Ball yellowBall = new Ball();
                bag.addBall(yellowBall, YELLOW);
            }
        });
    }

    @Test
    public void shouldThrowError_whenTriesToAddYellowBallsMoreThanFortyPerCent() {
        assertThrows(OutOfCapacityException.class, () -> {
            Bag bag = new Bag(12);
            Ball ball = new Ball();
            bag.addBall(ball, GREEN);
            for (int i = 0; i < 2; i++) {
                Ball yellowBall = new Ball();
                bag.addBall(yellowBall, YELLOW);
            }
        });
    }

}