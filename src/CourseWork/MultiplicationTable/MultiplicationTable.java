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
        for (int f = 1; f <= end; ++f) {
            String separator = getSeparator(f, end);
            System.out.printf("%" + shift + "d" + separator, f);
        }

        System.out.print(verticalLine);
        int k = 1;
        while (k <= (shift * end)) {
            String separator = getSeparator(k, shift * end);
            System.out.printf("%s" + separator, "-");
            ++k;
        }
        //Вывод левого столбца с цифрами, с разделителем и заполнение таблицы умножения
        for (int i = 1; i <= end; ++i) {
            System.out.printf("%" + shift + "d|", i);
            for (int j = 1; j <= end; ++j) {
                String separator = getSeparator(j, end);
                System.out.printf("%" + shift + "d" + separator, i * j);
            }
        }
    }

    private static String getSeparator(int number1, int number2) {
        return (number1 == number2) ? "%n" : "";
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