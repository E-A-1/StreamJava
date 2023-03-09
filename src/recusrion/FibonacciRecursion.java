package recusrion;

import java.util.Arrays;

public class FibonacciRecursion {
    static int[] fiboArray(int arr[],int index){
        if(index==15){
return arr;
        }

        arr[index]=arr[index-1]+arr[index-2];
       return fiboArray(arr, index+1);
    }

    public static void main(String[] args) {
        int defaultArray[]=new int[15];
        defaultArray[0]=0;defaultArray[1]=1;
        System.out.println(Arrays.toString(FibonacciRecursion.fiboArray(defaultArray, 2)));
    }
}
