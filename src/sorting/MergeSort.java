package sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort implements MergeInterface {
    /*
     * Reference link below ::::::::
     * https://takeuforward.org/data-structure/merge-sort-algorithm/
     * 
     * 
     */

    @Override
    public void mergeSort(int[] arr, int low, int high) {
        System.out.println("merge sort");
        if (low >= high) {
            return;
        }

        int mid = (low + high) / 2;
        System.out.println("arr  ::" + Arrays.toString(arr) + "low ------ " + low + " ---- high ----" + high
                + " ----------- mid" + mid);

        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        mergeArray(arr, low, high, mid);

        System.out.println("End of merge sort");

    }

    @Override
    public void mergeArray(int[] arr, int left, int high, int mid) {
        System.out.println("start of merge array");

        ArrayList<Integer> tempArray = new ArrayList<>();
        int low = left;
        int right = mid + 1;

        while (left <= mid && right <= high) {
            if (arr[left] < arr[right]) {
                tempArray.add(arr[left]);
                left++;
            } else {
                tempArray.add(arr[right]);
                right++;
            }
        }

        while (left <= mid) {
            tempArray.add(arr[left]);
            left++;
        }

        while (right <= high) {
            tempArray.add(arr[right]);
            right++;
        }

        for (int i = low; i <= high; i++) {
            arr[i] = tempArray.get(i - low);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 9, 4, 8, 3, 7, 5, 1, 6, 4 };
        MergeSort sort = new MergeSort();
        sort.mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
