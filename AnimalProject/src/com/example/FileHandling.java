package com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {
        try {
            // A. Handling file not found exception
            File file = new File("example.txt");
            Scanner scanner = new Scanner(file);

            // B. Handling empty file exception
            if (!scanner.hasNextLine()) {
                scanner.close();
                throw new EmptyFileException("Error: File is empty");
            }

            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                System.out.println(data);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        } catch (EmptyFileException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException occurred: " + e.getMessage());
        }

        // C. Runtime error example
        try {
            int var1 = 15;
            int var2 = 5;
            int var3 = 0;
            int ans1 = var1 / var2;
            int ans2 = var1 / var3;

            System.out.println("Division of var1 by var2 is: " + ans1);
            System.out.println("Division of var1 by var3 is: " + ans2);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurred: Division by zero");
        }
    }
}

class EmptyFileException extends IOException {
    public EmptyFileException(String errorMessage) {
        super(errorMessage);
    }
}

