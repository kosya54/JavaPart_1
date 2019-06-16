package Completed.CourseWork;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array1 = {1000, 10, 2, 3, 77777, 1, 6, 55, 9, 3, 1, 2, 77, 8, 100, 4, 1, 2, 3, 5, 7};
        int[] array2 = {};

        System.out.println(array2.length - 1);

        System.out.println(Arrays.toString(array1));
        quickSort(array1, 0, array1.length - 1);
        System.out.println(Arrays.toString(array1));
        System.out.println();

        System.out.println(Arrays.toString(array2));
        quickSort(array2, 0, array2.length - 1);
        System.out.println(Arrays.toString(array2));
    }

    private static void quickSort(int[] array, int left, int right) {
        if (array.length == 0) {
            return;
        }
        if (right == left) {
            return;
        }
        if (right - left == 1) {
            if (array[left] > array[right]) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
            }
            return;
        }

        int i = left;
        int j = right;
        int x = array[(i + j) / 2];

        while (i <= j) {
            while (array[i] < x) {
                ++i;
            }
            while (array[j] > x) {
                --j;
            }
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                ++i;
                --j;
            } else {
                break;
            }
        }

        if (i < right) {
            quickSort(array, i, right);
        }
        if (j > left) {
            quickSort(array, left, j);
        }
    }
}