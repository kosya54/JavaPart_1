package CourseWork;

import java.util.Arrays;

public class PyramidalSort {
    public static void main(String[] args) {
        int[] array1 = {10, 2, 3, 6, 8, 7, 1, 12};
        int[] array2 = {1, 3, 5, 7, 88, 100, 2, 1, 3333, 123};
        int[] array3 = {};

        System.out.println(Arrays.toString(array1));
        pyramidalSort(array1);
        System.out.println(Arrays.toString(array1));
        System.out.println();

        System.out.println(Arrays.toString(array2));
        pyramidalSort(array2);
        System.out.println(Arrays.toString(array2));
        System.out.println();

        System.out.println(Arrays.toString(array3));
        pyramidalSort(array3);
        System.out.println(Arrays.toString(array3));
    }

    private static void pyramidalSort(int[] array) {
        int arrayLength = array.length - 1;

        for (int i = array.length / 2 - 1; i >= 0; i--) {
            buildHeap(array, i, arrayLength);
        }
      
        while (arrayLength > 0) {
            int temp = array[0];
            array[0] = array[arrayLength];
            array[arrayLength] = temp;

            --arrayLength;
            buildHeap(array, 0, arrayLength);
        }
    }

    private static void buildHeap(int[] array, int i, int arrayLength) {
        while (true) {
            int j1 = 2 * i + 1;
            int j2 = 2 * i + 2;
            
            if (j1 > arrayLength && j2 > arrayLength) {
                return;
            }

            int max;
            if (j1 > arrayLength) {
                max = j2;
            } else if (j2 > arrayLength) {
                max = j1;
            } else {
                if (array[j1] > array[j2]) {
                    max = j1;
                } else {
                    max = j2;
                }
            }
            
            if (array[i] < array[max]) {
                int temp = array[i];
                array[i] = array[max];
                array[max] = temp;
                i = max;
            } else {
                break;
            }
        }
    }
}
