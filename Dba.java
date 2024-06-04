
import java.util.*;

public class Dba {
    public class MatrixTraversal {

        public static void traverseMatrix(int[][] matrix) {
            int rows = matrix.length;
            int cols = matrix[0].length;

            for (int i = 0; i < rows; i++) { // Loop through each row
                for (int j = 0; j < cols; j++) { // Loop through each column in the current row
                    System.out.print(matrix[i][j] + " "); // Print the current element
                }
                System.out.println(); // Move to the next line after finishing a row
            }
        }

        public static void main(String[] args) {
            int[][] matrix = {
                    { 1, 2, 3 },
                    { 4, 5, 6 },
                    { 7, 8, 9 }
            };

            traverseMatrix(matrix);
        }
    }

}
