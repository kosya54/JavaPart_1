package CourseWork.EuclideanAlgorithm;

import java.util.Scanner;

public class EuclideanAlgorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите a:");
        int a = scanner.nextInt();

        System.out.println("Введите b:");
        int b = scanner.nextInt();

        if (a % b == 0) {
            System.out.printf("НОД a на b равен: %d", b);
        } else {
            int nod = 0;
            int rest;
            while (a != 0 && b != 0) {
                rest = a % b;
                a = b;
                b = rest;
                nod = a;
            }
            System.out.printf("НОД: %d", nod);
        }
    }
}