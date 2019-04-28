import java.util.Scanner;
import java.util.Locale;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        double epsilon = 1.0e-10;
        double a = 2.95;
        double b = 5.57;

        System.out.printf("a - b = %f%nEpsilon = %f%n", a - b, epsilon);
        System.out.printf("a = %f, b = %f. b < 0 = %b", a, b, (-b) > epsilon);
/*
        System.out.println("Введите координаты вершин треугольника в виде (X1, Y1), (X2, Y2), (X3, Y3):");
        String param = scanner.nextLine();

        System.out.printf("%nВведенные координаты: %s%n", param);

        param = param.replace("(", "");
        param = param.replace(")", "");
        System.out.printf("Replaced %s%n", param);

        String[] splitParam = param.split(",");
        double[] coordinate = new double[6];

        int i = 0;
        for (String splitedParamValue : splitParam) {
            coordinate[i] = Double.parseDouble(splitedParamValue);
            System.out.printf("Double value: %f%n", coordinate[i]);
            i++;
        }*/
    }
}