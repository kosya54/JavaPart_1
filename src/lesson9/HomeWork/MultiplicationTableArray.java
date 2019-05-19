package lesson9.HomeWork;

import java.util.Scanner;

public class MultiplicationTableArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер таблицы умножения:");
        int size = scanner.nextInt();
        int[][] multiplicationTableArray = getMultiplicationTable(size);
        int shift = calculateNumberLength((int) Math.pow(size, 2));

        String leftMargin = String.format("%" + shift + "s|", " ");

        System.out.print(leftMargin);
        for (int header = 1; header <= size; header++) {
            System.out.printf("%" + shift + "d", header);
        }
        System.out.println();

        System.out.print(leftMargin);
        for (int i = 1; i <= (shift * size); i++) {
            System.out.print("-");
        }
        System.out.println();

        int leftColumn = 1;
        for (int[] i : multiplicationTableArray) {
            System.out.printf("%" + shift + "d|", leftColumn);
            for (int j : i) {
                System.out.printf("%" + shift + "d", j);
            }
            ++leftColumn;
            System.out.println();
        }
    }

    private static int[][] getMultiplicationTable(int size) {
        int[][] array = new int[size][size];

        int a = 1;
        for (int i = 0; i < size; i++) {
            int b = 1;
            for (int j = 0; j < size; j++) {
                array[i][j] = a * b;
                ++b;
            }
            ++a;
        }
        return array;
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
        return numberLength + 1;
    }
}