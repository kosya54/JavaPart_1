package CourseWork.TriangleArea;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        String axis;
        double[][] coordinates = new double[3][2];

        System.out.printf("Введите координаты вершин треугольника:%n");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {

                if (j == 0) {
                    axis = "X";
                } else {
                    axis = "Y";
                }

                System.out.printf("Введите %s%d: %n", axis, (i + 1));
                coordinates[i][j] = scanner.nextInt();
            }
        }

        if (isTriangle(coordinates)) {
            double sideA = calculateSideLength(coordinates[0][0], coordinates[1][0], coordinates[0][1], coordinates[1][1]);
            double sideB = calculateSideLength(coordinates[2][0], coordinates[1][0], coordinates[2][1], coordinates[1][1]);
            double sideC = calculateSideLength(coordinates[2][0], coordinates[0][0], coordinates[2][1], coordinates[0][1]);

            System.out.printf("%nПлощадь треугольника равна: %.5f%n", calculateTriangleArea(sideA, sideB, sideC));
        } else {
            System.out.println("Фигура не является треугольником. Координаты лежат на одной прямой.");
        }
    }

    private static boolean isTriangle(double[][] coordinates) {
        double[] coordinatesX = new double[coordinates.length];
        double[] coordinatesY = new double[coordinates.length];

        for (int i = 0; i < coordinates.length; i++) {
            coordinatesX[i] = coordinates[i][0];
            coordinatesY[i] = coordinates[i][1];
        }

        boolean triangle = true;

        if (Arrays.equals(coordinatesX, coordinatesY)) {
            triangle = false;
        } else if (isCoordinatesEquals(coordinatesX) || isCoordinatesEquals(coordinatesY)) {
            triangle = false;
        }
        return triangle;
    }

    private static boolean isCoordinatesEquals(double[] coordinates) {
        for (double coordinate : coordinates) {
            if (coordinate != coordinates[0]) {
                return false;
            }
        }
        return true;
    }

    private static double calculateSideLength(double xn, double xm, double yn, double ym) {
        return Math.sqrt(Math.pow((xm - xn), 2) + Math.pow((ym - yn), 2));
    }

    private static double calculateTriangleArea(double sideA, double sideB, double sideC) {
        double semiPerimeter = calculateSemiPerimeter(sideA, sideB, sideC);

        return Math.sqrt(semiPerimeter * ((semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC)));
    }

    private static double calculateSemiPerimeter(double sideA, double sideB, double sideC) {
        return (sideA + sideB + sideC)/2;
    }
}