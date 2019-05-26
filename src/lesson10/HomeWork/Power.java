package lesson10.HomeWork;

import java.util.Scanner;

class Power {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");
        int number = scanner.nextInt();

        System.out.println("Введите степень: ");
        int power = scanner.nextInt();

        System.out.printf("%d в степени %d равно: %d", number, power, getPower(number, power));
    }

    private static int getPower(int number, int power) {
        if (power != 1) {
            return number * getPower(number, power - 1);
        }
        return number;
    }
}
