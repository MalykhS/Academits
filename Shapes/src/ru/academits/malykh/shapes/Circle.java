package ru.academits.malykh.shapes;

public class Circle implements Shape {
    private double radius;
    private String name;

    public Circle(double radius, String name) {
        this.radius = radius;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getWidth() {
        return 2 * radius;
    }

    public double getHeight() {
        return 2 * radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return name;
    }
}