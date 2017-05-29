package ru.academits.malykh.shapes;

public class Rectangle implements Shape {
    private double width;
    private double length;
    private String name;

    public Rectangle(double width, double length, String name) {
        this.width = width;
        this.length = length;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return length;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    public String toString() {
        return name;
    }
}
