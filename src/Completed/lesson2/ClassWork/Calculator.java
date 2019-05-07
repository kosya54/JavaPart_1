package Completed.lesson2.ClassWork;

import java.util.Scanner;
import java.util.Locale;

public class Calculator {
    public static void main(String[] args) {
        calculateInt();
        calculateDouble();
    }

    private static void calculateInt() {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.printf("Введите целое число №1: %n");
        int number1 = scanner.nextInt();

        System.out.printf("Введите целое число №2: %n");
        int number2 = scanner.nextInt();

        System.out.printf("Результат операций с целым числом: %d + %d = %d%n", number1, number2, (number1 + number2));
        System.out.printf("%d - %d = %d%n", number1, number2, (number1 - number2));
        System.out.printf("%d - %d = %d%n", number1, number2, (number1 * number2));
        System.out.printf("%d - %d = %d%n", number1, number2, (number1 / number2));
        System.out.printf("%d - %d = %d%n", number1, number2, (number1 % number2));
    }

    private static void calculateDouble() {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.printf("Введите вещественное число №1: %n");
        double number1 = scanner.nextDouble();

        System.out.printf("Введите вещественное число №2: %n");
        double number2 = scanner.nextDouble();

        System.out.printf("Результат операций с вещественным числом: %.2f + %.2f = %.2f%n", number1, number2, (number1 + number2));
        System.out.printf("%.2f - %.2f = %.2f%n", number1, number2, (number1 - number2));
        System.out.printf("%.2f * %.2f = %.2f%n", number1, number2, (number1 * number2));
        System.out.printf("%.2f / %.2f = %.2f%n", number1, number2, (number1 / number2));
        System.out.printf("%.2f %% %.2f = %.2f%n", number1, number2, (number1 % number2));
    }
}