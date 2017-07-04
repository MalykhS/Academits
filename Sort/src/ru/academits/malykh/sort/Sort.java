package ru.academits.malykh.sort;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) throws IOException {
        if (args.length != 4) {
            Utils.arrayIndexOutOfBoundsException(args);
        } else {
            try (Scanner scanner = new Scanner(new FileInputStream(args[0]));
                 PrintWriter writer = new PrintWriter(args[1])) {

                switch (args[2]) {
                    case "-i":
                        switch (args[3]) {
                            case "-a": {
                                ArrayList<Integer> list = new ArrayList<>();
                                while (scanner.hasNextInt()) {
                                    list.add(scanner.nextInt());
                                }

                                int[] array = new int[list.size()];
                                for (int i = 0; i != list.size(); i++) {
                                    array[i] = list.get(i);
                                }

                                writer.println(Arrays.toString(Utils.getAscendingSort(array)));
                                break;
                            }
                            case "-d": {
                                ArrayList<Integer> list = new ArrayList<>();
                                while (scanner.hasNextInt()) {
                                    list.add(scanner.nextInt());
                                }

                                int[] array = new int[list.size()];
                                for (int i = 0; i != list.size(); i++) {
                                    array[i] = list.get(i);
                                }

                                writer.println(Arrays.toString(Utils.getDescendingSort(array)));
                                break;
                            }
                            default:
                                Utils.illegalFlagException(args);
                                break;
                        }

                        break;
                    case "-s":
                        if (args[3].equals("-a")) {
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
                        } else {
                            Utils.illegalFlagException(args);
                        }
                        break;
                    default:
                        Utils.illegalFlagException(args);
                        break;
                }
            } catch (FileNotFoundException ex) {
                System.out.println("File is not found!");
            }
        }
    }
}