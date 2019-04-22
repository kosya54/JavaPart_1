package lesson3.HomeWork;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        String password = "VeryVeryStrongPassword";

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Введите пароль: %n");
        String enteredString = scanner.nextLine();

        if (password.equals(enteredString)) {
            System.out.println("Пароль верный.");
        } else if (enteredString.length() > password.length()) {
            System.out.println("Вы ввели не верный пароль. Строка слишком длинная.");
        } else if (enteredString.length() < password.length()) {
            System.out.println("Вы ввели не верный пароль. Строка слишком короткая.");
        } else {
            System.out.println("Пароль не верный");
        }
    }
}