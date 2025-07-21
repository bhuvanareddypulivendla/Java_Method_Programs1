// Matrix Diagonal Sum
// Method: int diagonalSum(int[][] matrix)

import java.util.*;

public class MatrixDiagonalSum {
    public static int diagonalSum(int[][] matrix) {
        int sum = 0;
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            // Primary diagonal
            sum += matrix[i][i];

            // Secondary diagonal (avoid double counting center if n is odd)
            if (i != n - 1 - i) {
                sum += matrix[i][n - 1 - i];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Diagonal Sum: " + diagonalSum(matrix));
    }
}
