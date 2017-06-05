package ru.academits.malykh.main;

import ru.academits.malykh.vector.Vector;


public class Main {
    public static void main(String[] args) {
        Vector vector1 = new Vector(1, 2, 3, 4, 5, 1);
        Vector vector2 = new Vector(2, 3, 4, 5, 6);
        Vector vector3 = new Vector();

        System.out.println(Vector.getAddition(vector1, vector2));
        //System.out.println(Vector.getAddition(vector1, vector2));


    }
}
