package CourseWork.TriangleArea;

//import java.util.Locale;
import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        scanner.useLocale(Locale.US);

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
        double sideCLength = calculateSideLength(x3, y1, x1, y1);

        if (isLine(x1, y1, x2, y2, x3, y3) || isSidesEqual(sideALength, sideBLength, sideCLength)) {
            System.out.println("Фигура не является треугольником. Координаты лежат на одной прямой.");
        } else {
            System.out.printf("Площадь треугольника = %.3f", calculateTriangleArea(sideALength, sideBLength, sideCLength));
        }
    }

    private static boolean isLine(double x1, double y1, double x2, double y2, double x3, double y3) {
        return (isCoordinatesEqual(x1, x2, x3)
                || isCoordinatesEqual(y1, y2, y3)
                || (isXEqualY(x1, y1) && isXEqualY(x2, y2) && isXEqualY(x3, y3)));
    }

    private static boolean isSidesEqual(double sideALength, double sideBLength, double sideCLength) {
        return Math.abs((sideALength + sideBLength) - sideCLength) < 0.00001;
    }

    //Возвращает true если координаты равны между собой, иначе false
    private static boolean isCoordinatesEqual(double coordinate1, double coordinate2, double coordinate3) {
        return (Math.abs(coordinate1 - coordinate2) < 0.00001)
                && (Math.abs(coordinate1 - coordinate3) < 0.00001)
                && (Math.abs(coordinate2 - coordinate3) < 0.00001);
    }

    //Возвращает true если coordinate1 = coordinate2, иначе false
    private static boolean isXEqualY(double coordinate1, double coordinate2) {
        return (Math.abs(coordinate1 - coordinate2) < 0.00001);
    }
//TODO: Поправить формулу
    private static double calculateSideLength(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((y1 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    private static double calculateTriangleArea(double sideA, double sideB, double sideC) {
        double semiPerimeter = calculateSemiPerimeter(sideA, sideB, sideC);

        return Math.sqrt(semiPerimeter * ((semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC)));
    }

    private static double calculateSemiPerimeter(double sideA, double sideB, double sideC) {
        return (sideA + sideB + sideC) / 2;
    }
}