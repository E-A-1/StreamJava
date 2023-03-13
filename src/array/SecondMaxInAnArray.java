package array;

import java.util.Arrays;

public class SecondMaxInAnArray {

    /*
     * 
     * Time Complexity: O(NlogN), For sorting the array
     * 
     * Space Complexity: O(1)
     */
    static private void getElements(int[] arr, int n) {
        if (n == 0 || n == 1) {
            System.out.print(-1);
            System.out.print(" ");
            System.out.print(-1);
            System.out.print("\n");
        }
        Arrays.sort(arr);
        int small = arr[1];
        int large = arr[n - 2];
        System.out.println("Second smallest is " + small);
        System.out.println("Second largest is " + large);
    }

    /*
     * https://takeuforward.org/data-structure/find-second-smallest-and-second-
     * largest-element-in-an-array/
     * bETTER sOLUTION
     * 
     * Time Complexity: O(N), We do two linear traversals in our array
     * 
     * Space Complexity: O(1)
     */
    public static int getSecondMaxElement(int arr[]) {

        int maxNumber = arr[0];
        int secondMaxNumber = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= maxNumber) {
                maxNumber = arr[i];
            }

        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != maxNumber && arr[i] >= secondMaxNumber) {
                secondMaxNumber = arr[i];
            }

        }
        return secondMaxNumber;
    }

    /*
     * Best solution
     * Second smallest is 2
     * Second largest is 5
     * 
     * Time Complexity: O(N), Single-pass solution
     * 
     * Space Complexity: O(1)
     */

    public static void getSecondLargestElement(int arr[]) {
        int largeElement = Integer.MIN_VALUE;
        int secondMaxElement = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= largeElement) {
                secondMaxElement = largeElement;
                largeElement = arr[i];

            } else if (arr[i] != largeElement && arr[i] >= secondMaxElement) {
                secondMaxElement = arr[i];
            }
        }

        System.out.println("the large element is " + largeElement);
        System.out.println("the second max element is " + secondMaxElement);
    }

    public static void main(String[] args) {
        int arr[] = { 8, 6, 2, 4, 57, 9, 5, 1, 0, 43 };
        SecondMaxInAnArray.getSecondLargestElement(arr);
    }
}
