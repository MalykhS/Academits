package ru.academits.malykh.main;

import ru.academits.malykh.matrix.Matrix;
import ru.academits.malykh.matrix.Vector;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Vector[] vectors = {new Vector(1,2,3), new Vector(2,3,4), new Vector(3,4,5)};
        Matrix m = new Matrix(6, 8);
        System.out.println(Arrays.deepToString(m.transpose()));
    }
}