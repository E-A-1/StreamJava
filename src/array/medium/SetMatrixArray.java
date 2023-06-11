package array.medium;

import java.io.*;
import java.util.*;

public class SetMatrixArray {

    static void markRow(int matrix[][],
            int currentRow, int rowLength) {
        for (int i = 0; i < rowLength; i++) {
            if (matrix[currentRow][i] != 0) {
                matrix[currentRow][i] = -1;

            }
        }

    }

    static void markColumn(int matrix[][],
            int currentColumn, int columnLength) {
        for (int i = 0; i < columnLength; i++) {
            if (matrix[i][currentColumn] != 0) {
                matrix[i][currentColumn] = -1;

            }
        }
    }

    public static void setZeros(int matrix[][]) {
        int rowLength = matrix.length;
        int columnLength = matrix[0].length;
        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < columnLength; j++) {
                if (matrix[i][j] == 0) {
                    markColumn(matrix, j, columnLength);
                    markRow(matrix, i, rowLength);
                }
            }
        }

        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < columnLength; j++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = 0;
                }
            }
        }

    }

    public static void setMatrixZeroBetterApproach(int[][] arr) {
        ArrayList<Integer> rowArray = new ArrayList<>();
        ArrayList<Integer> colArray = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) {
                    System.out.println("Inside the if");
                    rowArray.add(i, 1);
                    colArray.add(j, 1);
                    System.out.println("After the if");

                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (rowArray.get(i) == 0 || colArray.get(j) == 0) {
                    arr[i][j] = 0;
                }
            }
        }

    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };

        int columnSize = matrix.length;
        int rowSize = matrix[0].length;
        setMatrixZeroBetterApproach(matrix);
        System.out.println("The Final matrix is: ");
        for (int[] row : matrix) {
            for (Integer ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}