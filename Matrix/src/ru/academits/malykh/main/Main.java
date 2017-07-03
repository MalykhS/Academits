package ru.academits.malykh.main;

import ru.academits.malykh.matrix.Matrix;
import ru.academits.malykh.vector.Vector;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        double[][] array = {{1, 2}, {3, 4}};
        double[] arr = {0, 1, 0};
        Vector v1 = new Vector(8, 2, 3);
        Vector[] vectors = new Vector[]{new Vector(1, 2, 3), new Vector(3, 4, 5), new Vector(2, 3, 4)};
        Matrix m1 = new Matrix(array);
        Matrix m2 = new Matrix(vectors);
        //m1.transpose();
        System.out.println(m1.vectorMultiplication(v1));
    }
}

