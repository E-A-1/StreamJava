package sorting;

import java.util.Arrays;

public class SelectionSort {
    /*
     * 1) Find the minimum element in the unsorted array and swap it with the
     * element at the beginning
     * 2) The inner loop selects the minimum element in the unsorted array.
     * 
     * 
     * 
     * https://takeuforward.org/sorting/selection-sort-algorithm/
     */

    static int[] selectionSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int minI = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    minI = j;
                }
            }
            int temp = arr[minI];
            arr[minI] = arr[i];
            arr[i] = temp;
        }

        return arr;
    }

    public static void main(String[] args) {

        int array[] = { 5, 8, 6, 4, 2, 0, 9 };
        System.out.println(Arrays.toString(selectionSort(array)));

    }
}
