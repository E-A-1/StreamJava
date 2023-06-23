package array.easy;

import java.util.HashMap;

public class LongestSubArrayWithGivenSum {

    private static int findLongestSubArrayLength(int array[], int sumToFind) {
        int subArrayLength = 0;

        for (int i = 0; i < array.length; i++) {
            int sum = 0;

            for (int j = i; j < array.length; j++) {

                sum += array[j];

                if (sum == sumToFind) {
                    subArrayLength = Math.max(subArrayLength, j - i + 1);

                }

            }

        }

        return subArrayLength;
    }

    private static long findLongestSubArrayUsingHashMap(int array[], int valueToFind) {

        int prefixSum = 0;
        int maxLength = Integer.MIN_VALUE;
        HashMap<Integer, Integer> prefixSumMap = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            prefixSum += array[i];
            int target = prefixSum - valueToFind;

            if (prefixSum == valueToFind) {
                maxLength = Math.max(maxLength, i + 1);
            }

            if (prefixSumMap.containsKey(target)) {
                int index = prefixSumMap.get(target);
                int length = i - index;
                maxLength = Math.max(maxLength, length);
            }
            if (!prefixSumMap.containsKey(target)) {
                prefixSumMap.put(prefixSum, i);
            }
        }

        return maxLength;
        /*
         * Output: The length of the longest subarray is: 3
         * 
         * Time Complexity: O(N) or O(N*logN) depending on which map data structure we
         * are using, where N = size of the array.
         * Reason: For example, if we are using an unordered_map data structure in C++
         * the time complexity will be O(N)(though in the worst case, unordered_map
         * takes O(N) to find an element and the time complexity becomes O(N2)) but if
         * we are using a map data structure, the time complexity will be O(N*logN). The
         * least complexity will be O(N) as we are using a loop to traverse the array.
         * 
         * Space Complexity: O(N) as we are using a map data structure.
         */

    }

    private static long findLongestSubArrayUsingTwoPointer(int array[], int valueToFind) {
        int left = 0;
        int right = 0;
        int maxLength = Integer.MIN_VALUE;
        int n = array.length;
        long sum = array[0];
        while (right < n) {

            while (left <= right && sum > valueToFind) {
                sum -= array[left];
                left++;
            }

            if (sum == valueToFind) {

                maxLength = Math.max(maxLength, right - left + 1);
            }
            right++;

            if (right < n)
                sum += array[right];

        }
        /*
         * Output: The length of the longest subarray is: 3
         * 
         * Time Complexity: O(2*N), where N = size of the given array.
         * Reason: The outer while loop i.e. the right pointer can move up to index
         * n-1(the last index). Now, the inner while loop i.e. the left pointer can move
         * up to the right pointer at most. So, every time the inner loop does not run
         * for n times rather it can run for n times in total. So, the time complexity
         * will be O(2*N) instead of O(N2).
         * 
         * Space Complexity: O(1) as we are not using any extra space.
         * 
         * 
         * 
         * 
         */

        return maxLength;
    }

    private static int longestSubArrayWithGivenSum(int arr[], int valueToFind) {
        int maxSubArrayLength = Integer.MIN_VALUE;
        int sum = arr[0];
        int left = 0;
        int right = 0;
        while (right < arr.length) {
            while (left <= right && sum > valueToFind) {
                sum -= arr[left];
                left++;
            }

            if (sum == valueToFind) {
                maxSubArrayLength = Math.max(maxSubArrayLength, right - left + 1);
            }

            right++;
            if (right < arr.length)
                sum += arr[right];
        }
        return maxSubArrayLength;
    }

    public static void main(String[] args) {

        int arr[] = { 9, 2, 4, 4, 8, 2, 2, 2, 1, 1 };

        System.out.println(LongestSubArrayWithGivenSum.longestSubArrayWithGivenSum(arr, 7));
    }
}
