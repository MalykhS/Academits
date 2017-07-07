package ru.academits.malykh.sort.main;

import java.io.*;
import java.util.Scanner;

public class Sort {
    private static void printIllegalFlag(String[] args) {
        if (!args[2].equals("-i") && (!args[2].equals("-s"))) {
            System.out.println("Not correct first argument! You must enter -i or -s");
        }
        if (!args[3].equals("-a") && (!args[3].equals("-d"))) {
            System.out.println("Not correct second argument! You must enter -a or -d!");
        }
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
                            printIllegalFlag(args);
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
                            printIllegalFlag(args);
                            break;
                    }
                    break;
                default:
                    printIllegalFlag(args);
                    break;
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File is not found!");
        }
    }
}