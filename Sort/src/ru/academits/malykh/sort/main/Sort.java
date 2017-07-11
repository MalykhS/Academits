package ru.academits.malykh.sort.main;

import java.util.ArrayList;

class Sort {
    static void getAscendingSort(ArrayList<Integer> list) {
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

    static void getDescendingSort(ArrayList<Integer> list) {
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

    static void ascendingSort(ArrayList<String> list) {
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

    static void descendingSort(ArrayList<String> list) {
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
}