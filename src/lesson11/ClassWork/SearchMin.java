package lesson11.ClassWork;

import java.util.Scanner;

public class SearchMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = {5, 3, 6, 8, 2, 9, 11, 1};

        System.out.printf("Введите индекс начала поиска, длина массива равна %d: ", array.length);
        int start = scanner.nextInt();

        System.out.printf("Min index: %d", searchMin(start, array));
    }

    private static int searchMin(int start, int[] array) {
        int min = array[start];
        int minIndex = start;
        for (int i = start; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}
