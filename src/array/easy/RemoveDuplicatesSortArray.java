package array.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesSortArray {

    public static int[] removeDuplicates(int arr[]) {
        Set<Integer> arrSet = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            arrSet.add(arr[i]);
        }
        int newArray[] = new int[arr.length];
        List<Integer> arrList = new ArrayList<>(arrSet);
        System.out.println(arrList);
        for (int j = 0; j < arrList.size(); j++) {
            newArray[j] = arrList.get(j);
        }
        return newArray;
    }

    public static int removeDuplicatedWithoutCol(int arr[]) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }

        return i + 1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 2, 3, 6, 8, 9, 15, 16 };
        // int newArray[] = RemoveDuplicatesSortArray.removeDuplicatedInArray(arr);
        // System.out.println(Arrays.toString(newArray));

        RemoveDuplicatesSortArray.removeDuplicatedInArray(arr);
    }

    private static void removeDuplicatedInArray(int arr[]) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        System.out.println(set);
    }
}
