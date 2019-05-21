package lesson9.HomeWork;

import java.util.Arrays;

public class CheckArraySorting {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] array2 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        System.out.printf("Массив %s отсортирован по возрастанию? - %b.%n", Arrays.toString(array1), isArraySortedAscending(array1));
        System.out.printf("Массив %s отсортирован по возрастанию? - %b.%n", Arrays.toString(array2), isArraySortedAscending(array2));
        System.out.printf("Массив %s отсортирован по убыванию? - %b.%n", Arrays.toString(array1), isArraySortedDescending(array1));
        System.out.printf("Массив %s отсортирован по убыванию? - %b.", Arrays.toString(array2), isArraySortedDescending(array2));
    }

    private static boolean isArraySortedAscending(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] > array[i]) {
                return false;
            }
        }
        return true;
    }

    private static boolean isArraySortedDescending(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] < array[i]) {
                return false;
            }
        }
        return true;
    }
}
