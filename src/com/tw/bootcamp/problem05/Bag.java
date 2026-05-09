package com.tw.bootcamp.problem05;

import java.util.ArrayList;

public class Bag {
    private final int capacity;
    private final ArrayList<Ball> balls;

    public Bag(int capacity) {
        this.capacity = capacity;
        this.balls = new ArrayList<>();
    }

    public boolean addBall(Ball ball) {
        if(this.balls.size() == this.capacity) {
            throw new OutOfCapacityException("Bag Capacity is Full");
        }

        return this.balls.add(ball);
    }
}
