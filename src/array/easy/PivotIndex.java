package array.easy;

import java.util.HashMap;

public class PivotIndex {
    public static int pivotIndex(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            System.out.println("index" + i);
            int leftSum = PivotIndex.calculateSum(true, i, nums);
            System.out.println("left sum" + leftSum);

            int rightSum = PivotIndex.calculateSum(false, i, nums);
            System.out.println("right sum" + rightSum);

            if (leftSum == rightSum) {
                return i;
            }
        }

        // iterate the array
        // for each iteration , calculate sum of left side and right side,
        // if matches condition ,then return the index.

        return -1;
    }

    private static int calculateSum(boolean isLeft, int checkPoint, int[] array) {
        if ((checkPoint == 0 && isLeft) || (checkPoint == array.length && !isLeft)) {
            return 0;
        }
        int startPoint = isLeft ? 0 : checkPoint + 1;
        System.out.println("isLeft" + isLeft + "startPoint" + startPoint);
        ;
        int endPoint = isLeft ? checkPoint : array.length;

        System.out.println("isLeft" + isLeft + "endPoint" + endPoint);

        int sum = 0;
        for (int i = startPoint; i < endPoint; i++) {
            sum += array[i];
        }

        String value = "sdfsdf";
        for (int i = 0; i < value.length(); i++) {
            System.out.println(value.charAt(i));
        }
        String str = "Hello, world!";
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            // Do something with the character c
            map.put(c, 1);
        }

        return sum;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 7, 3, 6, 5, 6 };
        System.out.println(PivotIndex.pivotIndex(arr));
    }
}