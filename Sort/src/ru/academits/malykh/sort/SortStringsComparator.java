package ru.academits.malykh.sort;

import java.util.Comparator;

public class SortStringsComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        if (o1.compareTo(o2) < 0) {
            return -1;
        }
        if (o1.compareTo(o2) > 0) {
            return 1;
        }
        return 0;
    }
}
