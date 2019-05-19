package Completed.CourseWork.EuclideanAlgorithm;

import java.util.Scanner;

public class EuclideanAlgorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите a:");
        int a = scanner.nextInt();

        System.out.println("Введите b:");
        int b = scanner.nextInt();

        int divisor = 0;
        if (a == 0 && b == 0) {
            System.out.println("a и b не должны быть равны нулю.");
        } else if (b == 0) {
            divisor = a;
        } else if (a % b == 0) {
            divisor = b;
        } else {
            while (b != 0) {
                int rest = a % b;
                a = b;
                b = rest;
                divisor = a;
            }
        }
        System.out.printf("НОД: %d", divisor);
    }
}