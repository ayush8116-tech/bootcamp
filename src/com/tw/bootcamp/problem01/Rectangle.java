package com.tw.bootcamp.problem01;

public class Rectangle implements Shape {
    private final double length;
    private final double breadth;

    private Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public static Rectangle createRectangle(double length, double breadth) {
        return new Rectangle(length, breadth);
    }

    public static Rectangle createSquare(double side) {
        return createRectangle(side, side);
    }

    @Override
    public double area() {
        return length * breadth;
    }

    @Override
    public double perimeter() {
        return 2 * (length + breadth);
    }


}
