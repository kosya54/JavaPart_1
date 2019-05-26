package CourseWork;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] a = {2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Введите X: ");
        int x = scanner.nextInt();

        System.out.printf("Искомый индекс равен: %d", binarySearch(a, a[0], a[a.length - 1], x));
    }

    private static int binarySearch(int[] a, int left, int right, int x) {
        if (left > right) {
            return -1;
        }

        int middle = (right + left) / 2;
        if (x == a[middle]) {
            return middle;
        }

        if (x > a[middle]) {
            return binarySearch(a, middle + 1, right, x);
        }

        if (x < a[middle]) {
            return binarySearch(a, left, middle - 1, x);
        }
        return 0;
    }
}
