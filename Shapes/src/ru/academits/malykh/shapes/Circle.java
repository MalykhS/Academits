package ru.academits.malykh.shapes;

import java.util.Objects;

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

    /* public String toString() {
         return String.valueOf(this.getClass().getSimpleName()) + " " + getArea() + " " + radius;
     } */
    @Override
    public String toString() {
        return this.getClass().getSimpleName();//String.valueOf(getArea() + " " + getPerimeter());
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
        return Objects.hash(radius);
    }
}