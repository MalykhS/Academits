package ru.academits.malykh.shapes;


public class Square extends Shapes {
    private double length;

    public Square(double length) {
        super.getWidth();
        this.length = length;
    }

    public double getArea() {
        return Math.pow(length, 2);
    }

    public double getPerimeter() {
        return 4 * length;
    }


}
