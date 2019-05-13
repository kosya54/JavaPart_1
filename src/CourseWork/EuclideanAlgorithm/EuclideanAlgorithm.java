package CourseWork.EuclideanAlgorithm;

import java.util.Scanner;

public class EuclideanAlgorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите a:");
        int a = scanner.nextInt();

        System.out.println("Введите b:");
        int b = scanner.nextInt();

        if (a == 0 && b == 0) {
            System.out.println("a и b не должны быть равны нулю.");
        } else {
            while (a != 0 && b != 0) {
                if (a > b) {
                    a = a % b;
                } else {
                    b = b % a;
                }
            }

            int divisor;
            if (a == 0) {
                divisor = b;
            } else {
                divisor = a;
            }
            System.out.printf("НОД: %d", divisor);
        }
    }
}