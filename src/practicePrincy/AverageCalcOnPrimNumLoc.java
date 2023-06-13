package practicePrincy;

public class AverageCalcOnPrimNumLoc {

    public static boolean checkPrime(int n) {
        int i, m = 0, flag = 0;
        m = n / 2;

        if (n == 0 || n == 1) {
            return false;
        } else {
            for (i = 2; i <= m; i++) {
                if (n % i == 0) {
                    flag = 1;

                }
            }
            if (flag == 0) {
                return true;
            }
        } // end of else
        return false;
    }

    public static double getAvgSumBasedonPrimeIndexLocation(int[] inputArray) {
        int totalCount = 0;
        int totalSum = 0;
        for (int i = 0; i < inputArray.length; i++) {
            boolean isPrimeNumber = AverageCalcOnPrimNumLoc.checkPrime(i);
            if (isPrimeNumber) {

                totalSum += inputArray[i];
                totalCount++;
            }

        }

        double average = totalSum / totalCount;
        double result = Math.round(average * 100.0) / 100.0;

        return result;
    }

    public static void main(String[] args) {
        int[] inputArray = { 1, 2, 3, 4, 5, 6, 7 };
        System.out.println(AverageCalcOnPrimNumLoc.getAvgSumBasedonPrimeIndexLocation(inputArray));
    }
}
