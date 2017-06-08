package ru.academits.malykh.matrix;

import java.util.Arrays;

public class Matrix {
    private double[][] matrix;

    public Matrix(int rows, int columns) {
        if (rows < 1 || columns < 1) {
            throw new RuntimeException("Values must be greater than to zero");
        }
        this.matrix = new double[rows][columns];
    }

    public Matrix(Matrix matrix) {
        this.matrix = Arrays.copyOf(matrix.matrix, matrix.matrix.length);
    }

    public Matrix(double[][] matrix) {
        this.matrix = Arrays.copyOf(matrix, matrix.length);
    }

    /*public Matrix(Vector vectors) {
        this.matrix =
    } */

    public double[] getSize() {
        int rows = this.matrix.length;
        int columns = this.matrix[0].length;
        return new double[]{rows, columns};
    }

    public double getRow(int index1, int index2) {
        return this.matrix[index1][index2] = index1;
    }

    @Override
    public String toString() {
        return Arrays.deepToString(this.matrix);
    }
}
