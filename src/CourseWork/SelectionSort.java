package CourseWork;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {0, 1, 5, 3, 6, 8, 2, 9, 2, 4, 3, 11, 1};

        System.out.println(Arrays.toString(array));
        selectionSort(array);
        System.out.print(Arrays.toString(array));
    }

    private static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = array[i];
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (min > array[j]) {
                    min = array[j];
                    minIndex = j;
                }
            }
            array[minIndex] = array[i];
            array[i] = min;
        }
    }
}