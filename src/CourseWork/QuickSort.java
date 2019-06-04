package CourseWork;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array1 = {10, 2, 3, 1, 6, 55, 9, 3, 1, 2, 77, 8, 100, 4};
        int[] array2 = {10, 1};
        int[] array3 = {10};
        int[] array4 = {};

        System.out.println(Arrays.toString(array1));
        quickSort(array1, 0, array1.length - 1);
        System.out.println(Arrays.toString(array1));
        System.out.println();

        System.out.println(Arrays.toString(array2));
        quickSort(array2, 0, array2.length - 1);
        System.out.println(Arrays.toString(array2));
        System.out.println();

        System.out.println(Arrays.toString(array3));
        quickSort(array3, 0, array3.length - 1);
        System.out.println(Arrays.toString(array3));
        System.out.println();

        System.out.println(Arrays.toString(array4));
        quickSort(array4, 0, array4.length - 1);
        System.out.println(Arrays.toString(array4));
    }

    private static void quickSort(int[] array, int left, int right) {
        if (array.length <= 1) {
            return;
        }

        if (array.length == 2) {
            if (array[0] > array[1]) {
                int temp = array[1];
                array[1] = array[0];
                array[0] = temp;
            }
            return;
        }

        int i = left;
        int j = right;
        int x = (array[left] + array[right]) / 2;

        while (i <= right) {
            if (array[i] >= x) {
                break;
            }
            ++i;
        }
        while (j >= left) {
            if (array[j] <= x) {
                break;
            }
            --j;
        }

        if (i <= j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;

            ++i;
            --j;
        }

        if (i < right) {
            quickSort(array, i, right);
        }
        if (j > left) {
            quickSort(array, left, j);
        }
    }
}