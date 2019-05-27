package Completed.CourseWork;

import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = 1;
        int end = 100;

        Random random = new Random();
        int randomNumber = start + random.nextInt(end - start + 1);

        int attemptsCount = 0;
        System.out.printf("Угадайте число от %d до %d: ", start, end);
        while (true) {
            int enteredNumber = scanner.nextInt();
            ++attemptsCount;
            if (enteredNumber == randomNumber) {
                System.out.printf("Верно! Вы угадали число: %d.%nВы угадали с %d раза.", enteredNumber, attemptsCount);
                break;
            }

            if (enteredNumber > randomNumber) {
                System.out.println("Введенное число больше загаданного.");
            } else {
                System.out.println("Введенное число меньше загаданного.");
            }
            System.out.println("Попытаемся еще раз?");
            System.out.println("Введите число: ");
        }
    }
}