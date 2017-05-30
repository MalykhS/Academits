package ru.academits.malykh.main;

import ru.academits.malykh.shapes.*;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {new Rectangle(6, 4), new Square(3),
                new Rectangle(3, 8),
                new Triangle(4, 6, 5, 3, 7, 10), new Square(9),
                new Rectangle(1, 6)};

        System.out.println(new Utils().getMaxArea(shapes));

        System.out.println(new Utils().getSecondMaxPerimeter(shapes));
    }
}