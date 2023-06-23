package practicePrincy;

import java.util.Scanner;

public class UserMainCode {

    public static int validatePassword(String password) throws InvalidPasswordException {
        // Rule 1: Minimum length should be 8 characters
        if (password.length() < 8) {
            throw new InvalidPasswordException("Password length should be at least 8 characters");
        }

        // Rule 2: Must contain any one of these three special characters @ or _ or #
        if (!password.contains("@") && !password.contains("_") && !password.contains("#")) {
            throw new InvalidPasswordException("Password must contain either '@', '_', or '#'");
        }

        // Rule 3: May contain numbers or alphabets.
        if (!password.matches("[a-zA-Z0-9@_#]+")) {
            throw new InvalidPasswordException("Password can only contain letters, numbers, '@', '_', or '#'");
        }

        // Rule 4: Should not start with special character or number
        char firstChar = password.charAt(0);
        if (!Character.isLetter(firstChar)) {
            throw new InvalidPasswordException("Password should start with a letter");
        }

        // Rule 5: Should not end with special character
        char lastChar = password.charAt(password.length() - 1);
        if (!Character.isLetterOrDigit(lastChar)) {
            throw new InvalidPasswordException("Password should not end with a special character");
        }
        return 1; // Password is valid
    }

    public static String[] getPasswordInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the password length");
        // Getting the size of array
        int size = scanner.nextInt();

        // Initializing a new array with the array size entered in the input
        String[] inputArray = new String[size];

        // Filling the array with input value entered
        for (int i = 0; i < inputArray.length; i++) {

            // Get the element and then push it to the array
            String arrayElement = scanner.nextLine();

            inputArray[i] = arrayElement;
        }

        System.out.print("the array elements entered  as input are ");
        // Below loop just for print array entered as input
        for (String element : inputArray) {
            System.out.print(element + " ");
        }

        return inputArray;

    }

    public static void main(String[] args) {

        String[] inputPasswordArray = getPasswordInput();

        String password = "";
        for (int i = 0; i < inputPasswordArray.length; i++) {
            password += inputPasswordArray[i];
        }

        try {
            int result = UserMainCode.validatePassword(password);
            System.out.println("Password is valid");
        } catch (InvalidPasswordException e) {
            System.out.println("Invalid Password: " + e.getMessage());
        }
    }
}
