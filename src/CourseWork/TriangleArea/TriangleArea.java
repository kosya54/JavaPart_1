package CourseWork.TriangleArea;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите координаты вершин треугольника.");
        System.out.println("Введите X1:");
        double x1 = scanner.nextDouble();

        System.out.println("Введите Y1:");
        double y1 = scanner.nextDouble();

        System.out.println("Введите X2:");
        double x2 = scanner.nextDouble();

        System.out.println("Введите Y2:");
        double y2 = scanner.nextDouble();

        System.out.println("Введите X3:");
        double x3 = scanner.nextDouble();

        System.out.println("Введите Y3:");
        double y3 = scanner.nextDouble();

        double sideALength = calculateSideLength(x1, y1, x2, y2);
        double sideBLength = calculateSideLength(x2, y2, x3, y3);
        double sideCLength = calculateSideLength(x3, y3, x1, y1);

        if (isLine(x1, y1, x2, y2, x3, y3) || isSidesEqual(sideALength, sideBLength, sideCLength)) {
            System.out.println("Фигура не является треугольником. Координаты лежат на одной прямой.");
        } else {
            System.out.printf("Площадь треугольника = %.3f", calculateTriangleArea(sideALength, sideBLength, sideCLength));
        }
    }

    private static boolean isLine(double x1, double y1, double x2, double y2, double x3, double y3) {
        return isCoordinatesEqual(x1, x2, x3)
                || isCoordinatesEqual(y1, y2, y3)
                || (isDoubleNumbersEqual(x1, y1) && isDoubleNumbersEqual(x2, y2) && isDoubleNumbersEqual(x3, y3));
    }

    private static boolean isSidesEqual(double sideALength, double sideBLength, double sideCLength) {
        return isDoubleNumbersEqual((sideALength + sideBLength), sideCLength);
    }

    private static boolean isCoordinatesEqual(double coordinate1, double coordinate2, double coordinate3) {
        return isDoubleNumbersEqual(coordinate1, coordinate2)
                && isDoubleNumbersEqual(coordinate1, coordinate3)
                && isDoubleNumbersEqual(coordinate2, coordinate3);
    }

    private static boolean isDoubleNumbersEqual(double number1, double number2) {
        return (Math.abs(number1 - number2) < 0.00001);
    }

    private static double calculateSideLength(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    private static double calculateTriangleArea(double sideA, double sideB, double sideC) {
        double semiPerimeter = calculateSemiPerimeter(sideA, sideB, sideC);

        return Math.sqrt(semiPerimeter * ((semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC)));
    }

    private static double calculateSemiPerimeter(double sideA, double sideB, double sideC) {
        return (sideA + sideB + sideC) / 2;
    }
}