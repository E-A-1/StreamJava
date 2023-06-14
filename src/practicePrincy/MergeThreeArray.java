package practicePrincy;

public class MergeThreeArray {

    public static void mergeArrayBruteForce() {
        int x[] = { 1, 2, 3 };
        int y[] = { 4, 5, 6 };
        int z[] = { 7, 8, 9 };

        int resultArray[] = new int[x.length + y.length + z.length];

        for (int i = 0; i < x.length; i++) {
            resultArray[i] = x[i];
        }

        for (int i = 0; i < y.length; i++) {
            resultArray[x.length + i] = y[i];

        }

        for (int i = 0; i < z.length; i++) {
            resultArray[x.length + y.length + i] = z[i];

        }

        for (int value : resultArray) {
            System.out.print(value + " ");
        }
    }

    public static void mergeArrayUsingInBuilt() {
        int[] array1 = { 1, 2, 3 };
        int[] array2 = { 4, 5, 6 };
        int[] array3 = { 7, 8, 9 };

        int totalLength = array1.length + array2.length + array3.length;
        int[] mergedArray = new int[totalLength];

        System.arraycopy(array1, 0, mergedArray, 0, array1.length);
        System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);
        System.arraycopy(array3, 0, mergedArray, array1.length + array2.length, array3.length);

        // Output the merged array
        for (int element : mergedArray) {
            System.out.print(element + " ");
        }
    }

    public static void main(String[] args) {
        mergeArrayUsingInBuilt();
    }
}
