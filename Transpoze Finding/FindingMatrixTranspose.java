package Array;

import java.util.Arrays;
public class FindingMatrixTranspose {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6}};
        int rowLength = matrix.length;
        int colLength = matrix[0].length;

        int[][] transpozMatrix = new int[colLength][rowLength];

        for (int i = 0; i < colLength; i++){
            for (int j = 0; j < rowLength; j++){
                transpozMatrix[i][j] = matrix[j][i];
                System.out.print(transpozMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
