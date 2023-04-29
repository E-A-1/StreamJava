package array.easy;

import java.util.Arrays;
import java.util.HashMap;

public class ReplaceZerosInArray {
    // Brute Force

    // Time complexity: o(n)

    // Space complexity: o(n)
    public static void zerosToEnd(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        int n = arr.length;
        int temp[] = new int[n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                temp[k] = arr[i];
                k++;
            }
        }

        while (k < n) {
            temp[k] = 0;
            k++;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(temp[i] + " ");
        }
    }

    // Optimal Solution
    // Time complexity: O(n)

    // Space complexity: O(1)
    public static int[] zeroSToEndOptimal(int arr[]) {
        int n = arr.length;
        int k = 0;
        while (k < n) {
            if (arr[k] == 0) {
                break;
            } else {
                k++;
            }
        }

        int i = k;
        int j = k + 1;

        while (i < arr.length && j < arr.length) {
            if (arr[j] != 0) {

                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
            }
            j++;
        }

        return arr;
    }

    public static void main(String[] args) {
        int array[] = { 0, 8, 0, 6, 4, 0, 6 };
        int replacedArray[] = ReplaceZerosInArray.zeroSToEndOptimal(array);

        System.out.println(Arrays.toString(replacedArray));
    }
}
