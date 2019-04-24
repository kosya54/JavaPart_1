package CourseWork.QuadraticEquation;

import java.util.Scanner;
import java.util.Locale;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Решение квадратного уравнения вида ax^2 + bx + c = 0.");

        System.out.println("Введите коэффициент a:");
        double a = scanner.nextDouble();

        System.out.println("Введите коэффициент b:");
        double b = scanner.nextDouble();

        System.out.println("Введите коэффициент c:");
        double c = scanner.nextDouble();

        double discriminant = calculateDiscriminant(a, b, c);
        System.out.println(discriminant);

        if (discriminant > 0) {
//            double equationRoot1 =  (-b + Math.sqrt(discriminant)) / 2 * a;
//            double equationRoot2 =  (-b - Math.sqrt(discriminant)) / 2 * a;

            double equationRoot1 = calculateEquationRoot1(a, b, discriminant);
            double equationRoot2 = calculateEquationRoot2(a, b, discriminant);

            System.out.printf("Дискриминант равен: %.2f и больше 0, уравнение имеет 2 корня.%nКорень №1 = %.2f.%nКорень №2 = %.2f.", discriminant, equationRoot1, equationRoot2);
        } else if (discriminant == 0) {
            double equationRoot = -b / (2 * a);

            System.out.printf("Дискриминант равен 0, уравнение имеет 1 корень.%nКорень = %f%.", equationRoot);
        } else {
            System.out.println("Дискриминант меньше 0. Уравнение не имеет решений.");
        }
    }

    private static double calculateDiscriminant(double a, double b, double c) {
        return Math.pow(b, 2) - 4 * a * c;
    }

    private static double calculateEquationRoot1(double a, double b, double discriminant) {
        return (-b + Math.sqrt(discriminant)) / 2 * a;
    }

    private static double calculateEquationRoot2(double a, double b, double discriminant) {
        return (-b - Math.sqrt(discriminant)) / 2 * a;
    }
}