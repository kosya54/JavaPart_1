package Completed.lesson4.HomeWork;

import java.util.Scanner;

public class NumberDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое число:");
        int number = scanner.nextInt();

        int j = calculateNumberLength(number);
        int sum = 0;
        int oddSum = 0;
        int max = 0;

        while (j > 0) {
            int digit = (number / (int)Math.pow(10, j - 1)) % 10;
            sum += digit;

            if (digit % 2 != 0) {
                oddSum += digit;
            }

            if (digit > max) {
                max = digit;
            }
            j--;
        }

        System.out.printf("Сумма цифр числа %d равна: %d%n", number, sum);
        System.out.printf("Сумма нечетных цифр числа %d равна: %d%n", number, oddSum);
        System.out.printf("Максимальная цифра числа %d равна: %d.", number, max);
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