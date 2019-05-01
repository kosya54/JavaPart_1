package lesson5.ClassWork;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        for (int i = 100; i >= 1; i--) {
            if (i % 4 == 0) {
                System.out.print(i + " ");
            }
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("Введите конец диапазона");
        int endPosition = scanner.nextInt();

        for (int i = 1; i <= endPosition; i++) {
            System.out.printf("%d ", (int)Math.pow(i, 2));
        }

        int sum = 0;
        int j = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
            j++;
        }
        System.out.printf("%nСумма: %d, количество: %d, среднее арифметическое: %d", sum, j, sum / j);


    }
}
