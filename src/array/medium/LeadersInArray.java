package array.medium;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class LeadersInArray {
    private static List<Integer> findLeadersInArrayBruteForce(int arr[]) {
        List<Integer> leadersArray = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            boolean isLead = true;
            for (int j = i; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    isLead = false;
                }
            }

            if (isLead) {
                leadersArray.add(arr[i]);
            }
        }

        return leadersArray;
    }

    private static List<Integer> findLeadersInArrayOptimized(int arr[]) {
        int maxElement = Integer.MIN_VALUE;
        List<Integer> leadersArray = new ArrayList<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > maxElement) {
                maxElement = arr[i];
                leadersArray.add(arr[i]);
            }
        }
        return leadersArray;
    }

    public static void main(String[] args) {
        int inputArray[] = { 10, 22, 12, 3, 0, 6 };
        List<Integer> outputList = LeadersInArray.findLeadersInArrayOptimized(inputArray);
        Collections.sort(outputList, Collections.reverseOrder());
        System.out.println(outputList);
    }
}
