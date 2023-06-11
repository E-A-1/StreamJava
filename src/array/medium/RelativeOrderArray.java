package array.medium;

import java.util.ArrayList;
import java.util.Arrays;

public class RelativeOrderArray {

    private static int[] relativeOrderOptimalApproach(int arr[]) {
        int postIndex = 0;
        int negIndex = 1;
        ArrayList<Integer> relativeArray = new ArrayList<>(arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i);
            if (arr[i] >= 0) {
                relativeArray.set(postIndex, arr[i]);
                postIndex += 2;
                System.out.println("ps" + i);

            }

            else {
                System.out.println("ns" + i);

                relativeArray.set(negIndex, arr[i]);
                negIndex += 2;
            }
        }

        return relativeArray.stream().mapToInt(i -> i).toArray();
    }

    private static int[] relativeOrder(int arr[]) {
        ArrayList<Integer> positiveArray = new ArrayList<>();
        ArrayList<Integer> negativeArray = new ArrayList<>();
        ArrayList<Integer> relativeArray = new ArrayList<>(arr.length);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                positiveArray.add(arr[i]);
            } else {
                negativeArray.add(arr[i]);

            }
        }

        for (int i = 0; i < arr.length / 2; i++) {
            System.out.println("ps" + i);
            relativeArray.add(2 * i, positiveArray.get(i));
            System.out.println("ng" + i);
            relativeArray.add((2 * i) + 1, negativeArray.get(i));

        }

        int[] array = relativeArray.stream().mapToInt(i -> i).toArray();

        /*
         * Time Complexity: O(N+N/2) { O(N) for traversing the array once for
         * segregating positives and negatives and another O(N/2) for adding those
         * elements alternatively to the array, where N = size of the array A}.
         * 
         * Space Complexity: O(N/2 + N/2) = O(N) { N/2 space required for each of the
         * positive and negative element arrays, where N = size of the array A}.
         **/

        return array;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 9, -1, -2, -5 };
        System.out.println(Arrays.toString(RelativeOrderArray.relativeOrderOptimalApproach(arr)));
    }
}
