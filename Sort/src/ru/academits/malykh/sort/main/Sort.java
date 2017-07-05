package ru.academits.malykh.sort.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Sort {
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
                            Utils.illegalFlagException(args);
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
                            Utils.illegalFlagException(args);
                            break;
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