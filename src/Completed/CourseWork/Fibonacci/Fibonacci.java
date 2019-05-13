package Completed.CourseWork.Fibonacci;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите номер числа в числовом ряду Фибоначчи:");
        int n = scanner.nextInt();

        int fn = 0;

        if (n == 1 || n == 2) {
            fn = 1;
        } else {
            int f1 = 1;
            int f2 = 1;
            for (int i = 3; i <= n; i++) {
                fn = f1 + f2;
                f1 = f2;
                f2 = fn;
            }
        }
        System.out.printf("%d", fn);
    }
}
