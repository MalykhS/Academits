import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) throws IOException {
        try (Scanner scanner = new Scanner(new FileInputStream(args[0]));
             PrintWriter writer = new PrintWriter(args[1])) {
            
            if (args[0].equals("1.txt") && args[2].equals("-i-a")) {
                ArrayList<Integer> list = new ArrayList<>();
                while (scanner.hasNextInt()) {
                    list.add(scanner.nextInt());
                }

                int[] array = new int[list.size()];
                for (int i = 0; i != list.size(); i++) {
                    array[i] = list.get(i);
                }

                writer.println(Arrays.toString(Utils.getAscendingSort(array)));

            } else if (args[0].equals("1.txt") && args[2].equals("-i-d")) {
                ArrayList<Integer> list = new ArrayList<>();
                while (scanner.hasNextInt()) {
                    list.add(scanner.nextInt());
                }

                int[] array = new int[list.size()];
                for (int i = 0; i != list.size(); i++) {
                    array[i] = list.get(i);
                }

                writer.println(Arrays.toString(Utils.getDescendingSort(array)));

            } else if (args[0].equals("1.txt") && args[2].equals("-s-a")) {
                ArrayList<String> list = new ArrayList<>();
                while (scanner.hasNextLine()) {
                    list.add(scanner.nextLine());
                }

                String[] array1 = new String[list.size()];
                for (int i = 0; i != list.size(); i++) {
                    array1[i] = String.valueOf(list.get(i));
                }

                Utils.getAscendingSort(array1);
                writer.println(Arrays.toString(array1));
            }
        }
    }
}