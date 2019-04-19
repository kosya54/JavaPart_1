package lesson2.HomeWork;

public class Equation {
    public static void main(String[] args) {
        calculateEquation();
    }

    private static void calculateEquation() {
        double x = 3 - (56 - 12) / 44 * (4 / 2);
        double y = (2 * x) / (33 - x);
        double z = -x / (2 * y);

        System.out.println("Вычисляю Х по формуле: x = 3 - (56 - 12) / 44 * (4 / 2)");
        System.out.printf("X = %f%n%n", x);

        System.out.println("Вычисляю Y по формуле: y = (2 * x) / (33 - x)");
        System.out.printf("Y = %f%n%n", y);

        System.out.println("Вычисляю Z по формуле: z = -x / (2 * y)");
        System.out.printf("Z = %f%n", z);
    }
}