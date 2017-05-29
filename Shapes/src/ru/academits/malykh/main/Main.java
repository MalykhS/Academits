package ru.academits.malykh.main;

import com.sun.org.apache.regexp.internal.RE;
import ru.academits.malykh.shapes.*;

import java.util.Arrays;

public class Main {
    /*private static double getMaxArea(Shape[] shapes) {
        int maxArea = 0;
        for (Shape shape : shapes) {
            if (shape.getArea() > maxArea) {
                maxArea = (int) shape.getArea();
            }
        }
        return maxArea;
    }

    public String toString() {
        return
    } */


    public static void main(String[] args) {
        Shape[] shapes = {new Rectangle(4,6,"Rectangle1"), new Square(3, "Квадрат1"),
                new Rectangle(3,8,"Rectangle2"),
        new Triangle(4,6,5,3,7,10,"Triangle"), new Square(10, "Квадрат2"),
                new Rectangle(1,6, "Rectangle3")};
        System.out.println(Arrays.toString(shapes));

        Utils u = new Utils();
        System.out.println(u.getMaxArea(shapes));


      //  u.getPerimeter1(shapes);



       /* Shape square = new Square(3);
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
        System.out.println("Периметр: " + circle.getPerimeter()); */
    }
}