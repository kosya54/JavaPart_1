package CourseWork;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {10, 2, 3, 1, 6, 55, 9, 3, 1, 2, 77, 8, 100, 4};

        System.out.println(Arrays.toString(array));
        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    private static void quickSort(int[] array, int left, int right) {
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
            while (array[i] <= x) {
                if (array[i] == x) {
                    break;
                }
                ++i;
            }
            while (array[j] >= x) {
                if (array[j] == x) {
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