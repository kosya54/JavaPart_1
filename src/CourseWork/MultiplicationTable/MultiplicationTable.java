package CourseWork.MultiplicationTable;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Укажите верхнюю границу таблицы умножения:");
        int end = scanner.nextInt();

        int shiftMax = calculateNumberLength((int) Math.pow(end, 2));
        int shiftMin = calculateNumberLength(end);

        System.out.printf("Max: %d Min: %d%n", shiftMax, shiftMin);

        System.out.printf("%" + (shiftMax + shiftMin) + "s", "");

        for (int k = 1; k <= end; ++k) {
            System.out.printf("%" + shiftMin + "d| ", k);
        }

        System.out.println();

        for (int i = 1; i <= end; ++i) {
            System.out.printf("%" + shiftMin + "d| ", i);
            for (int j = 1; j <= end; ++j) {
                System.out.printf("%" + shiftMax + "d ", i * j);
            }
            System.out.println();
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