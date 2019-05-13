package lesson7.HomeWork.Range;

import java.util.Scanner;

public class RangeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите Х:");
        double x = scanner.nextDouble();

        System.out.println("Введите Y:");
        double y = scanner.nextDouble();

        Range range = new Range(x, y);

        System.out.printf("Вы ввели X: %.2f и Y: %.2f, длина диапазона равна: %.2f%n", range.getFrom(), range.getTo(), range.getLength());

        System.out.println("Введите число:");
        double number = scanner.nextDouble();

        if (range.isInside(number)) {
            System.out.printf("Число %.2f принадлежит диапазону %.2f : %.2f", number, range.getFrom(), range.getTo());
        } else {
            System.out.printf("Число %.2f не принадлежит диапазону %.2f : %.2f%n", number, range.getFrom(), range.getTo());

            System.out.println("Подгоняю диапазон под указанное число.");
            range.setFrom(range.getFrom() * number);
            range.setTo(range.getTo() * number);
            System.out.printf("Число %.2f принадлежит диапазону %.2f : %.2f", number, range.getFrom(), range.getTo());
        }
    }
}
