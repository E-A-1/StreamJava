package recusrion;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseArray {
   public static int[] reverseAnArray(int arr[],int index){
        if(index<=arr.length/2){ 
            int tempValue=arr[arr.length-index-1];
            arr[arr.length-index-1]=arr[index];
            arr[index]=tempValue;     
            index  ++;
        reverseAnArray(arr, index);
        }
return arr;
    }

public static void main(String[] args) {
    int arr[]={1,2,3,4,5,6,7,8,9};
   int reversedArray[]= ReverseArray.reverseAnArray(arr, 0);
   System.out.println(Arrays.toString(reversedArray));
}
}
