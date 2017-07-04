package ru.academits.malykh.matrix;

import ru.academits.malykh.vector.Vector;

import java.util.Arrays;

public class Matrix {
    private Vector[] rows;

    public Matrix(int row, int column) {
        if (row < 1 || column < 1) {
            throw new RuntimeException("Values must be greater than to zero");
        }
        this.rows = new Vector[]{new Vector(row), new Vector(column)};
    }

    public Matrix(Matrix matrix) {
        this.rows = Arrays.copyOf(matrix.rows, matrix.rows.length);
    }

    public Matrix(double[][] array) {
        this.rows = new Vector[array.length];
        for (int i = 0; i < array.length; i++) {
            this.rows[i] = new Vector(array[i]);
        }
    }

    public Matrix(Vector[] vectors) {
        this.rows = Arrays.copyOf(vectors, vectors.length);
    }

    public void getIllegalDimensions(Matrix m1) {
        if (rows.length != m1.rows.length) {
            throw new RuntimeException("Illegal matrix dimensions");
        }
    }

    /*public int[] getSize() {
        int res = 0;
        for (Vector vector : rows) {
            res = vector.getSize();
        }
        return new int[]{rows.length, res};
    } */

    public int getNumberRows() {
        return this.rows.length;
    }

    public int getNumberColumns() {
        return rows[0].getSize();
    }

    public void setRow(int index, Vector v1) {
        if (rows.length != v1.getSize()) {
            throw new RuntimeException("Illegal matrix dimensions");
        } else {
            this.rows[index] = new Vector(v1);
        }
    }

    public Vector getColumn(int index) {
        if (index >= rows[0].getSize()) {
            throw new ArrayIndexOutOfBoundsException("Index more than array length");
        }
        double[] array = new double[rows.length];
        for (int i = 0; i < rows.length; i++) {
            array[i] = rows[i].getElement(index);
        }
        return new Vector(array);
    }

    public void transpose() {
        for (int i = 0; i < getNumberColumns(); i++) {
            rows[i] = getColumn(0);
        }
    }

    public Matrix scalarMultiplication(int number) {
        for (int i = 0; i < this.rows.length; i++) {
            this.rows[i] = rows[i].multiplication(number);
        }
        return this;
    }

    /*public Vector vectorMultiplication(Vector v1) {
        Vector v2 = new Vector();
        for (int i = 0; i < rows.length; i++) {
            v2 = v1.;
            System.out.println(getColumn(i));
        }
        return v2;
    } */


        /*double res = 0;
        for (Vector vector : rows) {
            res += Vector.scalarMultiplication(vector, v1);
        }
        return res;
        return
    }

    public Matrix add(Matrix m1) {
        getIllegalDimensions(m1);
        for (int i = 0; i < this.rows.length; i++) {
            this.rows[i] = rows[i].add(m1.rows[i]);
        }
        return this;
    }

    public Matrix sub(Matrix m1) {
        getIllegalDimensions(m1);
        for (int i = 0; i < this.rows.length; i++) {
            this.rows[i] = rows[i].sub(m1.rows[i]);
        }
        return this;
    }

    public static Matrix addition(Matrix m1, Matrix m2) {
        if (m1.rows.length != m2.rows.length) {
            throw new RuntimeException("Illegal matrix dimensions");
        }
        Matrix m3 = new Matrix(m1);
        return m3.add(m2);
    }

    public static Matrix subtraction(Matrix m1, Matrix m2) {
        if (m1.rows.length != m2.rows.length) {
            throw new RuntimeException("Illegal matrix dimensions");
        }
        Matrix m3 = new Matrix(m1);
        return m3.sub(m2);
    }

    /*public Matrix multiplication(Matrix m1, Matrix m2) {

    } */

    @Override
    public String toString() {
        return Arrays.toString(rows);
    }
}