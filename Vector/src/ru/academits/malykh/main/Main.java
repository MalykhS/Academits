package ru.academits.malykh.main;

import ru.academits.malykh.vector.Vector;

public class Main {
    public static void main(String[] args) {
        double[] array = new double[]{1, 2, 3, 4, 5};
        double[] array1 = new double[]{2, 3, 4, 5, 6};
        Vector vector = new Vector(array);
        Vector vector1 = new Vector(array1);
        System.out.println(Vector.getSum(vector, vector1));
    }
}
