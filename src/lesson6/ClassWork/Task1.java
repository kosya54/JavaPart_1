package lesson6.ClassWork;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        while (i < 3) {
            System.out.println("Введите x:");
            double x = scanner.nextDouble();

            System.out.println("Введите y:");
            double y = scanner.nextDouble();

            System.out.printf("3x + 4y = %.2f при x = %.2f и y = %.2f%n", getSum(x, y), x, y);
            i++;
        }

        System.out.println("Введите begin:");
        int begin = scanner.nextInt();

        System.out.println("Введите end:");
        int end = scanner.nextInt();

        System.out.printf("Среднее арифметическое равно: %.2f%n", getAverage(begin, end));

        System.out.println("Введите number1:");
        int number1 = scanner.nextInt();

        System.out.println("Введите number2:");
        int number2 = scanner.nextInt();

        System.out.printf("Min: %d, Max: %d", getMin(number1, number2), getMax(number1, number2));
    }

    private static double getSum(double x, double y) {
        return 3 * x + 4 * y;
    }

    private static double getAverage(int begin, int end) {
        int count = 0;
        int sum = 0;

        while (begin <= end) {
            sum += begin;
            count++;
            begin++;
        }
        return sum / count;
    }

    private static int getMin(int number1, int number2) {
        return (number1 > number2) ? number2 : number1;
    }

    private static int getMax(int number1, int number2) {
        return (number1 > number2) ? number1 : number2;
    }

/*    private static void showMinMax(int number1, int number2) {
        int min;
        int max;

        if (number1 > number2) {
            max = number1;
            min = number2;
        } else {
            max = number2;
            min = number1;
        }

        System.out.printf("Min: %d, Max: %d", min, max);
    } */
}
