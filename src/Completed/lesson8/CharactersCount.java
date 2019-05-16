package Completed.lesson8;

import java.util.Scanner;

public class CharactersCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку:");
        String enteredString = scanner.nextLine();

        int lettersCount = 0;
        int digitsCount = 0;
        int whitespacesCount = 0;
        int othersCount = 0;

        for (int i = 0; i < enteredString.length(); i++) {
            if (Character.isLetter(enteredString.charAt(i))) {
                ++lettersCount;
            } else if (Character.isDigit(enteredString.charAt(i))) {
                ++digitsCount;
            } else if (Character.isWhitespace(enteredString.charAt(i))) {
                ++whitespacesCount;
            } else {
                ++othersCount;
            }
        }

        System.out.printf("Введенная строка: %s%n", enteredString);
        System.out.printf("Число букв: %d, число цифр: %d, число пробелов: %d, остальные символы: %d", lettersCount, digitsCount, whitespacesCount, othersCount);
    }
}
