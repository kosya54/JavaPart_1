package lesson3.ClassWork;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Введите целое число: %n");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.printf("Число %d положительное", number);
        } else if (number == 0) {
            System.out.println("Число равно 0");
        } else {
            System.out.printf("Число %d отрицательное", number);
        }
    }
}