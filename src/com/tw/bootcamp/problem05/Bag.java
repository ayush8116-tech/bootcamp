package com.tw.bootcamp.problem05;

import java.util.ArrayList;
import java.util.HashMap;

public class Bag {
    private final int capacity;
    private final HashMap<String, ArrayList<Ball>> balls;

    public Bag(int capacity) {
        this.capacity = capacity;
        this.balls = new HashMap<>();
    }



    public boolean addBall(Ball ball, String color) {
        if (isBagFull()) {
            throw new OutOfCapacityException("Bag Capacity is Full");
        }
        balls.putIfAbsent(color, new ArrayList<Ball>());
        return balls.get(color).add(ball);
    }

    private boolean isBagFull() {
        int ballCount = 0;
        for (String color : balls.keySet()) {
            ballCount += balls.get(color).size();
        }
        return ballCount == capacity;
    }
}
