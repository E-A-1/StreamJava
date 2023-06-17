package array.easy;

import java.util.Arrays;

public class LeftRotateArrayOneIndex {
    /*
     * Time Complexity: O(n), as we iterate through the array only once.
     * 
     * Space Complexity: O(n) as we are using another array of size, same as the
     * given array.
     */

    public static int[] leftRotateArrayByOne(int arr[]) {

        int newArray[] = new int[arr.length];

        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println(i);
            newArray[i] = arr[i + 1];
        }

        newArray[arr.length - 1] = arr[0];
        return newArray;
    }

    /*
     * 
     * https://takeuforward.org/arrays/left-rotate-an-array-by-d-places/
     */
    public static int[] leftRotateArrayByNPlaces(int arr[], int n) {

        if (arr.length == 0)
            return arr;

        n = n % arr.length;

        if (n % arr.length == 0)
            return arr;

        int newArray[] = new int[arr.length];

        for (int i = 0; i < arr.length - n; i++) {
            newArray[i] = arr[n + i];
        }

        for (int j = 0; j < n; j++) {
            newArray[(arr.length - n) + j] = arr[j];

        }
        return newArray;
    }

    // private static int[] leftRotateArrayByOnePlace(int arr[]) {
    // for(int i=0;i<arr.length;i++){

    // }
    // }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 9, 6, 7, 5 }; // 7
        System.out.println(Arrays.toString(arr));
        int newRotatedArray[] = LeftRotateArrayOneIndex.leftRotateArrayByNPlacesSecond(arr, 5);

        System.out.println(Arrays.toString(newRotatedArray));

    }

    private static int[] leftRotateArrayByNPlacesSecond(int arr[], int k) {
        if (k == 0)
            return arr;
        k = k % arr.length;
        if (k % arr.length == 0)
            return arr;
        int[] newArray = new int[arr.length];
        for (int i = 0; i < arr.length - k; i++) {
            newArray[i] = arr[i + k];
        }

        for (int i = 0; i < k; i++) {

            newArray[newArray.length - k + i] = arr[i];
        }

        return newArray;
    }

}
