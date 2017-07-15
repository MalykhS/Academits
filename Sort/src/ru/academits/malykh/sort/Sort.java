package ru.academits.malykh.sort;

import java.util.*;

class Sort {
    static <T> void sort(ArrayList<T> list, Comparator<T> c) {
        for (int i = 1; i < list.size(); i++) {
            T temp = list.get(i);
            int j = i - 1;

            while ((j >= 0) && c.compare(list.get(j), temp) > 0) {
                list.set((j + 1), list.get(j));
                j--;
            }
            list.set((j + 1), temp);
        }
    }
}


