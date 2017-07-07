package ru.academits.malykh.sort.main;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

class Utils {
    private static void getAscendingSort(ArrayList<Integer> list) {
        for (int i = 1; i < list.size(); i++) {
            int temp = list.get(i);
            int j = i - 1;

            while (j >= 0 && list.get(j) > temp) {
                list.set((j + 1), list.get(j));
                j--;
            }
            list.set((j + 1), temp);
        }
    }

    private static void getDescendingSort(ArrayList<Integer> list) {
        for (int i = 1; i < list.size(); i++) {
            int temp = list.get(i);
            int j = i - 1;

            while (j >= 0 && list.get(j) < temp) {
                list.set((j + 1), list.get(j));
                j--;
            }
            list.set((j + 1), temp);
        }
    }

    private static void ascendingSort(ArrayList<String> list) {
        String str;
        int j;
        for (int i = 0; i < list.size(); i++) {
            str = list.get(i);
            for (j = i - 1; j >= 0 && list.get(j).compareTo(str) > 0; j--) {
                list.set((j + 1), list.get(j));
            }
            list.set((j + 1), str);
        }
    }

    private static void descendingSort(ArrayList<String> list) {
        String str;
        int j;
        for (int i = 0; i < list.size(); i++) {
            str = list.get(i);
            for (j = i - 1; j >= 0 && list.get(j).compareTo(str) < 0; j--) {
                list.set((j + 1), list.get(j));
            }
            list.set((j + 1), str);
        }
    }

    static void writeAscendingSortNumbersFile(Scanner scanner, PrintWriter writer) {
        ArrayList<Integer> list = new ArrayList<>();
        while (scanner.hasNextInt()) {
            list.add(scanner.nextInt());
        }

        Utils.getAscendingSort(list);
        for (int e : list) {
            writer.println(e);
        }
    }

    static void writeDescendingSortNumbersFile(Scanner scanner, PrintWriter writer) {
        ArrayList<Integer> list = new ArrayList<>();
        while (scanner.hasNextInt()) {
            list.add(scanner.nextInt());
        }

        Utils.getDescendingSort(list);
        for (int e : list) {
            writer.println(e);
        }
    }

    static void writeAscendingSortStringsFile(Scanner scanner, PrintWriter writer) {
        ArrayList<String> list = new ArrayList<>();
        while (scanner.hasNextLine()) {
            list.add(scanner.nextLine());
        }

        Utils.ascendingSort(list);
        for (String e : list) {
            writer.println(e);
        }
    }

    static void writeDescendingSortStringsFile(Scanner scanner, PrintWriter writer) {
        ArrayList<String> list = new ArrayList<>();
        while (scanner.hasNextLine()) {
            list.add(scanner.nextLine());
        }

        Utils.descendingSort(list);
        for (String e : list) {
            writer.println(e);
        }
    }
}