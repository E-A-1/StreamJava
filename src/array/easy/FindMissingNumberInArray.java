package array.easy;

public class FindMissingNumberInArray {

    public static int findMissingNumberInArray(int arr[], int n) {
        int s1 = (n * (n + 1)) / 2;
        int arraySum = 0;
        for (int i = 0; i < arr.length; i++) {
            arraySum += arr[i];
        }

        return s1 - arraySum;
    }

    public static void main(String[] args) {

        int arrr[] = { 1, 3, 4, 5 };
        System.out.println(FindMissingNumberInArray.findMissingNumberInArray(arrr, 5));

    }
}
