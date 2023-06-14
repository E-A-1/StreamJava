package practicePrincy;

import java.util.Scanner;

public class StringAsInput {
    public static int[] getStringAsInput() {
        // created a input instance
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the array elements");
        String inputValue = scanner.nextLine(); // getting a string as input which is int array seperated by space
        String[] inputStringArray = inputValue.split(" "); // converting a string to string array[]

        int[] inputIntElements = new int[inputStringArray.length]; // initailizing a int array

        for (int i = 0; i < inputIntElements.length; i++) {

            inputIntElements[i] = Integer.parseInt(inputStringArray[i]); // parsing the string to integer
        }
        System.out.println("Array elements entered ");

        for (int value : inputIntElements) {
            System.out.print(value + " ");
        }

        System.out.println(" ");

        return inputIntElements;

    }

    public static void main(String[] args) {
        int[] inputArray = getStringAsInput();
        System.out.println("the input value entered is " + inputArray);

    }
}
