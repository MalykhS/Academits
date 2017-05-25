package ru.academits.malykh.main;

import ru.academits.malykh.shapes.*;

public class Main {
    public static void main(String[] args) {
        Shapes s = new Shapes(1, 2, 3, 4);
        Shapes kv = new Square(s.getWidth());

        System.out.println(s.getWidth());

        System.out.println("Площадь квадрата: " + kv.getArea());
        System.out.println("Периметр квадрата: " + kv.getPerimeter());
        System.out.println();

        Shapes rectangle = new Rectangle(s.getWidth(), s.getHeight());
        System.out.println("Площадь прямоугольника: " + rectangle.getArea());
        System.out.println("Периметр прямоугольника: " + rectangle.getPerimeter());
        System.out.println();

        Shapes triangle = new Triangle(1, 2, 3, 4, 5, 6);
        System.out.println("Площадь треугольника: " + triangle.getArea());
        System.out.println("Периметр треугольника: " + triangle.getPerimeter());
        System.out.println();

        Shapes circle = new Circle(s.getWidth());
        System.out.println("Площадь окружности: " + circle.getArea());
        System.out.println("Периметр окружности: " + circle.getPerimeter());
    }
}