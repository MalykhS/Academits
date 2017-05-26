package ru.academits.malykh.main;

import ru.academits.malykh.shapes.*;

public class Main {
    public static void main(String[] args) {
        Shape square = new Square(3);
        System.out.println("Площадь квадрата: " + square.getArea());
        System.out.println("Периметр: " + square.getPerimeter());
        System.out.println();

        Shape triangle = new Triangle(3, 5, 2, 9, 10, 13);
        System.out.println("Площадь треугольника: " + triangle.getArea());
        System.out.println("Периметр: " + triangle.getPerimeter());
        System.out.println();

        Shape rectangle = new Rectangle(4, 6);
        System.out.println("Площадь прямоугольника: " + rectangle.getArea());
        System.out.println("Периметр: " + rectangle.getPerimeter());
        System.out.println();

        Shape circle = new Circle(4);
        System.out.println("Площадь окружности: " + circle.getArea());
        System.out.println("Периметр: " + circle.getPerimeter());
    }
}