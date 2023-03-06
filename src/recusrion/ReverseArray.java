package recusrion;

public class ReverseArray {
   public static void reverseAnArray(int arr[],int index){
        while(index<=arr.length/2){
            int tempValue=arr[arr.length-index-1];
            arr[arr.length-index-1]=arr[index];
            arr[index]=tempValue;
        reverseAnArray(arr, index++);
        }
        System.out.println(arr);
    }

public static void main(String[] args) {
    int arr[]={1,2,3,4,5};
    ReverseArray.reverseAnArray(arr, 0);
}
}
