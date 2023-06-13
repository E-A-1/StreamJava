package practicePrincy;

public class SumOfSqCube {

    public static long getSum(int[] array) {
        long sum = 0;

        for (int i = 0; i < array.length; i++) {
            // loop the int array, if the number is even , get the square, else get the cube
            if (array[i] % 2 == 0) {
                long square = array[i] * array[i];
                sum += square;
            } else {

                long cube = array[i] * array[i] * array[i];
                sum += cube;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] inputArray = { 2, 3 };
        System.out.println(SumOfSqCube.getSum(inputArray));
    }
}
