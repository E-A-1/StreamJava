package array.medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

    private static long longestConsSequenceBruteForce(int arr[]) {

        int ans = 1;
        int previous = arr[0];
        int current = 1;
        /**
         * Sorting the array
         */
        Arrays.sort(arr);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == previous + 1) {
                current++;
            } else {
                current = 1;
            }
            previous = arr[i];
            ans = Math.max(ans, current);
        }

        return ans;
    }

    private static long longestConsSequenceOptimal(int arr[]) {
        int longestStreak = 1;
        Set<Integer> arraySet = new HashSet<>();
        for (int num : arr) {
            arraySet.add(num);
        }

        for (int num : arr) {
            if (!arraySet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;
                while (arraySet.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                longestStreak = Math.max(currentStreak, longestStreak);
            }
        }

        return longestStreak;
    }

    public static void main(String[] args) {
        int arr[] = { 100, 200, 1, 2, 3, 4 };
        int anotherArray[] = { 3, 5, 6, 7 };
        System.out.println(LongestConsecutiveSequence.longestConsSequenceOptimal(anotherArray));
    }
}
