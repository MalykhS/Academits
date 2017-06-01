package ru.academits.malykh.main;

import ru.academits.malykh.shapes.Shape;

import java.util.Comparator;

public class SortByAreaComparator implements Comparator<Shape> {

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
