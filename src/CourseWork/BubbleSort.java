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
        for (int i = 0; i < array.length; i++) {
            boolean replacement = false;
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    replacement = true;
                }
            }
            if (!replacement) {
                break;
            }
        }
    }
}
