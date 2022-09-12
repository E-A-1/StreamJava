import java.util.Arrays;

public class ArraysSort {
    public static void main(String[] args) {
        System.out.println("Inside the main method");
        int arr[]= new int[4];
        arr[0]=1;
        arr[1]=0;
        arr[2]=2;
        arr[3]=-1;
        Arrays.sort(arr);
        System.err.println(arr);
        for(int a :arr){
            System.out.println("the int value is "+a);
        }

    }
}
