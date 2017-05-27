package ru.academits.malykh.shapes;

public class Square extends Shape {
    private double length;

    public Square(double length) {
        this.length = length;
    }

    public double getWidth() {
        return length;
    }

    public double getHeight() {
        return length;
    }

    public double getArea() {
        return Math.pow(length, 2);
    }

    public double getPerimeter() {
        return 4 * length;
    }

}