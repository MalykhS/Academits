package ru.academits.malykh.main;

import ru.academits.malykh.range.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Range range = new Range(1, 7);
        Range range1 = new Range(-5, 7);
        System.out.println("Интервал объединения равен: " + Arrays.toString(range.getJoin(range1)));
        System.out.println("Интервал пересечения равен: " + range.getIntersection(range1));
        System.out.println("Разность интервалов равна: " + Arrays.toString(range.getDifference(range1)));
    }
}