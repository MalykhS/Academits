package ru.academits.malykh.matrix;

import java.util.Arrays;

public class Matrix {
    private int row;
    private int column;
    private double[][] matrix;

    public Matrix(int row, int column) {
        if (row < 1 || column < 1) {
            throw new RuntimeException("Values must be greater than to zero");
        }
        this.matrix = new double[row][column];
    }

    public Matrix(Matrix matrix) {
        this.matrix = Arrays.copyOf(matrix.matrix, matrix.matrix.length);
    }

    public Matrix(double[][] matrix) {
        this.matrix = Arrays.copyOf(matrix, matrix.length);
    }

    public Matrix(Vector[] vectors) {
       
    }

    public double[] getSize() {
        int rows = this.matrix.length;
        int columns = this.matrix[0].length;
        return new double[]{rows, columns};
    }

    public Matrix transpose() {
        Matrix m = new Matrix(row, column);
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                m.matrix[j][i] = this.matrix[i][j];
            }
        }
        return m;
    }

    public void runtimeException(Matrix matrix) {
        if (this.row != matrix.row || this.column != matrix.column) {
            throw new RuntimeException("Dimensions are different");
        }
    }

    public Matrix add(Matrix matrix) {
        runtimeException(matrix);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                this.matrix[i][j] += matrix.matrix[i][j];
            }
        }
        return matrix;
    }

    public Matrix sub(Matrix matrix) {
        runtimeException(matrix);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                this.matrix[i][j] -= matrix.matrix[i][j];
            }
        }
        return matrix;
    }

    public Matrix scalarMult(int number) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                this.matrix[i][j] *= number;
            }
        }
        return this;
    }

    //public double determinant()

    public static Matrix addition(Matrix m1, Matrix m2) {
        Matrix m3 = new Matrix(m1);
        return m3.add(m2);
    }

    public static Matrix subtraction(Matrix m1, Matrix m2) {
        Matrix m3 = new Matrix(m1);
        return m3.sub(m2);
    }

    public static Matrix multiplication(Matrix m1, Matrix m2) {
        double[][] array = new double[m1.matrix.length][m2.matrix.length];
        Matrix m3 = new Matrix(array);
        for (int i = 0; i < m1.matrix.length; i++) {
            for (int j = 0; j < m1.matrix[0].length; j++) {
                for (int k = 0; k < m1.matrix.length; k++) {
                    m3.matrix[i][j] += m1.matrix[i][k] * m2.matrix[k][j];
                }
            }
        }
        return m3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }

        Matrix matrix1 = (Matrix) o;

        if (row != matrix1.row || column != matrix1.column) {
            return false;
        }
        return Arrays.deepEquals(matrix, matrix1.matrix);
    }

    @Override
    public int hashCode() {
        int result = row;
        result = 31 * result + column;
        result = 31 * result + Arrays.deepHashCode(matrix);
        return result;
    }

    @Override
    public String toString() {
        return Arrays.deepToString(this.matrix);
    }
}