package lesson7.HomeWork.Range;

import java.util.Scanner;

public class RangeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//TODO: Сделать нормальный ввод Range сразу x и y
        System.out.println("Введите Х:");
        double x = scanner.nextDouble();

        System.out.println("Введите Y:");
        double y = scanner.nextDouble();

        Range range = new Range(x, y);

        System.out.println("Введите число:");
        double number = scanner.nextDouble();

        System.out.printf("%.2f - %b%n", number, range.isInside(number));
        System.out.printf("%.2f", range.getLength());
    }
}
