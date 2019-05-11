package CourseWork.EuclideanAlgorithm;

import java.util.Scanner;

public class EuclideanAlgorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите a:");
        int a = scanner.nextInt();

        System.out.println("Введите b:");
        int b = scanner.nextInt();

        if (a == 0 || b == 0) {
            System.out.println("a или b не должны быть равны нулю.");
        } else if (a % b == 0) {
            System.out.printf("НОД a на b равен: %d", b);
        } else {
            int divisor = 0;
            while ((a > 0 && b > 0) || (a < 0 && b < 0)) {
                int rest = a % b;
                a = b;
                b = rest;
                divisor = a;
            }
            System.out.printf("НОД: %d", divisor);
        }
    }
}