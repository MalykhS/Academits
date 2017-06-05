package ru.academits.malykh.vector;

import java.util.Arrays;

public class Vector {
    private double[] array;
    private int n;

    public Vector(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n is 0 or less than 0");
        }
        this.n = n;
    }

    public Vector(Vector vector) {
        this.array = vector.array;
        this.n = vector.n;
    }

    public Vector(double... array) {
        this.array = array;
    }

    public Vector(int n, double[] array) {
        if (array.length < n) {
            for (int i = 0; i < array.length; i++) {
                array[i] = 0;
            }
        }
    }

    public int getSize() {
        return n;
    }

    public double getElement(int index) {
        return this.array[index];
    }

    public void setElement(int index, double value) {
        this.array[index] = value;
    }

    public int getLength() {
        if (null == array) {
            return 0;
        }
        return array.length;
    }

    public Vector getAdd(Vector v1, Vector v2) {
        if (v1.getLength() == v2.getLength()) {
            for (int i = 0; i < v1.getLength(); i++) {
                v1.array[i] += v2.array[i];
            }
        }
        return v1;
    }

    public Vector getSub(Vector v1, Vector v2) {
        if (v1.getLength() == v2.getLength()) {
            for (int i = 0; i < v1.getLength(); i++) {
                v1.array[i] -= v2.array[i];
            }
        }
        return v1;
    }

    public Vector getMultiplication(Vector v1, double number) {
        for (int i = 0; i < v1.getLength(); i++) {
            v1.array[i] *= number;
        }
        return v1;
    }

    public Vector getReverse(Vector v1) {
        for (int i = 0; i < v1.getLength(); i++) {
            v1.array[i] *= -1;
        }
        return v1;
    }


    public static Vector getAddition(Vector v1, Vector v2) {
        Vector v3 = new Vector(v1);
        if (v1.getLength() == v2.getLength()) { //|| (v1.getLength() > v2.getLength())) {
            for (int i = 0; i < v1.getLength(); i++) {
                v3.array[i] = v1.array[i] + v2.array[i];
            }
        }
        return v3;
    }

    public static Vector getSubtraction(Vector v1, Vector v2) {
        Vector v3 = new Vector(v1);
        if (v1.getLength() == v2.getLength()) {
            for (int i = 0; i < v3.getLength(); i++) {
                v3.array[i] = v1.array[i] - v2.array[i];
            }
        }
        return v3;
    }

    public static Vector getScalarMultiplication(Vector v1, Vector v2) {
        Vector v3 = new Vector(v1);
        for (int i = 0; i < v3.getLength(); i++) {
            v3.array[i] = v1.array[i] * v2.array[i];
        }
        return v3;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }

        Vector vector = (Vector) o;

        if (n != vector.n) {
            return false;
        }
        return Arrays.equals(array, vector.array);
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(array);
        result = 31 * result + n;
        return result;
    }
}
