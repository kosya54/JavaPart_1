package lesson10.HomeWork;

import java.util.Scanner;

class Power {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");
        int number = scanner.nextInt();

        System.out.println("Введите степень: ");
        int power = scanner.nextInt();

        System.out.printf("Возведение в степень с помощью рекурсии:%n%d в степени %d равно: %d.%n%n", number, power, getRecursionPower(number, power));
        System.out.printf("Возведение в степень циклом:%n%d в степени %d равно: %d.", number, power, getPower(number, power));
    }

    private static int getRecursionPower(int number, int power) {
        if (power != 1) {
            return number * getRecursionPower(number, power - 1);
        }
        return number;
    }

    private static int getPower(int number, int power) {
        int result = number;
        for (int i = 1; i < power; i++) {
            result *= number;
        }
        return result;
    }
}
