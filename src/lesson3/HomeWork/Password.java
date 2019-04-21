package lesson3.HomeWork;

import java.util.Locale;
import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        String password = "VeryVeryStrongPassword";

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.printf("Введите пароль: %n");
        String stringEntered = scanner.nextLine();

        if (password.equals(stringEntered)) {
            System.out.printf("Пароль верный%n");
        } else if (stringEntered.length() > password.length()) {
            System.out.printf("Вы ввели не верный пароль. Строка слишком длинная%n");
        } else if (stringEntered.length() < password.length()) {
            System.out.printf("Вы ввели не верный пароль. Строка слишком короткая%n");
        } else {
            System.out.printf("Пароль не верный%n");
        }
    }
}
