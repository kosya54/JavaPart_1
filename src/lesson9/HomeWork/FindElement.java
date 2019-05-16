package lesson9.HomeWork;

import java.util.Random;
import java.util.Scanner;

public class FindElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Укажите искомое число: ");
        int desiredNumber = scanner.nextInt();

        int arrayLength = 10;
        int[] array = generateArray(arrayLength);

        int index = findNumber(array, desiredNumber);
        if (index == -1) {
            System.out.printf("Указанное число в массиве отсутствует: %d.", index);
        } else {
            System.out.printf("Число в массиве найдено, оно имеет индек: %d.", index);
        }
    }

    private static int[] generateArray(int arrayLength) {
        int start = 1;
        int end = 1000;

        Random random = new Random();

        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            array[i] = start + (end - start) * random.nextInt();
        }
        return array;
    }

    private static int findNumber(int[] array, int desiredNumber) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == desiredNumber) {
                return i;
            }
        }
        return -1;
    }
}
