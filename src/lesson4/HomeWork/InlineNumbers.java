package lesson4.HomeWork;

import java.util.Scanner;

public class InlineNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите начало диапазона:");
        int startPosition = scanner.nextInt();

        System.out.println("Введите конец диапазона:");
        int endPosition = scanner.nextInt();

        System.out.println("Введите количество чисел в строке:");
        int numbersCount = scanner.nextInt();

        int i = 1;
        int shift = calculateNumberLength(endPosition);

        while (startPosition <= endPosition) {
            String separator = "";

            if (i == numbersCount) {
                separator = "%n";
                i = 0;
            }
            System.out.printf("%" + shift + "d " + separator, startPosition);
            i++;
            startPosition++;
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