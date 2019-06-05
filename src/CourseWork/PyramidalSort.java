package CourseWork;

import java.util.Arrays;

public class PyramidalSort {
    public static void main(String[] args) {
        int[] array = {1, 5, 7, 2, 0, 5, 8, 3, 2, 4};

        System.out.println(Arrays.toString(array));
        pyramidalSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void pyramidalSort(int[] array) {
        for (int i = array.length / 2 - 1; i >= 0; i--) {

            System.out.println(i);

            if ((2 * i + 1) < array.length - 1 && array[i] < array[2 * i + 1]) {
                int temp = array[i];
                array[i] = array[2 * i + 1];
                array[2 * i + 1] = temp;
            }

            if ((2 * i + 2) < array.length - 1 && array[i] < array[2 * i + 2]) {
                int temp = array[i];
                array[i] = array[2 * i + 2];
                array[2 * i + 2] = temp;
            }
        }

        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
    }
}
