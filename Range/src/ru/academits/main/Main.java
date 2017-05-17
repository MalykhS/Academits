package ru.academits.main;

import ru.academits.range.*;

public class Main {
    public static void main(String[] args) {
        Range range = new Range(3.5, 9);
        System.out.println(range.getFrom());
        range.setFrom(4.4);

        System.out.println(range.getFrom());
        System.out.println(range.getTo());
        range.setTo(10.0);

        System.out.println(range.getTo());
        System.out.println("Длина интервала равна: " + range.getLength());
        System.out.println("Принадлежит ли данное число интервалу заданному интервалу ? " + range.isInside(3.6));
    }
}