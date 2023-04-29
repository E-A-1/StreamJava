package array.medium;

import java.util.ArrayList;
import java.util.Arrays;

public class DutchNationalFlagAlgo {

    /*
     * Time Complexity: O(N), where N = size of the given array.
     * Reason: We are using a single loop that can run at most N times.
     * 
     * Space Complexity: O(1) as we are not using any extra space.
     * https://takeuforward.org/data-structure/sort-an-array-of-0s-1s-and-2s/
     * 
     */

    public static void sortArray(int arr[]) {

        int low = 0, mid = 0;
        int high = arr.length - 1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                mid++;
                low++;
            }

            else if (arr[mid] == 1) {
                mid++;
            }

            else {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }

        }

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr[] = { 0, 2, 1, 2, 0, 1 };

        ArrayList<Integer> arrr = new ArrayList<>(Arrays.asList(new Integer[] { 0, 2, 1, 2, 0, 1 }));

        DutchNationalFlagAlgo.sortArray(arr);
    }

    public static void sortArray(ArrayList<Integer> arr, int n) {
        int low = 0, mid = 0, high = n - 1; // 3 pointers

        while (mid <= high) {
            if (arr.get(mid) == 0) {
                // swapping arr[low] and arr[mid]
                int temp = arr.get(low);
                arr.set(low, arr.get(mid));
                arr.set(mid, temp);

                low++;
                mid++;

            } else if (arr.get(mid) == 1) {
                mid++;

            } else {
                // swapping arr[mid] and arr[high]
                int temp = arr.get(mid);
                arr.set(mid, arr.get(high));
                arr.set(high, temp);

                high--;
            }
        }
        System.out.println(arr);

    }

}
