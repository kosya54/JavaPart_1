package lesson9.HomeWork;

import java.util.Arrays;

public class CheckArraySorting {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] array2 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        System.out.printf("Массив %s отсортирован по возрастанию? - %b.%n", Arrays.toString(array1), isArraySortingAscending(array1));
        System.out.printf("Массив %s отсортирован по возрастанию? - %b.%n", Arrays.toString(array2), isArraySortingAscending(array2));
        System.out.printf("Массив %s отсортирован по убыванию? - %b.%n", Arrays.toString(array1), isArraySortingDescending(array1));
        System.out.printf("Массив %s отсортирован по убыванию? - %b.", Arrays.toString(array2), isArraySortingDescending(array2));
    }

    private static boolean isArraySortingAscending(int[] array) {
        boolean ascendingSorting = false;
        for (int i = 1; i < array.length; i++) {
            ascendingSorting = array[i - 1] < array[i];
            if (!ascendingSorting) {
                break;
            }
        }
        return ascendingSorting;
    }

    private static boolean isArraySortingDescending(int[] array) {
        boolean descendingSorting = false;
        for (int i = 1; i < array.length; i++) {
            descendingSorting = array[i - 1] > array[i];
            if (!descendingSorting) {
                break;
            }
        }
        return descendingSorting;
    }
}
