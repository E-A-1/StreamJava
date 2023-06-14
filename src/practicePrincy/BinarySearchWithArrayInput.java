package practicePrincy;

import java.util.Scanner;

import binarySearch.easy.BinarySearch;

public class BinarySearchWithArrayInput {
    public static int[] getArrayInputValue() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the size of array");
        // Getting the size of array
        int size = scanner.nextInt();

        // Initializing a new array with the array size entered in the input
        int[] inputArray = new int[size];
        System.out.println("Enter the array elements");

        // Filling the array with input value entered
        for (int i = 0; i < inputArray.length; i++) {
            System.out.println("Enter the element for " + i + "th index ");

            // Get the element and then push it to the array
            int arrayElement = scanner.nextInt();

            inputArray[i] = arrayElement;
        }

        System.out.print("the array elements entered  as input are ");
        // Below loop just for print array entered as input
        for (int element : inputArray) {
            System.out.print(element + " ");
        }

        scanner.close();

        return inputArray;

    }

    public static void main(String[] args) {
        int[] inputArray = getArrayInputValue();
        Scanner scanner = new Scanner(System.in);

        System.out.println(" ");
        System.out.println("Enter element to search in the array");

        int numberToSearch = scanner.nextInt();

        BinarySearch.searchElement(inputArray, 0, inputArray.length, numberToSearch);
    }
}
