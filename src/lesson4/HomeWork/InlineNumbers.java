package lesson4.HomeWork;

import java.util.Scanner;

public class InlineNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите начало диапазона:");
        int i = scanner.nextInt();

        System.out.println("Введите конец диапазона:");
        int endPosition = scanner.nextInt();

        System.out.println("Введите количество чисел в строке:");
        int countNumbers = scanner.nextInt();

        int j = 1;
        int shift = calculateNumberLength(endPosition);

        while (i <= endPosition) {
            System.out.printf("%" + shift + "d ", i);

            if (j == countNumbers) {
                System.out.println();
                j = 0;
            }
            j++;
            i++;
        }
    }

    private static int calculateNumberLength(int number) {
        int numberLength = 0;

        if (number == 0) {
            numberLength = 1;
        }
        while (number != 0) {
            numberLength++;
            number /= 10;
        }
        return numberLength;
    }
}