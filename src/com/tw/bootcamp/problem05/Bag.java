package com.tw.bootcamp.problem05;

import java.util.ArrayList;
import java.util.TreeMap;

import static com.tw.bootcamp.problem05.Color.GREEN;

public class Bag {
    private final int capacity;
    private final ArrayList<Color> RULES;
    private final TreeMap<Color, ArrayList<Ball>> balls;

    public Bag(int capacity, ArrayList<Color> RULES) {
        this.capacity = capacity;
        this.RULES = RULES;
        this.balls = new TreeMap<>();
    }

    public boolean addBall(Ball ball, Color color) {
        if (isBagFull()) {
            throw new OutOfCapacityException("Bag Capacity is Full");
        }

        balls.putIfAbsent(color, new ArrayList<>());
        if (!withinLimit(color)) {
            throw new OutOfCapacityException("Color Limit Exceeds : " + color.name());
        }

        return balls.get(color).add(ball);
    }

    private boolean withinLimit(Color color) {
        if (RULES.contains(color)) {
            switch (color) {
                case RED -> {
                    int limit = balls.get(GREEN).size();
                    return balls.get(color).size() < limit * 2;
                }
                case GREEN -> {
                    return balls.get(color).size() < 3;
                }
                case YELLOW -> {
                    return balls.get(color).size() < getBallCount() * 0.4;
                }
                default -> {
                    return true;
                }
            }
        }

        return true;
    }

    private boolean isBagFull() {
        int ballCount = getBallCount();
        return ballCount == capacity;
    }

    private int getBallCount() {
        int ballCount = 0;
        for (Color color : balls.keySet()) {
            ballCount += balls.get(color).size();
        }
        return ballCount;
    }

    @Override
    public String toString() {
        StringBuilder summary = new StringBuilder();
        for (Color color : balls.keySet()) {
            summary.append(String.format("%-7s", color))
                    .append(": ")
                    .append(balls.get(color).size())
                    .append("\n");
        }

        int total = getBallCount();
        summary.append("\n").append("TOTAL : ").append(total);
        return summary.toString();
    }
}
