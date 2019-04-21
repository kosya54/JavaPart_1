package CourseWork.TriangleArea;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

final class Triangle {
    private double[][] coordinates;
    private Scanner scanner;

    Triangle() {
        this.coordinates = new double[3][2];
        this.scanner = new Scanner(System.in);
        this.scanner.useLocale(Locale.US);
    }

    double[][] readCoordinates() {
        String axis;

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
        return coordinates;
    }

    boolean isTriangle(double[][] coordinates) {
        double[] coordinatesX = new double[coordinates.length];
        double[] coordinatesY = new double[coordinates.length];

        for (double[] coordinate : coordinates) {
            for (int j = 0; j < coordinate.length; j++) {
                coordinatesX[j] = coordinates[j][0];
                coordinatesY[j] = coordinates[j][1];
            }
        }

        for (int i = 0; i < coordinatesX.length; i++) {
            System.out.println(coordinatesX[i]);
        }

        boolean triangle = true;

        if (Arrays.equals(coordinatesX, coordinatesY)) {
            triangle = false;
        } else if (this.isCoordinatesEquals(coordinatesX)) {
            triangle = false;
        }
        return triangle;
    }

    private boolean isCoordinatesEquals(double[] coordinates) {
        for (double coordinate : coordinates) {
            if (coordinate != coordinates[0]) {
                return false;
            }
        }
        return true;
    }

    double calculateSideLength(double xn, double xm, double yn, double ym) {
        return Math.sqrt(Math.pow((xm - xn), 2) + Math.pow((ym - yn), 2));
    }
}
