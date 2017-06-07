package ru.academits.malykh.vector;

import java.util.Arrays;

import static java.util.Arrays.copyOf;

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
        this.array = copyOf(vector.array, vector.array.length);
    }

    public Vector(double... array) {
        this.array = copyOf(array, array.length);
    }

    public Vector(int n, double[] array) {
        if (array.length < n) {
            this.array = new double[n];
        } else if (n <= 0) {
            throw new IllegalArgumentException("n is 0 or less than 0");
        } else {
            this.array = copyOf(array, n);
        }
    }

    public int getSize() {
        if (this.array == null) {
            throw new NullPointerException();
        }
        return this.array.length;
    }

    public double getElement(int index) {
        return this.array[index];
    }

    public void setElement(int index, double value) {
        this.array[index] = value;
    }

    public double getLength() {
        if (null == array) {
            return 0;
        }
        double sum = 0;
        for (double anArray : this.array) {
            sum += Math.pow(anArray, 2);
            System.out.println(sum);
        }
        return Math.sqrt(sum);
    }

    public Vector add(Vector v2) {
        if (this.array.length == v2.array.length) {
            for (int i = 0; i < this.array.length; i++) {
                this.array[i] += v2.array[i];
            }
        } else if (this.array.length < v2.array.length) {
            this.array = copyOf(this.array, v2.array.length);
            for (int i = 0; i < this.array.length; i++) {
                this.array[i] += v2.array[i];
            }
        } else {
            for (int i = 0; i < v2.array.length; i++) {
                this.array[i] += v2.array[i];
            }
        }
        return this;
    }

    public Vector sub(Vector v2) {
        if (this.array.length == v2.array.length) {
            for (int i = 0; i < this.array.length; i++) {
                this.array[i] -= v2.array[i];
            }
        } else if (this.array.length < v2.array.length) {
            this.array = copyOf(this.array, v2.array.length);
            for (int i = 0; i < this.array.length; i++) {
                this.array[i] -= v2.array[i];
            }
        } else if (this.array.length > v2.array.length) {
            for (int i = 0; i < v2.array.length; i++) {
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
        for (int i = 0; i < this.array.length; i++) {
            this.array[i] *= -1;
        }
        return this;
    }

    public static Vector addition(Vector v1, Vector v2) {
        return v1.add(v2);
    }

    public static Vector subtraction(Vector v1, Vector v2) {
        return v1.sub(v2);
    }

    public static double scalarMultiplication(Vector v1, Vector v2) {
        double v3 = 0;
        for (int i = 0; i < v1.array.length; i++) {
            v3 += v1.array[i] * v2.array[i];
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