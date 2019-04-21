package lesson3.HomeWork;

import java.util.Locale;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.printf("Укажите год: %n");
        int year = scanner.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.printf("Год %d високосный", year);
        } else {
            System.out.printf("Год %d невисокосный%n", year);
        }
    }
}
