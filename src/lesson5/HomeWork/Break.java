package lesson5.HomeWork;

import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String secretString = "VerySecretString";

        while (true) {
            System.out.println("Введите строку:");
            if (secretString.equals(scanner.nextLine())) {
                System.out.printf("Вы угадали строку! Строка: %s.", secretString);
                break;
            } else {
                System.out.println("Не верно.");
            }
        }
    }
}
