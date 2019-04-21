package lesson3.HomeWork;

import java.util.Locale;
import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Введите целое число №1:");
        int number1 = scanner.nextInt();

        System.out.println("Введите целое число №2:");
        int number2 = scanner.nextInt();

        int max;
        int min;

        if (number1 > number2) {
            max = number1;
            min = number2;
        } else {
            max = number2;
            min = number1;
        }

        System.out.printf("%nПоиск наименьшего и наибольшего чисел с помощью if-else%n");
        System.out.printf("Наименьшее число = %d, наибольшее число = %d%n", min, max);

        max = (number1 > number2) ? number1 : number2;
        min = (number1 < number2) ? number1 : number2;

        System.out.printf("%nПоиск наименьшего и наибольшего чисел с помощью тернарного оператора%n");
        System.out.printf("Наименьшее число = %d, наибольшее число = %d%n", min, max);
    }
}
