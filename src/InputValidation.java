import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class InputValidation {
    private static Scanner input = new Scanner(System.in);

    /**
     * Gets an integer from the user
     * @param prompt what to ask the user
     * @return int from user
     */
    public static int getInt(String prompt) {
        do  {
            System.out.println(prompt);
        } while (!input.hasNextInt());

        var num = input.nextInt();
        input.nextLine();
        return num;
    }

    /**
     * Gets an integer from the user
     * @param prompt what to ask the user
     * @param min minimum value, tries again if below this
     * @param max maximum value, tries again if above this
     * @return int from user
     */
    public static int getInt(String prompt, int min, int max) {
        int enteredNum;

        do {
            enteredNum = getInt(prompt);

            if (enteredNum < min || enteredNum > max) {
                System.out.println("Number must be between " + min + " and " + max + "!");
            }
        } while (enteredNum < min || enteredNum > max);

        //input.nextLine();
        return enteredNum;
    }

    /**
     * Gets a double from the user
     * @param prompt what to ask the user
     * @return a double from the user
     */
    public static double getDouble(String prompt) {
        do  {
            System.out.println(prompt);
        } while (!input.hasNextDouble());

        var num = input.nextDouble();
        input.nextLine();
        return num;
    }

    /**
     * Gets a string from the user
     * @param prompt what to ask the user
     * @return string from the user
     */
    public static String getString(String prompt) {
        do  {
            System.out.println(prompt);
        } while (!input.hasNextLine());

        return input.nextLine();
    }

    /**
     * Gets a file from the user
     * @param prompt what to ask the user
     * @return file from user
     * @throws FileNotFoundException uhh it has a change of dying
     */
    public static File getFile(String prompt) throws FileNotFoundException {
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
