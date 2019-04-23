import java.util.Locale;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("X1:");
        double x1 = scanner.nextDouble();

        System.out.println("X2:");
        double x2 = scanner.nextDouble();

        System.out.println("X3:");
        double x3 = scanner.nextDouble();

        System.out.printf(":%b", isCoordinatesEquals(x1, x2, x3));

/*        if (Math.abs(x1 - x2) < 0.0001) {
            System.out.printf("%f = %f", x1, x2);
        } else {
            System.out.printf("%f != %f", x1, x2);
        }*/
    }

    private static boolean isLine(double x1, double y1, double x2, double y2, double x3, double y3) {
        return (isCoordinatesEquals(x1, x2, x3)
                || isCoordinatesEquals(y1, y2, y3)
                || (isXEqualsY(x1, y1) && isXEqualsY(x2, y2) && isXEqualsY(x3, y3)));
    }
    //Возвращает true если координаты равны между собой, иначе false
    private static boolean isCoordinatesEquals(double coordinate1, double coordinate2, double coordinate3) {
        return (Math.abs(coordinate1 - coordinate2) < 0.00001)
                && (Math.abs(coordinate1 - coordinate3) < 0.00001)
                && (Math.abs(coordinate2 - coordinate3) < 0.00001);
    }
    //Возвращает true если coordinate1 = coordinate2, иначе false
    private static boolean isXEqualsY(double coordinate1, double coordinate2) {
        return (Math.abs(coordinate1 - coordinate2) < 0.00001);
    }
}
