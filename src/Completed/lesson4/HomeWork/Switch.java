package Completed.lesson4.HomeWork;

import java.util.Scanner;

class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число №1:");
        double number1 = scanner.nextDouble();

        System.out.println("Введите число №2:");
        double number2 = scanner.nextDouble();

        System.out.println("Введите команду (1 - сложение, 2 - вычетание, 3 - умножение, 4 - деление):");
        int command = scanner.nextInt();

        switch (command) {
            case 1:
                System.out.printf("%.2f + %.2f = %.2f", number1, number2, number1 + number2);
                break;
            case 2:
                System.out.printf("%.2f - %.2f = %.2f", number1, number2, number1 - number2);
                break;
            case 3:
                System.out.printf("%.2f * %.2f = %.2f", number1, number2, number1 * number2);
                break;
            case 4:
                System.out.printf("%.2f / %.2f = %.2f", number1, number2, number1 / number2);
                break;
            default:
                System.out.println("Неизвестная операция.");
        }
    }
}