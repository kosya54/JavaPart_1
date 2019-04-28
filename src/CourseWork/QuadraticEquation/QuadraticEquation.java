package CourseWork.QuadraticEquation;

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

        if (Math.abs(a) <= epsilon) {
            System.out.println("Вы ввели a = 0, в этом случае уравнение становится линейным, что не попадает под условия задачи.");
        } else if (Math.abs(b) <= epsilon && Math.abs(c) > epsilon) {
            System.out.println("Вы ввели b = 0, уравнение принимает вид неполного квадратного уравнения ax^2 + c = 0.");

            if (-c / a > epsilon) {
                System.out.println("Уравнение имеет два корня.");

                double root1 = Math.sqrt(-c / a);
                System.out.printf("Корень №1 = %.2f%n", root1);

                double root2 = -(Math.sqrt(-c / a));
                System.out.printf("Корень №2 = %.2f", root2);
            } else {
                System.out.println("Корней нет.");
            }
        } else if (Math.abs(c) <= epsilon && Math.abs(b) > epsilon) {
            System.out.println("Вы ввели c = 0, уравнение принимает вид неполного квадратного уравнения ax^2 + bx = 0.");
            System.out.println("Уравнение имеет два корня.");
            System.out.println("Корень №1 = 0");
            System.out.printf("Корень №2 = %.2f", (-b / a));
        } else if (Math.abs(b) <= epsilon && Math.abs(c) <= epsilon) {
            System.out.println("Вы ввели b = 0 и c = 0, в данном случае уравнение имеет единственный корень.");
            System.out.println("Корень = 0");
        } else {
            double discriminant = Math.pow(b, 2) - 4 * a * c;

            if (discriminant > 0) {
                System.out.printf("Дискриминант равен: %.2f и больше 0, уравнение имеет 2 корня.%n", discriminant);
                System.out.printf("Корень №1 = %.2f.%nКорень №2 = %.2f.", (-b + Math.sqrt(discriminant)) / 2 * a, (-b - Math.sqrt(discriminant)) / 2 * a);
            } else if (discriminant == 0) {
                System.out.printf("Дискриминант равен 0, уравнение имеет 1 корень.%nКорень = %.2f.", -b / (2 * a));
            } else {
                System.out.println("Дискриминант меньше 0. Уравнение не имеет решений.");
            }
        }
    }
}