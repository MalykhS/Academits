package ru.academits.malykh.shapes;

public class Utils implements Shape {
    private String name;

    public double getMaxArea(Shape[] shapes) {
        double max = 0;
        for (Shape shape : shapes) {
            if (shape.getArea() > max) {
                max = shape.getArea();
            }
        }
        return max;
    }

    @Override
    public String toString() {
        return name;
    }


    @Override
    public String getName() {
        return name;
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
