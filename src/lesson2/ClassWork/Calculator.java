package lesson2.ClassWork;

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

        System.out.println("Введите целое число №1: ");
        int number1 = scanner.nextInt();

        System.out.println(System.lineSeparator() + "Введите целое число №2: ");
        int number2 = scanner.nextInt();

        System.out.println(System.lineSeparator() + "Результат операций с целым числом:" + System.lineSeparator() + number1 + " + " + number2 + " = " + (number1 + number2));
        System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
        System.out.println(number1 + " * " + number2 + " = " + (number1 * number2));
        System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));
        System.out.println(number1 + " % " + number2 + " = " + (number1 % number2));
    }

    private static void calculateDouble() {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Введите вещественное число №1: ");
        double number1 = scanner.nextDouble();

        System.out.println(System.lineSeparator() + "Введите вещественное число №2: ");
        double number2 = scanner.nextDouble();

        System.out.println(System.lineSeparator() + "Результат операций с вещественным числом:" + System.lineSeparator() + number1 + " + " + number2 + " = " + (number1 + number2));
        System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
        System.out.println(number1 + " * " + number2 + " = " + (number1 * number2));
        System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));
        System.out.println(number1 + " % " + number2 + " = " + (number1 % number2));
    }
}