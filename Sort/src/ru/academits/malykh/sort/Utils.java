package ru.academits.malykh.sort;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class Utils {

    private static ArrayList<Integer> readNumbersFile(Scanner scanner) {
        ArrayList<Integer> list = new ArrayList<>();
        while (scanner.hasNext()) {
            list.add(scanner.nextInt());
        }
        return list;
    }

    private static ArrayList<String> readStringsFile(Scanner scanner) {
        ArrayList<String> list = new ArrayList<>();
        while (scanner.hasNext()) {
            list.add(scanner.nextLine());
        }
        return list;
    }

    private static <T> void writeFile(PrintWriter writer, ArrayList<T> list) {
        for (T e : list) {
            writer.println(e);
        }
    }

    static void writeSortNumbersFile(Scanner scanner, PrintWriter writer, Comparator<Integer> comparator) {
        ArrayList<Integer> list = Utils.readNumbersFile(scanner);
        Sort.sort(list, comparator);
        Utils.writeFile(writer, list);
    }

    static void writeSortStringsFile(Scanner scanner, PrintWriter writer, Comparator<String> comparator) {
        ArrayList<String> list = Utils.readStringsFile(scanner);
        Sort.sort(list, comparator);
        Utils.writeFile(writer, list);
    }
}