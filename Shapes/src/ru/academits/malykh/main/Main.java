package ru.academits.malykh.main;

import ru.academits.malykh.shapes.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {new Square(5), new Circle(4), new Rectangle(6, 3)};

        System.out.println(Arrays.toString(shapes));
        System.out.println();
        System.out.println(Utils.getMaxArea(shapes));
        System.out.println();
        System.out.println(Utils.getSecondPerimeter(shapes));
    }

}