package ru.academits.malykh.shapes;

import java.util.Objects;

public class Square implements Shape {
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
        Square otherObj = (Square) obj;
        return length == otherObj.length;
    }

    @Override

    public int hashCode() {
        return Objects.hash(length);
    }
}