package ru.academits.malykh.main;

import ru.academits.malykh.shapes.Shape;

public class Utils implements Shape {

    public static String getMaxArea(Shape[] shapes) {
        double max = 0;
        String s = " ";
        for (Shape shape : shapes) {
            if (shape.getArea() > max) {
                max = shape.getArea();
                s = shape.getClass().getSimpleName();
            }
        }
        return s;
    }

    public static String getSecondMaxPerimeter(Shape[] shapes) {
        double max = 0;
        String s1 = " ";
        double second = 0;
        for (Shape s : shapes) {
            if (s.getPerimeter() > max) {
                max = s.getPerimeter();
            }
            if (s.getPerimeter() > second && s.getPerimeter() < max) {
                second = s.getPerimeter();
                s1 = s.getClass().getSimpleName();
            }
        }
        return s1;
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