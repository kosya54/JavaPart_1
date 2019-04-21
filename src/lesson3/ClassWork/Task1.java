package lesson3.ClassWork;

import java.util.Locale;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.printf("Введите целое число: %n");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.printf("Данное число (%d) - положительное%n", number);
        }

        if (number % 2 == 0) {
            System.out.printf("Число %d четное%n", number);
        }

        if (number % 5 == 0) {
            System.out.printf("Число %d кратно 5%n", number);
        }
    }
}
