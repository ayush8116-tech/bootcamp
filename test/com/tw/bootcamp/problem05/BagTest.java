package com.tw.bootcamp.problem05;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static com.tw.bootcamp.problem05.Color.*;
import static org.junit.jupiter.api.Assertions.*;

class BagTest {
    @Test
    void shouldReturnTrue_whenBallIsAddedToBag() {
        Bag bag = new Bag(12, new ArrayList<>());
        Ball ball = new Ball();

        assertTrue(bag.addBall(ball, GREEN));
    }

    @Test
    void shouldThrowError_whenTriesToAddMoreThan12Ball() {
        Bag bag = new Bag(12, new ArrayList<>());
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
        ArrayList<Color> colors = new ArrayList<>();
        colors.add(GREEN);

        Bag bag = new Bag(12, colors);
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
        ArrayList<Color> colors = new ArrayList<>();
        colors.add(GREEN);
        colors.add(RED);

        Bag bag = new Bag(12, colors);
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
            ArrayList<Color> colors = new ArrayList<>();
            colors.add(GREEN);
            colors.add(RED);
            colors.add(YELLOW);

            Bag bag = new Bag(12, colors);
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
            ArrayList<Color> colors = new ArrayList<>();
            colors.add(GREEN);
            colors.add(RED);
            colors.add(YELLOW);

            Bag bag = new Bag(12, colors);
            Ball ball = new Ball();
            bag.addBall(ball, GREEN);
            for (int i = 0; i < 2; i++) {
                Ball yellowBall = new Ball();
                bag.addBall(yellowBall, YELLOW);
            }
        });
    }

    @Test
    void shouldReturnBallSummary_whenBallsAreThereInTheBag() {
        ArrayList<Color> colors = new ArrayList<>();
        colors.add(GREEN);
        colors.add(RED);
        colors.add(YELLOW);

        Bag bag = new Bag(12, colors);

        for (int i = 0; i < 2; i++) {
            Ball greenBall = new Ball();
            bag.addBall(greenBall, GREEN);

            Ball yellowBall = new Ball();
            bag.addBall(yellowBall, YELLOW);
        }

        for (int i = 0; i < 4; i++) {
            Ball redBall = new Ball();
            bag.addBall(redBall, RED);

            Ball blueBall = new Ball();
            bag.addBall(blueBall, BLUE);
        }

        String expectedSummary = """
                GREEN  : 2
                BLUE   : 4
                RED    : 4
                YELLOW : 2

                TOTAL : 12""";

        assertEquals(expectedSummary, bag.toString());
    }
}