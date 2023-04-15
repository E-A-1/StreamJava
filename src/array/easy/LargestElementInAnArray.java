package array.easy;

import java.util.Arrays;

public class LargestElementInAnArray {

    /*
     * https://takeuforward.org/data-structure/find-the-largest-element-in-an-array/
     * Using a max variable
     * 
     * Time Complexity: O(N)
     * 
     * Space Complexity: O(1)
     * 
     */

    public static int getMaxNumberInAnArray(int arr[]) {
        int maxNumber = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= maxNumber) {
                maxNumber = arr[i];
            }
        }

        return maxNumber;
    }

    private static void findMaxElementAlternative(int arr[]) {
        int maxElement = Integer.MIN_VALUE;
        int smallElement = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            smallElement = Math.min(smallElement, arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            maxElement = Math.max(maxElement, arr[i]);
        }

        System.out.println("Max element " + maxElement);
        System.out.println("Min element " + smallElement);
    }

    public static void main(String[] args) {
        int arr[] = { 8, 6, 2, 4, 57, 9, 5, 1, 0 };
        /*
         * Sorting
         * Time Complexity: O(N*log(N))
         * 
         * Space Complexity: O(n)
         * 
         */

        Arrays.sort(arr);

        LargestElementInAnArray.findMaxElementAlternative(arr);
    }

}
