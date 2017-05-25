package ru.academits.malykh.shapes;

public class Triangle extends Shapes {

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        super(x1, y1, x2, y2, x3, y3);
    }

    public double getArea() {
        return (getWidth(getX1(), getX2(), getX3()) * getHeight(getY1(), getY2(), getY3())) / 2;
    }

    public double getPerimeter() {
        return getWidth() + getHeight() + Math.sqrt(Math.pow(getX3() - getX1(), 2) + Math.pow(getY3() - getY1(), 2));
    }
}

