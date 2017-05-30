package ru.academits.malykh.shapes;

public class Utils implements Shape{

    public String getMaxArea(Shape[] shapes) {
        double max = 0;
        String s = " ";
        for (Shape shape : shapes) {
            if (shape.getArea() > max) {
                max = shape.getArea();
                s = shape.toString();
            }
        }
        return s;
    }

    public double getSecondMaxPerimeter(Shape[] shapes) {
        double max = 0;
        String s = " ";
        double second = 0;
        for (Shape shape: shapes) {
            if (shape.getPerimeter() > max) {
                second = max;
                max = shape.getPerimeter();
            }
        }
        return second;
    }

    @Override
    public double getWidth() {
        return 0;
    }

    @Override
    public double getHeight() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }
}