package ru.academits.malykh.sort.main;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Utils {
    static void illegalFlagException(String[] args) {
        System.out.println("This flag can't be here use!");
    }

    private static int[] getAscendingSort(int[] array) {
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

    private static int[] getDescendingSort(int[] array) {
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

    private static void ascendingSort(Comparable<String>[] c) {
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

    private static void descendingSort(Comparable<String>[] c) {
        Comparable<String> stringComparable;
        int j;
        for (int i = 0; i < c.length; i++) {
            stringComparable = c[i];
            for (j = i - 1; j >= 0 && c[j].compareTo((String) stringComparable) < 0; j--) {
                c[j + 1] = c[j];
            }
            c[j + 1] = stringComparable;
        }
    }

    static void writeAscendingSortNumbersFile(Scanner scanner, PrintWriter writer) {
        ArrayList<Integer> list = new ArrayList<>();
        while (scanner.hasNextInt()) {
            list.add(scanner.nextInt());
        }

        int[] array = new int[list.size()];
        for (int i = 0; i != list.size(); i++) {
            array[i] = list.get(i);
        }

        writer.println(Arrays.toString(Utils.getAscendingSort(array)));
    }

    static void writeDescendingSortNumbersFile(Scanner scanner, PrintWriter writer) {
        ArrayList<Integer> list = new ArrayList<>();
        while (scanner.hasNextInt()) {
            list.add(scanner.nextInt());
        }

        int[] array = new int[list.size()];
        for (int i = 0; i != list.size(); i++) {
            array[i] = list.get(i);
        }

        writer.println(Arrays.toString(Utils.getDescendingSort(array)));
    }

    static void writeAscendingSortStringsFile(Scanner scanner, PrintWriter writer) {
        ArrayList<String> list = new ArrayList<>();
        while (scanner.hasNextLine()) {
            list.add(scanner.nextLine());
        }

        String[] array1 = new String[list.size()];
        for (int i = 0; i != list.size(); i++) {
            array1[i] = String.valueOf(list.get(i));
        }

        Utils.ascendingSort(array1);
        writer.println(Arrays.toString(array1));
    }

    static void writeDescendingSortStringsFile(Scanner scanner, PrintWriter writer) {
        ArrayList<String> list = new ArrayList<>();
        while (scanner.hasNextLine()) {
            list.add(scanner.nextLine());
        }

        String[] array1 = new String[list.size()];
        for (int i = 0; i != list.size(); i++) {
            array1[i] = String.valueOf(list.get(i));
        }

        Utils.descendingSort(array1);
        writer.println(Arrays.toString(array1));
    }

}