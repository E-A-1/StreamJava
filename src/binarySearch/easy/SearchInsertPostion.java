package binarySearch.easy;

public class SearchInsertPostion {
    public static int searchInsertPosition(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            }

            // 3 greater current index 2
            if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }

        return end + 1;
    }

    public static void main(String[] args) {
        int array[] = { 4, 6, 6, 6, 10, 12, 18, 18, 20, 20, 30, 45 };
        int key = 19;

        System.out.println(SearchInsertPostion.searchInsertPosition(array, key));
    }
}
