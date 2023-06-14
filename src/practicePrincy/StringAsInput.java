package practicePrincy;

import java.util.Scanner;

public class StringAsInput {
    public static String getStringAsInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string");
        String inputValue = scanner.nextLine();

        return inputValue;

    }

    public static void main(String[] args) {
        String input = getStringAsInput();
        System.out.println("the input value entered is " + input);

    }
}
