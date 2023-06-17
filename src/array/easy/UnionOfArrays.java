package array.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UnionOfArrays {

    private void findUnionInArrays(int arr1[], int arr2[]) {
        List<Integer> unionIntegerList = new ArrayList<>();

        Map<Integer, Integer> unionMap = new HashMap<>();

        for (int arr : arr1) {
            if (!unionMap.containsKey(arr)) {
                unionMap.put(arr, 1);
            }
        }

        for (int arr : arr2) {
            if (!unionMap.containsKey(arr)) {
                unionMap.put(arr, 1);
            } else {
                unionMap.put(arr, unionMap.get(arr) + 1);

            }
        }
    }

    private static ArrayList<Integer> unionInSortedArray(int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;
        ArrayList<Integer> newArrayList = new ArrayList<>();
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                if (newArrayList.isEmpty() || newArrayList.get(newArrayList.size() - 1) != arr1[i]) {
                    newArrayList.add(arr1[i]);

                }
                i++;
            } else {
                if (newArrayList.isEmpty() || newArrayList.get(newArrayList.size() - 1) != arr2[j]) {
                    newArrayList.add(arr2[j]);

                }
                j++;
            }

        }

        while (i < arr1.length) {
            if (newArrayList.get(newArrayList.size() - 1) != arr1[i]) {
                newArrayList.add(arr1[i]);

            }
            i++;
        }

        while (j < arr2.length) {
            if (newArrayList.get(newArrayList.size() - 1) != arr2[j]) {
                newArrayList.add(arr2[j]);

            }
            j++;
        }

        return newArrayList;

    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 4, 5, 6 };
        int[] arr2 = { 5, 6, 7, 8 };
        System.out.println(UnionOfArrays.unionInSortedArray(arr1, arr2));

    }

}
