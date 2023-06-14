package binarySearch.easy;

public class BinarySearch {

    public static void searchElement(int arr[], int start, int end, int elementToFind) {
        System.out.println("Iterations");
        if (start == end) {
            System.out.println("start -> " + start + " end -> " + end + " element not found-> ");
            return;
        }
        int mid = (start + end) / 2;
        if (arr[mid] == elementToFind) {
            System.out.println("start -> " + start + " end -> " + end + " element exists-> " + arr[mid]);
            return;
        }

        if (elementToFind > arr[mid]) {

            searchElement(arr, mid + 1, end, elementToFind);

        } else if (elementToFind < arr[mid]) {

            searchElement(arr, start, mid, elementToFind);

        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        BinarySearch.searchElement(arr, 0, arr.length, 7);
    }

}
