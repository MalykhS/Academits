public class Utils {
   /* public static void getException(String[] args) {
        if (args[0].isEmpty()) {
            throw new ArrayIndexOutOfBoundsException("You must enter file name");
        } else if (args[1].isEmpty()) {
            throw new ArrayIndexOutOfBoundsException("You must enter sorting mode");
        }
    } */


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

    static void getAscendingSort(Comparable<String>[] c) {
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

