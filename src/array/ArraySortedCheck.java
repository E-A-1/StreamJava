package array;

public class ArraySortedCheck {

/*
 * 
 * Time complexity - O(N2)
 * Space complexity - O(1)
 * 
 */

    public static boolean isArraySorted(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    return false;
                }
            }
        }

        return true;
    }

    /*
 * 
 * Time complexity - O(N)
 * Space complexity - O(1)
 * 
 */


    public static boolean isArraySortedEfficiently(int arr[]){
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[] = { 1,12};
System.out.println("the array sorting is "+ArraySortedCheck.isArraySortedEfficiently(arr));
    }
}
