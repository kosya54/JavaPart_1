package CourseWork;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {10, 2, 3, 1, 6, 55, 9, 3, 1, 2, 77, 8, 100, 4};
        int left = 0;
        int right = array.length - 1;

        System.out.println(Arrays.toString(array));
        quickSort(array, left, right);
        System.out.println(Arrays.toString(array));
    }

    private static void quickSort(int[] array, int left, int right) {
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