package array.medium;

public class MaxSubArray {

    /*
     * https://takeuforward.org/data-structure/kadanes-algorithm-maximum-subarray-
     * sum-in-an-array/
     */

    public long maxSubArrayUsingKadane(int arr[]) {
        int maxSum = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum < 0)
                sum = 0;

            if (sum > maxSum)
                maxSum = sum;

        }
        /*
         * Time Complexity: O(N), where N = size of the array.
         * Reason: We are using a single loop running N times.
         * 
         * Space Complexity: O(1) as we are not using any extra space.
         *
         */

        return maxSum;

    }

}
