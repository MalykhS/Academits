package ru.academits.malykh.sort;

import java.io.*;
import java.util.IllegalFormatFlagsException;

class Utils {
    static void fileReadException(String fileName) {
        try {
            FileInputStream str = new FileInputStream(fileName);
            str.read();
        } catch (IOException e) {
            System.out.println("File is not read!");
        }
    }

    static void fileWriteException(String fileName) {
        byte[] bytesToWrite = new byte[fileName.length()];
        try {
            FileOutputStream str = new FileOutputStream(fileName);
            str.write(bytesToWrite);
        } catch (IOException e) {
            System.out.println("File is not write!");
        }
    }

    static void arrayIndexOutOfBoundsException(String[] args) {
        try {
            throw new ArrayIndexOutOfBoundsException("");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("You must enter 4 arguments!");
        }
    }

    static void illegalFlagException(String[] args) {
        try {
            throw new IllegalFormatFlagsException("It is not right flag");
        } catch (IllegalFormatFlagsException e) {
            System.out.println("This flag can't be here use!");
        }
    }

    static void a(String[] args) {
        try {
            new PrintWriter(args[1]).write(1);
        } catch (IOException e) {
            System.out.println("This file can't be write!");
        }
    }

    static int[] getAscendingSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
        return array;
    }

    static int[] getDescendingSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] < temp) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
        return array;
    }

    static void ascendingSort(Comparable<String>[] c) {
        Comparable<String> stringComparable;
        int j;
        for (int i = 0; i < c.length; i++) {
            stringComparable = c[i];
            for (j = i - 1; j >= 0 && c[j].compareTo((String) stringComparable) > 0; j--) {
                c[j + 1] = c[j];
            }
            c[j + 1] = stringComparable;
        }
    }
}

