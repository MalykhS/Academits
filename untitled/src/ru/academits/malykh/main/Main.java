package ru.academits.malykh.main;

import ru.academits.malykh.range.*;

public class Main {
    public static void main(String[] args) {
        Range range = new Range(1, 7);

        range.getIntervalsIntersection(3, 5);
        range.getIntervalsJoin(3, 5);
        range.getIntervalsDifferences(3, 5);

    }
}