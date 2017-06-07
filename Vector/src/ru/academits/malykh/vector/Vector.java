package ru.academits.malykh.vector;

import java.util.Arrays;

public class Vector {
    private double[] array;

    public Vector(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n is 0 or less than 0");
        } else {
            this.array = new double[n];
        }
    }

    public Vector(Vector vector) {
        this.array = Arrays.copyOf(vector.array, vector.array.length);
    }

    public Vector(double... array) {
        this.array = Arrays.copyOf(array, array.length);
    }

    public Vector(int n, double[] array) {
        if (n <= 0) {
            throw new IllegalArgumentException("n is 0 or less than 0");
        } else {
            this.array = Arrays.copyOf(array, n);
        }
    }

    public int getSize() {
        return this.array.length;
    }

    public double getElement(int index) {
        return this.array[index];
    }

    public void setElement(int index, double value) {
        this.array[index] = value;
    }

    public double getLength() {
        double sum = 0;
        for (double e : this.array) {
            sum += Math.pow(e, 2);
        }
        return Math.sqrt(sum);
    }

    public Vector add(Vector v2) {
        if (this.array.length >= v2.array.length) {
            for (int i = 0; i < v2.array.length; i++) {
                this.array[i] += v2.array[i];
            }
        } else {
            this.array = Arrays.copyOf(this.array, v2.array.length);
            for (int i = 0; i < this.array.length; i++) {
                this.array[i] += v2.array[i];
            }
        }
        return this;
    }

    public Vector sub(Vector v2) {
        if (this.array.length >= v2.array.length) {
            for (int i = 0; i < v2.array.length; i++) {
                this.array[i] -= v2.array[i];
            }
        } else {
            this.array = Arrays.copyOf(this.array, v2.array.length);
            for (int i = 0; i < this.array.length; i++) {
                this.array[i] -= v2.array[i];
            }
        }
        return this;
    }

    public Vector multiplication(double number) {
        for (int i = 0; i < this.array.length; i++) {
            this.array[i] *= number;
        }
        return this;
    }

    public Vector reverse() {
        return multiplication(-1);
    }

    public static Vector addition(Vector v1, Vector v2) {
        return new Vector(v1.add(v2));
    }

    public static Vector subtraction(Vector v1, Vector v2) {
        return new Vector(v1.sub(v2));
    }

    public static double scalar(double temp, Vector v1, Vector v2) {
        double number = 0;
        for (int i = 0; i < temp; i++) {
            number += v1.array[i] * v2.array[i];
        }
        return number;
    }

    public static double scalarMultiplication(Vector v1, Vector v2) {
        double v3;
        double temp = v1.array.length;
        double temp1 = v2.array.length;
        if (v1.array.length >= v2.array.length) {
            v3 = scalar(temp1, v1, v2);
        } else {
            v3 = scalar(temp, v1, v2);
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

        return Arrays.equals(array, vector.array);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }
}