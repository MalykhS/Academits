package ru.academits.malykh.shapes;

import java.util.Objects;

public class Rectangle implements Shape {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
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

    /*  public String toString() {
          return String.valueOf(this.getClass().getSimpleName()) + " " + getArea() + " " + width + " " + length;
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
        Rectangle otherObj = (Rectangle) obj;
        return this.length == otherObj.length && this.width == otherObj.width;
    }

    @Override

    public int hashCode() {
        return Objects.hash(length, width);
    }
}