package ru.academits.malykh.sort.main;

import java.io.*;
import java.util.Scanner;

public class Sort {
    private static void getIllegalFlag() {
        System.out.println("This flag can't be here use!");
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
                        case "-a": {
                            Utils.writeAscendingSortNumbersFile(scanner, writer);
                            break;
                        }
                        case "-d": {
                            Utils.writeDescendingSortNumbersFile(scanner, writer);
                            break;
                        }
                        default:
                            getIllegalFlag();
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
                            getIllegalFlag();
                            break;
                    }
                    break;
                default:
                    getIllegalFlag();
                    break;
            }
        } catch (FileNotFoundException e) {
            System.out.println("File is not found!");
        }
    }
}
