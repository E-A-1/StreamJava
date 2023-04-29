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

    public static void main(String[] args) {

    }

}
