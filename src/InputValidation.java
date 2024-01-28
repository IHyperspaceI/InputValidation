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

    public String getString(String prompt) {
        do  {
            System.out.println(prompt);
        } while (!input.hasNextLine());

        return input.nextLine();
    }
}
