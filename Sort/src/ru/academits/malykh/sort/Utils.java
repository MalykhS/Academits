package ru.academits.malykh.sort.main;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

class Utils {

    private static void readNumbersFile(Scanner scanner, ArrayList<Integer> list) {
        while (scanner.hasNext()) {
            list.add(scanner.nextInt());
        }
    }

    private static void readStringsFile(Scanner scanner, ArrayList<String> list) {
        while (scanner.hasNext()) {
            list.add(scanner.nextLine());
        }
    }

    private static <T> void writeFile(PrintWriter writer, ArrayList<T> list) {
        for (T e : list) {
            writer.println(e);
        }
    }

    static void writeAscendingSortNumbersFile(Scanner scanner, PrintWriter writer) {

        ArrayList<Integer> list = new ArrayList<>();
        Utils.readNumbersFile(scanner, list);

        Sort.sort(list, new SortNumbersComparator());
        Utils.writeFile(writer, list);
    }

    static void writeDescendingSortNumbersFile(Scanner scanner, PrintWriter writer) {
        ArrayList<Integer> list = new ArrayList<>();
        Utils.readNumbersFile(scanner, list);

        Sort.sort(list, new SortNumbersComparator().reversed());
        Utils.writeFile(writer, list);
    }

    static void writeAscendingSortStringsFile(Scanner scanner, PrintWriter writer) {
        ArrayList<String> list = new ArrayList<>();
        Utils.readStringsFile(scanner, list);

        Sort.sort(list, new SortStringsComparator());
        Utils.writeFile(writer, list);
    }

    static void writeDescendingSortStringsFile(Scanner scanner, PrintWriter writer) {
        ArrayList<String> list = new ArrayList<>();
        Utils.readStringsFile(scanner, list);

        Sort.sort(list, new SortStringsComparator().reversed());
        Utils.writeFile(writer, list);
    }
}