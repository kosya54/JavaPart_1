//TODO: Разбить задачи на отдельные классы
package lesson2;

import java.util.Scanner;

public class Lines {
    public static void main(String[] args) {
        showLines();
        calculateInt();
        calculateDouble();
        printAreaCircle();
        equation();
    }

    private static void showLines() {
        System.out.println("Line 1" + System.lineSeparator() + "Line 2" + System.lineSeparator() + "Line 3" + System.lineSeparator());
        System.out.println("\"30\" августа 2014г." + System.lineSeparator() + "C:\\Windows\\System32\\Drivers\\etc\\hosts" + System.lineSeparator());
        System.out.println("Результат = " + (2 + 2));
    }

    private static void calculateInt() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое число №1: ");
        int number1 = scanner.nextInt();

        System.out.println(System.lineSeparator() + "Введите целое число №2: ");
        int number2 = scanner.nextInt();

        System.out.println(System.lineSeparator() + "Результат:" + System.lineSeparator() + number1 + " + " + number2 + " = " + (number1 + number2));
        System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
        System.out.println(number1 + " * " + number2 + " = " + (number1 * number2));
        System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));
        System.out.println(number1 + " % " + number2 + " = " + (number1 % number2));
    }

    private static void calculateDouble() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите вещественное число №1: ");
        double number1 = scanner.nextDouble();

        System.out.println(System.lineSeparator() + "Введите вещественное число №2: ");
        double number2 = scanner.nextDouble();

        System.out.println(System.lineSeparator() + "Result:" + System.lineSeparator() + number1 + " + " + number2 + " = " + (number1 + number2));
        System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
        System.out.println(number1 + " * " + number2 + " = " + (number1 * number2));
        System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));
        System.out.println(number1 + " % " + number2 + " = " + (number1 % number2));
    }

    private static void equation() {
        double x = 3 - (56-12) / 44 * (4/2);
        System.out.println("X = " + x);

        double y = (2 * x) / (33 - x);
        System.out.println("Y = " + y);

        double z = -x / (2 * y);
        System.out.println("Z = " + z);
    }

    private static void printAreaCircle() {
        int radius = 50;
        System.out.println(Math.PI * Math.sqrt(radius));
    }
}
