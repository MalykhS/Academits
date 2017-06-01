package ru.academits.malykh.main;

import ru.academits.malykh.shapes.Shape;

import java.util.Arrays;

class Utils  {

    static Shape getMaxArea(Shape[] shapes) {
        Arrays.sort(shapes, new SortByAreaComparator());
        return shapes[shapes.length - 1];
    }

    static Shape getSecondPerimeter(Shape[] shapes) {
        Arrays.sort(shapes, new SortByPerimeterComparator());
        return shapes[shapes.length - 2];
    }
}