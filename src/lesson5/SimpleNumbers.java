package lesson5;

import java.util.Scanner;

public class SimpleNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое число:");
        int end = scanner.nextInt();

        if (end <= 1) {
            System.out.println("Введенное число не должно быть меньше или равно 1.");
        } else {
            for (int i = 2; i <= end; ++i) {
                boolean needContinue = false;
                for (int divider = 2; divider <= 9; ++divider) {
                    if (divider == i) {
                        continue;
                    }
                    if (i % divider == 0) {
                        needContinue = true;
                        break;
                    }
                }
                if (needContinue) {
                    continue;
                }
                System.out.print(i + " ");
            }
        }
    }
}
