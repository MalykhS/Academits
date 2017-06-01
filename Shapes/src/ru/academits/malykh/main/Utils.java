package ru.academits.malykh.main;

import ru.academits.malykh.shapes.Shape;

import java.util.Arrays;
import java.util.Comparator;

public class Utils implements Shape {

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

    public static class SortByArea implements Comparator<Shape> {

        @Override
        public int compare(Shape o1, Shape o2) {
            if (o1.getArea() < o2.getArea()) {
                return -1;
            } else if (o1.getArea() > o2.getArea()) {
                return 1;
            }
            return 0;
        }
    }

    public static class SortByPerimeter implements Comparator<Shape> {

        @Override
        public int compare(Shape o1, Shape o2) {
            if (o1.getPerimeter() < o2.getPerimeter()) {
                return -1;
            } else if (o1.getPerimeter() > o2.getPerimeter()) {
                return 1;
            }
            return 0;
        }
    }

    static String getMaxArea(Shape[] examples) {
        Arrays.sort(examples, new SortByArea());
        return Arrays.toString(new Shape[]{examples[examples.length - 1]});
    }

    static String getSecondPerimeter(Shape[] examples) {
        Arrays.sort(examples, new SortByPerimeter());
        return Arrays.toString(new Shape[]{examples[examples.length - 2]});
    }
}
