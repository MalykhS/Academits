package ru.academits.malykh.shapes;

public class Rectangle extends Shapes {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        super.getWidth();
        super.getHeight();
        this.width = width;
        this.length = length;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }
}

