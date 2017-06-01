package ru.academits.malykh.vector;

import java.util.Arrays;

public class Vector {
    private double[] array;
    private int size;

    public Vector() {}

    public Vector(int size) {
        this.size = size;
    }

    public Vector(Vector vector) {
        this.array = vector.array;
        this.size = vector.size;
    }

    public Vector(double[] array) {
        this.array = array;
    }

    public Vector(int size, double[] array) {
        this.size = size;
        this.array = array;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getLength() {
        if (null == array) {
            return 0;
        }
        return array.length;
    }

    public static Vector getSum(Vector vector1, Vector vector2) {
        if (vector1.size != vector2.size) {
            System.err.println("Разный размер!");
        }

        return new Vector(vector1.size + vector2.size);
    }

    @Override

    public String toString() {
        return Arrays.toString(array);
    }
}
