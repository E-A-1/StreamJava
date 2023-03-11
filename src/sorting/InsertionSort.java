package sorting;

import java.util.Arrays;

public class InsertionSort {
    /*
     * 1)  Take an element from the unsorted array.
     * 2)  Place it in its corresponding position in the sorted part.
     * 3)  Shift the remaining elements accordingly.
     * 4)  In this approach, start iterating the “outer for loop”  from the 2nd position of the array.
     * 5)  The “inner while loop” shifts the elements using swapping.
     */

     static int[] insertionSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int j=i;
            while(j>0&&arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }

        return arr;
     }

     public static void main(String[] args) {
        int[] arr={15,85,62,42,96,102,25,0,635,21};

        System.out.println(Arrays.toString(InsertionSort.insertionSort(arr)));
     }
}
