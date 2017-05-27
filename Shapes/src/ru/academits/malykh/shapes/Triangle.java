package ru.academits.malykh.shapes;

public class Triangle extends Shape {
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double x3;
    private double y3;
    private double a;
    private double b;
    private double c;

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    private double getDistance(double side) {
        if (side == a) {
            return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        } else if (side == b) {
            return Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        } else if (side == c) {
            return Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        }
        return side;
    }

    public double getWidth() {
        return Math.max(x1, Math.max(x2, x3)) - Math.min(x1, Math.min(x2, x3));
    }

    public double getHeight() {
        return Math.max(y1, Math.max(y2, y3)) - Math.min(y1, Math.min(y2, y3));
    }

    private double getSemiPerimeter() {
        return (getDistance(a) + getDistance(b) + getDistance(c)) / 2;
    }

    public double getArea() {
        return Math.sqrt(getSemiPerimeter() * (getSemiPerimeter() - getDistance(a)) * (getSemiPerimeter() - getDistance(b)) *
                (getSemiPerimeter() - getDistance(c)));
    }

    public double getPerimeter() {
        return getDistance(a) + getDistance(b) + getDistance(c);
    }

}