package ru.academits.malykh.main;

import ru.academits.malykh.matrix.Matrix;
import ru.academits.malykh.vector.Vector;

public class Main {
    public static void main(String[] args) {
        double[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Vector[] vectors = new Vector[]{new Vector(1, 2, 3), new Vector(3, 4, 5)};
        Matrix m1 = new Matrix(array);
        Matrix m2 = new Matrix(vectors);
        System.out.println(m1.getColumn());
    }
}
