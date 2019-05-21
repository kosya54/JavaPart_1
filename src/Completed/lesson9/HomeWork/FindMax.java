package Completed.lesson9.HomeWork;

import java.util.Arrays;

public class FindMax {
    public static void main(String[] args) {
        double[] array1 = {-1.2, -2.6, -5.8, -9.77, -99.7, -45.7};
        double[] array2 = {1.2, 2.6, 5.8, 9.77, 99.7, 45.7};

        System.out.println(Arrays.toString(array1));
        System.out.printf("Максимальное число в массиве равно: %.2f%n", findMaxNumber(array1));

        System.out.println(Arrays.toString(array2));
        System.out.printf("Максимальное число в массиве равно: %.2f", findMaxNumber(array2));
    }

    private static double findMaxNumber(double[] array) {
        double max = array[0];
        for (double value : array) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }
}
