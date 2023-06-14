package practicePrincy;

import java.util.Scanner;

public class Searching {

    public int[] findfromArray(int[] ar) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter no to search");
        int key1 = sc.nextInt();

        int s = 0;
        int e = ar.length - 1;

        while (true)// to repeat the loop
        {
            int m = (s + e) / 2; // mid
            if (key1 == ar[m]) {
                System.out.println("found key at position " + m);
                break; // break it when the key is found
            } else if (key1 < ar[m]) {
                e = m - 1;
            } else {
                s = m + 1;

            }
        }
        return ar;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the array size");
        int arraySize = scanner.nextInt();

        int ar[] = new int[arraySize];
        System.out.println("Enter the array element");

        for (int i = 0; i < ar.length; i++) {
            int inputElement = scanner.nextInt();
            ar[i] = inputElement;
        }

        Searching obj = new Searching();
        obj.findfromArray(ar);

    }
}
