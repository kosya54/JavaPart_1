package lesson5.HomeWork;

import java.util.Scanner;

public class SimpleNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое число:");
        int end = scanner.nextInt();

        if (end <= 1) {
            System.out.println("Введенное число должно быть меньше или равно 1.");
        } else {
            final int numbersInString = 20;
            int shift = calculateNumberLength(end);
            int numbersInStringCount = 1;
            int i = 2;

            while (i <= end) {
                int divider = 2;
                boolean needContinue = false;
                String separator = "";

                while (divider <= 9) {
                    if (divider == i) {
                        ++divider;
                        continue;
                    }
                    if (i % divider == 0) {
                        needContinue = true;
                        break;
                    }
                    ++divider;
                }
                if (needContinue) {
                    ++i;
                    continue;
                }
                if (numbersInStringCount == numbersInString) {
                    separator = "%n";
                    numbersInStringCount = 0;
                }
                System.out.printf("%" + shift + "d " + separator, i);
                ++numbersInStringCount;
                ++i;
            }
        }
    }

    private static int calculateNumberLength(int number) {
        int numberLength = 0;

        if (number == 0) {
            numberLength = 1;
        }
        while (number != 0) {
            numberLength++;
            number /= 10;
        }
        return numberLength;
    }
}
