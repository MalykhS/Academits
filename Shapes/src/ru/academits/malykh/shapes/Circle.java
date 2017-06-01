package ru.academits.malykh.shapes;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
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

    @Override
    public String toString() {
        return String.valueOf(this.getClass().getSimpleName()) + " " + getArea() + " " + radius;
    }

    @Override

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if ((obj == null) || (obj.getClass() != this.getClass())) {
            return false;
        }
        Circle otherObj = (Circle) obj;
        return this.radius == otherObj.radius;
    }

    @Override

    public int hashCode() {
        int result = 17;
        int n = 37;
        result = result * n + (int) radius;
        return result;
    }
}