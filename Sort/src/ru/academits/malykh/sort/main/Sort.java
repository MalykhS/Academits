package ru.academits.malykh.sort.main;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Sort {
    private static void illegalFlag() {
        System.out.println("You entered an invalid flag! You must enter: \n -i -a for ascending numbers sort;\n " +
                "-i -d for descending numbers sort;\n -s -a for ascending strings sort; \n -s -d for descending " +
                "strings sort;");
    }

    public static void main(String[] args) {
        if (args.length != 4) {
            System.out.println("You must enter 4 arguments!");
            return;
        }
        try (Scanner scanner = new Scanner(new FileInputStream(args[0]));
             PrintWriter writer = new PrintWriter(args[1])) {

            switch (args[2]) {
                case "-i":
                    switch (args[3]) {
                        case "-a":
                            Utils.writeAscendingSortNumbersFile(scanner, writer);
                            break;
                        case "-d":
                            Utils.writeDescendingSortNumbersFile(scanner, writer);
                            break;
                        default:
                            illegalFlag();
                            break;
                    }

                    break;
                case "-s":
                    switch (args[3]) {
                        case "-a":
                            Utils.writeAscendingSortStringsFile(scanner, writer);
                            break;
                        case "-d":
                            Utils.writeDescendingSortStringsFile(scanner, writer);
                            break;
                        default:
                            illegalFlag();
                            break;
                    }
                    break;
                default:
                    illegalFlag();
                    break;
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File is not found!");
        } catch (InputMismatchException e) {
            System.out.println("Unsuitable data type!");
        }
    }
}
