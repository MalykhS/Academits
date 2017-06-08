package ru.academits.malykh.main;

import ru.academits.malykh.vector.Vector;

public class Main {
    public static void main(String[] args) {
        Vector vector1 = new Vector(1, 2, 3, 5);
        Vector vector2 = new Vector(2, 3, 4, 9);
        Vector vector3 = new Vector();
        double[] array = {6, 2, 3, 4, 5, 6, 7};

        System.out.println(Vector.addition(vector1, vector2));
    }
}