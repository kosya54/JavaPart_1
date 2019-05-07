package Completed.lesson2.ClassWork;

import java.util.Scanner;
import java.util.Locale;

public class Rectangle {
    public static void main(String[] args) {
        double[] rectangleParam = readRectangleParam();
        double rectangleArea = getRectangleArea(rectangleParam);
        double rectanglePerimeter = getRectanglePerimeter(rectangleParam);
        System.out.printf("Длина прямоугольника = %.2f%n Ширина прямоугольника = %.2f%n Площадь прямоугольника = %.2f%n Периметр прямоугольника = %.2f%n", rectangleParam[0], rectangleParam[1], rectangleArea, rectanglePerimeter);
    }

    private static double[] readRectangleParam() {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Укажите длину прямоугольника: ");
        double rectangleLength = scanner.nextDouble();

        System.out.println("Укажите ширину прямоугольника: ");
        double rectangleWidth = scanner.nextDouble();

        return new double[] {rectangleLength, rectangleWidth};
    }

    private static double getRectangleArea(double[] rectangleParam) {
        return rectangleParam[0] * rectangleParam[1];
    }

    private static double getRectanglePerimeter(double[] rectangleParam) {
        return 2 * (rectangleParam[0] + rectangleParam[1]);
    }
}