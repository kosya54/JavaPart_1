package CourseWork.MultiplicationTable;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Укажите верхнюю границу таблицы умножения:");
        int end = scanner.nextInt();

        int shift = calculateNumberLength((int) Math.pow(end, 2));
        String verticalLine = String.format("%" + shift + "s|", "");
        //Вывод шапки таблицы
        System.out.print(verticalLine);
        for (int i = 1; i <= end; i++) {
            System.out.printf("%" + shift + "d", i);
        }
        System.out.println();

        System.out.print(verticalLine);
        for (int i = 1; i <= (shift * end); i++) {
            System.out.print("-");
        }
        System.out.println();
        //Вывод левого столбца с цифрами, с разделителем и заполнение таблицы умножения
        for (int i = 1; i <= end; i++) {
            System.out.printf("%" + shift + "d|", i);
            for (int j = 1; j <= end; ++j) {
                System.out.printf("%" + shift + "d", i * j);
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
        return numberLength + 1;
    }
}