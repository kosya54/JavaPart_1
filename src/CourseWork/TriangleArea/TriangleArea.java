package CourseWork.TriangleArea;

import java.util.Locale;
import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        Triangle triangle = new Triangle();
        double[][] coordinates = triangle.readCoordinates();

        if (triangle.isTriangle(coordinates)) {
            double sideA = triangle.calculateSideLength(coordinates[0][0], coordinates[1][0], coordinates[0][1], coordinates[1][1]);
            double sideB = triangle.calculateSideLength(coordinates[2][0], coordinates[1][0], coordinates[2][1], coordinates[1][1]);
            double sideC = triangle.calculateSideLength(coordinates[2][0], coordinates[0][0], coordinates[2][1], coordinates[0][1]);

            System.out.printf("SideA = %f%n", sideA);
            System.out.printf("SideB = %f%n", sideB);
            System.out.printf("SideC = %f%n", sideC);
        } else {
            System.out.println("Фигура не является треугольником. Координаты лежат на одной прямой");
        }
    }
}
