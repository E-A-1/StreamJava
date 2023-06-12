package practicePrincy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // System.in is a standard input stream
        System.out.print("Enter the number to calculate the sum ");
        int input = sc.nextInt();
        int sum = UserMainCode.getDigitSum(input);
        System.out.println("the sum is " + sum);
    }
}
