package ru.academits.malykh.main;

import ru.academits.malykh.vector.Vector;

public class Main {
    public static void main(String[] args) {
        Vector vector1 = new Vector(1, 2, 3, 4, 5, 4);
        Vector vector2 = new Vector(2, 3, 4, 5, 6, 10, 19);
        Vector vector3 = new Vector();
        double[] array = {6, 2, 3, 4, 5, 6, 7};

        System.out.println(vector1.reverse());
    }
}