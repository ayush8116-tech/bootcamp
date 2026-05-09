package com.tw.bootcamp.problem05;

public enum Color {
    GREEN(3),
    BLUE(100),
    RED(100),
    YELLOW(100);

    private final int limit;

    Color(int limit) {
        this.limit = limit;
    }

    public boolean withinLimit(int size) {
        return size >= limit;
    }
}
