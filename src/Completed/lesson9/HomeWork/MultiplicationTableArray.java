package Completed.lesson9.HomeWork;

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
        for (int headerUnderLine = 1; headerUnderLine <= (shift * size); headerUnderLine++) {
            System.out.print("-");
        }
        System.out.println();

        int leftColumn = 1;
        for (int[] multiplicationResultArray : multiplicationTableArray) {
            System.out.printf("%" + shift + "d|", leftColumn);
            for (int multiplicationResult : multiplicationResultArray) {
                System.out.printf("%" + shift + "d", multiplicationResult);
            }
            ++leftColumn;
            System.out.println();
        }
    }

    private static int[][] getMultiplicationTable(int size) {
        int[][] array = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = (i + 1) * (j + 1);
            }
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