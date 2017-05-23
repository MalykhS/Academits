package ru.academits.malykh.main;

import ru.academits.malykh.range.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Range range = new Range(1, 7);
        Range range1 = new Range(0, 9);

        System.out.println("Интервал объединения равен: " + Arrays.toString(range.getIntervalsJoin(range1)));
        System.out.println("Интервал пересечения равен: " + Arrays.toString(range.getIntervalsIntersection(range1)));
        System.out.println("Разность интервалов равна: " + Arrays.toString(range.getIntervalsDifferences(range1)));
    }
}