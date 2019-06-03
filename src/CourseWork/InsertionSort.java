package CourseWork;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {1, 3, 2, 7, 9, 3, 1, 6, 8};

        System.out.println(Arrays.toString(array));
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int element = array[i];
            int j = i - 1;
            while (j >= 0) {
                if (element < array[j]) {
                    array[j + 1] = array[j];
                } else {
                    break;
                }
                --j;
            }
            array[j + 1] = element;
        }
    }
}
