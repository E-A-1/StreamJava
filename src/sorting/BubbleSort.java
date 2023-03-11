package sorting;

import java.util.Arrays;

public class BubbleSort {
    
    /*
     * 
     * 1) Repeatedly swap 2 adjacent elements if arr[j] > arr[j+1] .
     * 2) Here, the maximum element of the unsorted array reaches the end of the unsorted array after each iteration.
     * 3) Unlike selection sort, here, sorting is done from the back as shown in the dry run.
     * 4) After (N-1) iterations, we get a sorted array.
     * 
     * https://takeuforward.org/data-structure/bubble-sort-algorithm/
     */


     static int[] bubbleSort(int arr[]){
        for(int i=arr.length-1;i>0;i--){
            for(int j=0;j<=(i-1);j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
     }

     public static void main(String[] args) {
        int[] arr={15,85,62,42,96,102,25,0,635,21};
        System.out.println(Arrays.toString(BubbleSort.bubbleSort(arr)));
     }

     static void bubbleSortBestCase(int[] arr, int n) {
        for (int i = n - 1; i >= 0; i--) {
            int didSwap = 0;

            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    didSwap = 1;
                }
            }
            if (didSwap == 0) {
                break;
            }
        }

        System.out.println("After bubble sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
