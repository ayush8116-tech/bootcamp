package com.tw.bootcamp.problem05;

import java.util.ArrayList;
import java.util.HashMap;

public class Bag {
    private final int capacity;
    private final HashMap<Color, ArrayList<Ball>> balls;

    public Bag(int capacity) {
        this.capacity = capacity;
        this.balls = new HashMap<>();
    }

    public boolean addBall(Ball ball, Color color) {
        if (isBagFull()) {
            throw new OutOfCapacityException("Bag Capacity is Full");
        }

        balls.putIfAbsent(color, new ArrayList<Ball>());
        if (!withinLimit(color)) {
            throw new OutOfCapacityException("Color Limit Exceeds : " + Color.GREEN.name());
        }

        return balls.get(color).add(ball);
    }

    private boolean withinLimit(Color color) {
        if (color == Color.RED) {
            int limit = balls.get(Color.GREEN).size();
            return balls.get(color).size() <= limit;
        }

        if (color == Color.GREEN) {
            return balls.get(color).size() < 3;
        }

        return true;
    }

    private boolean isBagFull() {
        int ballCount = 0;
        for (Color color : balls.keySet()) {
            ballCount += balls.get(color).size();
        }

        return ballCount == capacity;
    }
}
