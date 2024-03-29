package Completed.CourseWork;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Решение квадратного уравнения вида ax^2 + bx + c = 0.");

        System.out.println("Введите коэффициент a:");
        double a = scanner.nextDouble();

        System.out.println("Введите коэффициент b:");
        double b = scanner.nextDouble();

        System.out.println("Введите коэффициент c:");
        double c = scanner.nextDouble();

        double epsilon = 1.0e-10;

        if (Math.abs(a) > epsilon) {
            double discriminant = calculateDiscriminant(a, b, c);

            if (discriminant > epsilon) {
                double equationRoot1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double equationRoot2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.printf("Дискриминант равен %.2f и больше 0, уравнение имеет два корня.%nКорень №1 = %.2f%nКорень №2 = %.2f", discriminant, equationRoot1, equationRoot2);
            } else if (Math.abs(discriminant) <= epsilon) {
                double equationRoot = -b / (2 * a);
                System.out.printf("Дискриминант равен 0, уравнение имеет один корень.%nКорень = %.2f", equationRoot);
            } else {
                System.out.printf("Дискриминант равен %.2f и меньше 0, уравнение не имеет корней", discriminant);
            }
        } else if (Math.abs(b) > epsilon) {
            System.out.printf("Вы ввели a = %.0f уравнение принимает вид линейного.%n", a);

            double equationRoot = -c / b;
            System.out.printf("Корень = %.2f", equationRoot);
        } else if (Math.abs(c) > epsilon) {
            System.out.println("Уравнение не имеет корней.");
        } else {
            System.out.printf("Вы ввели a = %.0f, b = %.0f и с = %.0f, корень уравнения равен любому числу.", a, b, c);
        }
    }

    private static double calculateDiscriminant(double a, double b, double c) {
        return Math.pow(b, 2) - 4 * a * c;
    }
}