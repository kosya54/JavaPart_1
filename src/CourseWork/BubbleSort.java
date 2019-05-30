package CourseWork;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {2, 5, 9, 1, 3, 67, 9, 0, 4, 1, 1};

        System.out.println(Arrays.toString(array));
        bubbleSort(array);
        System.out.print(Arrays.toString(array));
    }

    private static void bubbleSort(int[] array) {
        boolean isArraySorted = false;

        int count = 1;
        while (!isArraySorted) {
            isArraySorted = true;

            for (int i = 0; i < array.length - count; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    isArraySorted = false;
                }
            }
            ++count;
        }
    }
}