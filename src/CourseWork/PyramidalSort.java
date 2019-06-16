package CourseWork;

import java.util.Arrays;

public class PyramidalSort {
    public static void main(String[] args) {
        int[] array = {10, 2, 3, 77, 1000, 1, 3, 5, 99, 6, 8, 7, 1, 12};

        System.out.println(Arrays.toString(array));
        pyramidalSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void pyramidalSort(int[] array) {
        int arrayLength = array.length - 1;
        getHeap(array, arrayLength);

        while (arrayLength > 0) {
            int temp = array[0];
            array[0] = array[arrayLength];
            array[arrayLength] = temp;

            --arrayLength;
            getHeap(array, arrayLength);
        }
    }

    private static void getHeap(int[] array, int arrayLength) {
        int parent = arrayLength / 2 - 1;
        while (parent >= 0) {
            int child1 = 2 * parent + 1;
            int child2 = 2 * parent + 2;

            if (child1 <= arrayLength && array[parent] < array[child1]) {
                int temp = array[parent];
                array[parent] = array[child1];
                array[child1] = temp;
                parent = child1;
                continue;
            }
            if (child2 <= arrayLength && array[parent] < array[child2]) {
                int temp = array[parent];
                array[parent] = array[child2];
                array[child2] = temp;
                parent = child2;
                continue;
            }
            --parent;
        }
    }
}