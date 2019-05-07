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
            int i = 2;
            while (i <= end) {
                int divider = 2;
                boolean needContinue = false;
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
                System.out.printf("%d ", i);
                ++i;
            }
        }
    }
}
