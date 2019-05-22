package lesson10.ClassWork;

import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите чило: ");
        int number = scanner.nextInt();

        System.out.println("Введите степень: ");
        int pow = scanner.nextInt();

        System.out.printf("Число %d в степени %d равно: %d", number, pow, getPow(number, pow));
    }

    private static int getPow(int number, int pow) {
        int result = 0;
        for (int i = pow; i >= 0; i--) {
            result = number;
            result *= number;
        }

        return result;
    }
}
