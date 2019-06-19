package CourseWork;

import java.util.Arrays;

public class PyramidalSort {
    public static void main(String[] args) {
        int[] array = {10, 2, 3, 6, 8, 7, 1, 12};

        System.out.println(Arrays.toString(array));
        pyramidalSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void pyramidalSort(int[] array) {
        int arrayLength = array.length;
        for (int i = arrayLength / 2 - 1; i >= 0; i--) {
            buildHeap(array, i, arrayLength);
        }
        
        while (arrayLength > 0) {
            int temp = array[0];
            array[0] = array[arrayLength - 1];
            array[arrayLength - 1] = temp;

            --arrayLength;
            buildHeap(array, 0, arrayLength);
        }
    }
  
    private static void buildHeap(int[] array, int i, int arrayLength) {
        while (true) {
            int j1 = 2 * i + 1;
            int j2 = 2 * i + 2;
            
            if (j1 >= arrayLength && j2 >= arrayLength) {
                break;
            } else {
                int maxJ;
                if (j1 < arrayLength && j2 >= arrayLength) {
                    maxJ = j1;
                } else if (j2 < arrayLength && j1 >= arrayLength) {
                    maxJ = j2;
                } else {
                    if (array[j1] > array[j2]) {
                        maxJ = j1;
                    } else {
                        maxJ = j2;
                    }
                }
                if (array[i] < array[maxJ]) {
                    int temp = array[i];
                    array[i] = array[maxJ];
                    array[maxJ] = temp;
                    i = maxJ;
                } else {
                    break;
                }
            }
        }
    }
}
