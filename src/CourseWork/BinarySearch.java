package CourseWork;

import java.util.Scanner;
import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] a = {2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.printf("Поиск индекса числа в массиве: %s.%n", Arrays.toString(a));

        System.out.println("Введите искомое число: ");
        int x = scanner.nextInt();

        System.out.printf("Рекурсивный бинарный поиск.%nИндекс %d равен: %d.%n%n", x, recursionBinarySearch(a, 0, a.length - 1, x));
        System.out.printf("Не рекурсивный бинарный поиск.%nИндекс %d равен: %d.", x, binarySearch(a, x));
    }

    private static int recursionBinarySearch(int[] a, int left, int right, int x) {
        if (left > right) {
            return -1;
        }
        int middle = (right + left) / 2;

        if (x > a[middle]) {
            return recursionBinarySearch(a, middle + 1, right, x);
        }
        if (x < a[middle]) {
            return recursionBinarySearch(a, left, middle - 1, x);
        }
        return middle;
    }

    private static int binarySearch(int[] a, int x) {
        int left = 0;
        int right = a.length - 1;
        while (left <= right) {
            int middle = (right + left) / 2;

            if (x > a[middle]) {
                left = middle + 1;
            } else if (x < a[middle]) {
                right = middle - 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}