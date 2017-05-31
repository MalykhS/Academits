package ru.academits.malykh.main;

import ru.academits.malykh.shapes.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {new Rectangle(6, 4), new Square(3),
                new Circle(2),
                new Triangle(4, 6, 5, 3, 7, 10)};

        System.out.println(Utils.getMaxArea(shapes));
        System.out.println();
        System.out.println(Utils.getSecondMaxPerimeter(shapes));
    }
}