package array.medium;

import java.util.ArrayList;
import java.util.Arrays;

public class SetMatrixZero {
    public static void markRow(ArrayList<ArrayList<Integer>> ipMatrix, int rowSize, int rowCurrentIndex) {

        for (int i = 0; i < rowSize; i++) {
            if (ipMatrix.get(rowCurrentIndex).get(i) != 0) {
                ipMatrix.get(rowCurrentIndex).set(i, -1);
            }
        }
    }

    public static void markColumn(ArrayList<ArrayList<Integer>> ipMatrix, int columnSize, int colCurrentIndex) {

        for (int i = 0; i < columnSize; i++) {
            if (ipMatrix.get(i).get(colCurrentIndex) != 0) {
                ipMatrix.get(i).set(colCurrentIndex, -1);
            }
        }
    }

    public static ArrayList<ArrayList<Integer>> zeroMatrixBruteForce(ArrayList<ArrayList<Integer>> inputMatrix,
            int columnSize, int rowSize) {

        for (int i = 0; i < columnSize; i++) {
            for (int j = 0; j < rowSize; j++) {
                if (inputMatrix.get(i).get(j) == 0) {
                    markColumn(inputMatrix, columnSize, j);
                    markRow(inputMatrix, rowSize, i);

                }
            }
        }
        for (int i = 0; i < columnSize; i++) {
            for (int j = 0; j < rowSize; j++) {
                if (inputMatrix.get(i).get(j) == -1) {
                    inputMatrix.get(i).set(j, 0);
                }
            }
        }

        return inputMatrix;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 0, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
        int columnSize = matrix.size();
        int rowSize = matrix.get(0).size();
        ArrayList<ArrayList<Integer>> ans = SetMatrixZero.zeroMatrixBruteForce(matrix, columnSize, rowSize);

        System.out.println("The Final matrix is: ");
        for (ArrayList<Integer> row : ans) {
            for (Integer ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
