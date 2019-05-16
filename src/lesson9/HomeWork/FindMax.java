package lesson9.HomeWork;

import java.util.Random;

public class FindMax {
    public static void main(String[] args) {
        int arrayLength = 100;
        double[] array = generateArray(arrayLength);

        System.out.printf("Максимальное число в массиве равно: %f", findMaxNumber(array));
    }

    private static double[] generateArray(int arrayLength) {
        double start = 1;
        double end = 1000;

        Random random = new Random();

        double[] array = new double[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            array[i] = start + (end - start) * random.nextDouble();
        }
        return array;
    }

    private static double findMaxNumber(double[] array) {
        double max = 0;
        double epsilon = 1.0e-10;
        for (double value : array) {
            if (value - max > epsilon) {
                max = value;
            }
        }
        return max;
    }
}
