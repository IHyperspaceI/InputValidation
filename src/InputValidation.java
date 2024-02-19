package org.hillcrest.student;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class InputValidation {
    private Scanner input = new Scanner(System.in);

    public int getInt(String prompt) {
        do  {
            System.out.println(prompt);
        } while (!input.hasNextInt());

        return input.nextInt();
    }

    public int getInt(String prompt, int min, int max) {
        int enteredNum;

        do {
            enteredNum = getInt(prompt);

            if (enteredNum < min || enteredNum > max) {
                System.out.println("Number must be between " + min + " and " + max + "!");
            }
        } while (enteredNum < min || enteredNum > max);

        return enteredNum;
    }

    public double getDouble(String prompt) {
        do  {
            System.out.println(prompt);
        } while (!input.hasNextDouble());

        return input.nextDouble();
    }

    public String getString(String prompt) {
        do  {
            System.out.println(prompt);
        } while (!input.hasNextLine());

        return input.nextLine();
    }

    public File getFile(String prompt) throws FileNotFoundException {
        do  {
            System.out.println(prompt);
        } while (!input.hasNextLine());

        String fileInput = input.nextLine();

        while (!new File(fileInput).isFile()) {
            System.out.println("Not a valid file!");
            System.out.println(prompt);
            fileInput = input.nextLine();
        }
        return new File(fileInput);
    }
}
