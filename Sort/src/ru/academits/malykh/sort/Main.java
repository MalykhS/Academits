package ru.academits.malykh.sort;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static void printIllegalFlag(String[] args) {
        if (!args[2].equals("-i") && (!args[2].equals("-s"))) {
            System.out.println("Not correct third argument! For help, type: -help");
        }
        if (!args[3].equals("-a") && (!args[3].equals("-d"))) {
            System.out.println("Not correct fourth argument! For help, type: -help");
        }
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("You did not enter arguments! For help, type: -help");
            return;
        }

        if (args[0].equals("-help")) {
            System.out.println("You must enter name input file, name output file and two options.");
            System.out.println("You can enter the following options:");
            System.out.println("-i -a for ascending sort numbers");
            System.out.println("-i -d for descending sort numbers");
            System.out.println("-s -a for ascending sort words");
            System.out.println("-s -d for descending sort words");
            return;
        }

        if (args.length != 4) {
            System.out.println("You must enter 4 arguments! For help, type: -help");
            return;
        }

        try (Scanner scanner = new Scanner(new FileInputStream(args[0]));
             PrintWriter writer = new PrintWriter(args[1])) {

            switch (args[2]) {
                case "-i":
                    switch (args[3]) {
                        case "-a":
                            Utils.writeSortNumbersFile(scanner, writer, new SortNumbersComparator());
                            break;
                        case "-d":
                            Utils.writeSortNumbersFile(scanner, writer, new SortNumbersComparator().reversed());
                            break;
                        default:
                            printIllegalFlag(args);
                            break;
                    }

                    break;
                case "-s":
                    switch (args[3]) {
                        case "-a":
                            Utils.writeSortStringsFile(scanner, writer, new SortStringsComparator());
                            break;
                        case "-d":
                            Utils.writeSortStringsFile(scanner, writer, new SortStringsComparator().reversed());
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
        } catch (InputMismatchException e) {
            System.out.println("Unsuitable data type!");
        }
    }
}