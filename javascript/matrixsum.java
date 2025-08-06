package javascript;
import java.util.Scanner;
public class matrixsum {
    public static void main(String[] args) {
        // Define two 2x3 matrices
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] matrix2 = {
            {7, 8, 9},
            {1, 2, 3}
        };

        // Create a result matrix with the same dimensions
        int[][] sum = new int[2][3];

        // Perform matrix addition
        for (int i = 0; i < 2; i++) {           // row
            for (int j = 0; j < 3; j++) {       // column
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Print the result
        System.out.println("Sum of the two matrices:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
