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
        this.array = vector.array;
    }

    public Vector(double... array) {
        int size = this.getLength();
        array = new double[size];
        System.arraycopy(this.array, 0, array, 0, size);
    }

    public Vector(int n, double[] array) {
        if (array.length < n) {
            this.array = new double[n];
        } else {
            this.array = array;
        }
    }

    public int getSize(int n) {
        if (null == array) {
            return 0;
        }
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

    public Vector sumVectorsDifferentDimension(Vector v2) {
        if (this.array == null) {
            return v2;
        }

        if (v2 == null) {
            return new Vector(this.array);
        }

        if (this.array.length < v2.getLength()) {
            this.array = Arrays.copyOf(this.array, v2.array.length);
            for (int i = 0; i < this.array.length; i++) {
                this.array[i] += v2.array[i];
            }
            return new Vector(this.array);
        } else if (this.array.length > v2.getLength()) {
            for (int i = 0; i < v2.array.length; i++) {
                this.array[i] += v2.array[i];
            }
        }
        return new Vector(this.array);
    }

    public Vector subVectorsDifferentDimension(Vector v2) {
        if (this.array == null) {
            return v2;
        }

        if (v2 == null) {
            return new Vector(this.array);
        }

        if (this.array.length < v2.getLength()) {
            this.array = Arrays.copyOf(this.array, v2.array.length);
            for (int i = 0; i < this.array.length; i++) {
                this.array[i] -= v2.array[i];
            }
            return new Vector(this.array);
        } else if (this.array.length > v2.getLength()) {
            for (int i = 0; i < v2.array.length; i++) {
                this.array[i] -= v2.array[i];
            }
        }
        return new Vector(this.array);
    }

    public Vector add(Vector v2) {
        if (this.array == null) {
            return v2;
        }

        if (v2 == null) {
            return new Vector(this.array);
        }

        if (this.array.length == v2.getLength()) {
            for (int i = 0; i < this.array.length; i++) {
                this.array[i] += v2.array[i];
            }
        } else {
            sumVectorsDifferentDimension(v2);
        }
        return new Vector(this.array);
    }

    public Vector sub(Vector v2) {
        if (this.array == null) {
            return v2;
        }

        if (v2 == null) {
            return new Vector(this.array);
        }

        if (this.array.length == v2.getLength()) {
            for (int i = 0; i < this.array.length; i++) {
                this.array[i] -= v2.array[i];
            }
        } else {
            subVectorsDifferentDimension(v2);
        }
        return new Vector(this.array);
    }

    public Vector mult(Vector v1, double number) {
        for (int i = 0; i < v1.getLength(); i++) {
            v1.array[i] *= number;
        }
        return v1;
    }

    public Vector reverse(Vector v1) {
        for (int i = 0; i < v1.getLength(); i++) {
            v1.array[i] *= -1;
        }
        return v1;
    }

    public static Vector addition(Vector v1, Vector v2) {
        if (v1 == null) {
            return v2;
        }

        if (v2 == null) {
            return v1;
        }

        Vector v3 = new Vector(v1);
        if (v1.getLength() == v2.getLength()) {
            for (int i = 0; i < v1.getLength(); i++) {
                v3.array[i] = v1.array[i] + v2.array[i];
            }
        } else {
            v3 = v1.add(v2);
        }
        return v3;
    }

    public static Vector subtraction(Vector v1, Vector v2) {
        if (v1 == null) {
            return v2;
        }

        if (v2 == null) {
            return v1;
        }

        Vector v3 = new Vector(v1);
        if (v1.getLength() == v2.getLength()) {
            for (int i = 0; i < v3.getLength(); i++) {
                v3.array[i] = v1.array[i] - v2.array[i];
            }
        } else {
            v3 = v1.sub(v2);
        }
        return v3;
    }

    public static Vector scalarMultiplication(Vector v1, Vector v2) {
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

        return Arrays.equals(array, vector.array);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }
}