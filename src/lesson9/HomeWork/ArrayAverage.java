package lesson9.HomeWork;

import java.util.Arrays;

public class ArrayAverage {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        System.out.printf("Среднее арифметическое четных элементов массива %s равно: %.2f", Arrays.toString(array), getEvenArrayAverage(array));
    }

    private static double getEvenArrayAverage(int[] array) {
        int sum = 0;
        int count = 0;
        for (int value : array) {
            if (value % 2 == 0) {
                sum += value;
                ++count;
            }
        }
        return sum / count;
    }
}
