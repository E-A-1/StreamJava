package recusrion.easy;

public class SumOfNumbers {

    // parameterized
    static void findSum(int n, int sum) {
        System.out.println("Find sum -----" + sum + " -----------  n  " + n);

        if (n < 0) {
            System.out.println("the sum is " + sum);
            return;
        }
        sum = sum + n;
        n--;
        findSum(n, sum);
    }

    // functional
    static int findSumFunction(int n) {
        System.out.println("Find sum " + n);

        if (n == 0) {
            System.out.println("Inside the if condition");
            return 0;
        }

        return n + findSumFunction(n - 1);
    }

    public static void main(String[] args) {
        // System.out.println(SumOfNumbers.findSumFunction(10));

        SumOfNumbers.findSum(10, 0);
    }
}
