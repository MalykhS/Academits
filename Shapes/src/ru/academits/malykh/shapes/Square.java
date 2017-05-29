package ru.academits.malykh.shapes;

public class Square implements Shape {
    private double length;
    private String name;

    public Square(double length, String name) {
        this.length = length;
        this.name = name;
    }

    public String getName() {
        return name;
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

    public String toString() {
        return getArea() + " " + name;
    }


}