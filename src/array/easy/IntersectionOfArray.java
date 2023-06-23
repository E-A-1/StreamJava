package array.easy;

import java.util.ArrayList;
import java.util.Vector;

public class IntersectionOfArray {

    public static void findArrayIntersection(int arr1[], int arr2[]) {
        ArrayList<Integer> intersectionArray = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] < arr2[j]) {
                i++;
            }

            else if (arr1[i] > arr2[j]) {
                j++;
            }

            else {
                intersectionArray.add(arr1[i]);
                i++;
                j++;
            }

        }

        System.out.println(intersectionArray.toString());

    }

    public static void main(String[] args) {
        int firstArray[] = { 1, 2, 3, 4, 5, 6, 7 };
        int secondArray[] = { 4, 5, 6, 11, 14, 19, 20, 18, };

        IntersectionOfArray.findArrayIntersection(firstArray, secondArray);

    }
}
