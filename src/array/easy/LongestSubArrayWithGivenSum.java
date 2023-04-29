package array.easy;

public class LongestSubArrayWithGivenSum {

    private static long findLongestSubArrayLength(int array[], int sumToFind) {
        long subArrayLength = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            subArrayLength++;
            if (sum == sumToFind)
                return subArrayLength;

            if (sum > sumToFind) {
                subArrayLength = 1;
                sum = array[i];

            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 4, 6, 8 };

        System.out.println(LongestSubArrayWithGivenSum.findLongestSubArrayLength(arr, 6));
    }
}
