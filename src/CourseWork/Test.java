package CourseWork;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        /*        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                result[i][j] = matrix1[i][j] * matrix2[i][j];
            }
        } */

        int[][] result = convertMatrix(array, 3, 3);


        for (int i = 0; i < result.length; i++) {
            System.out.println(Arrays.toString(result[i]));
        }
    }

    private static int[][] convertMatrix(int[] array, int width, int height) {
        int[][] matrix = new int[height][width];
        int count = 0;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                matrix[i][j] = array[count];
                ++count;
            }
        }
        return matrix;
    }
}
