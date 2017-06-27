package ru.academits.malykh.matrix;

import ru.academits.malykh.vector.Vector;

import java.util.Arrays;

public class Matrix {
    private Vector[] vectors;

    public Matrix(int row, int column) {
        if (row < 1 || column < 1) {
            throw new RuntimeException("Values must be greater than to zero");
        }
        this.vectors = new Vector[]{new Vector(row), new Vector(column)};
    }

    public Matrix(Matrix matrix) {
        this.vectors = Arrays.copyOf(matrix.vectors, matrix.vectors.length);
    }

    public Matrix(double[][] array) {
        this.vectors = new Vector[array.length];
        for (int i = 0; i < array.length; i++) {
            this.vectors[i] = new Vector(array[i]);
        }
    }

    public Matrix(Vector[] vectors) {
        this.vectors = Arrays.copyOf(vectors, vectors.length);
    }

    public void runtimeException(Matrix m1) {
        if (vectors.length != m1.vectors.length) {
            throw new RuntimeException("Illegal matrix dimensions");
        }
    }

    public int[] getSize() {
        int res = 0;
        for (Vector vector : vectors) {
            res = vector.getSize();
        }
        return new int[]{vectors.length, res};
    }

    public Vector getRow(int index) {
        return vectors[index];
    }

    public void setRow(int index, double[] array) {
        this.vectors[index] = new Vector(array);
    }

    public Matrix transpose(double[][] array) {

        double[][] temp = new double[array.length][array[0].length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                temp[i][j] = array[j][i];
            }
        }
        return new Matrix(temp);
    }

    public Matrix scalarMultiplication(int number) {
        for (int i = 0; i < this.vectors.length; i++) {
            this.vectors[i] = vectors[i].multiplication(number);
        }
        return this;
    }

    public double vectorMultiplication(Vector v1) {
        double res = 0;
        for (Vector vector : vectors) {
            res += Vector.scalarMultiplication(vector, v1);
        }
        return res;
    }

    public Matrix add(Matrix m1) {
        runtimeException(m1);
        for (int i = 0; i < this.vectors.length; i++) {
            this.vectors[i] = vectors[i].add(m1.vectors[i]);
        }
        return this;
    }

    public Matrix sub(Matrix m1) {
        runtimeException(m1);
        for (int i = 0; i < this.vectors.length; i++) {
            this.vectors[i] = vectors[i].sub(m1.vectors[i]);
        }
        return this;
    }

    public static Matrix addition(Matrix m1, Matrix m2) {
        if (m1.vectors.length != m2.vectors.length) {
            throw new RuntimeException("Illegal matrix dimensions");
        }
        Matrix m3 = new Matrix(m1);
        return m3.add(m2);
    }

    public static Matrix subtraction(Matrix m1, Matrix m2) {
        if (m1.vectors.length != m2.vectors.length) {
            throw new RuntimeException("Illegal matrix dimensions");
        }
        Matrix m3 = new Matrix(m1);
        return m3.sub(m2);
    }

    /*public Matrix multiplication(Matrix m1, Matrix m2) {

    } */

    public String toString() {
        return Arrays.deepToString(vectors);
    }
}