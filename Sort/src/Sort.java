import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Sort {
    private static int[] getAscendingSort(int[] array) {

        for (int i = 0; i < array.length; i++) {
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

    public static void main(String[] args) throws IOException {
        try (PrintWriter printWriter = new PrintWriter(args[1]);
        Scanner scanner = new Scanner(new FileInputStream(args[0]))) {
            if (args[0].equals("1.txt")) {
                ArrayList<Integer> list = new ArrayList<>();
                while (scanner.hasNextInt()) {
                    list.add(scanner.nextInt());
                }

                int[] array = new int[list.size()];
                for (int i = 0; i < array.length; i++) {
                    array[i] = list.get(i);
                }
                getAscendingSort(array);
            }
        }

    }

}
