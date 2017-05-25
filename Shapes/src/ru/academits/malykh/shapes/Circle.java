package ru.academits.malykh.shapes;

public class Circle extends Shapes {
    private double radius;

    public Circle(double radius) {
        super.getWidth();
        this.radius = radius;
    }

    public double getArea() {
        return radius * Math.pow(Math.PI, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
