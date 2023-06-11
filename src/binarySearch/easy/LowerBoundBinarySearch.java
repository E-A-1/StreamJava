package binarySearch.easy;

import java.util.Arrays;

public class LowerBoundBinarySearch {
    // lower bound - returns the first element in the array which has a value less
    // than the key.. This means that the function returns the index of the next
    // smallest number just greater than or equal to that number

    public static int lowerBound(int arr[], int key) {

        for (int i = 0; i < arr.length; i++) {

            if (!(key > arr[i])) {

                return i;

            }

        }
        return -1;
        /*
         * As I can , the time complexity here is O(N) and space complexity is O(1)
         */
    }

    public static int lowerBoundIteratively(int[] array, int key) {

        int low = 0;
        int high = array.length;
        int mid = 55;

        while (low < high) {
            mid = (low + high) / 2;

            if (key <= array[mid]) {
                high = mid;
            } else {
                low = mid + 1;
            }

        }
        System.out.println("the array start point is " + low);
        System.out.println("the array end point is " + high);
        System.out.println("the mid  point is " + mid);

        return low;

    }

    public static int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int resultArray[] = new int[2];
        while (start < end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                resultArray[0] = start;
                resultArray[1] = end;
                return resultArray;
            }

            if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        resultArray[0] = -1;
        resultArray[1] = -1;
        return resultArray;

    }

    public static void main(String[] args) {
        int array[] = { 4, 6, 6, 6, 10, 12, 18, 18, 20, 20, 30, 45 };
        int key = 6;

        System.out.println(Arrays.toString(LowerBoundBinarySearch.searchRange(array, key)));
    }
}
