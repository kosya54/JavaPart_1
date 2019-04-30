package lesson4.HomeWork;

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

        if (command < 1 || command > 4) {
            System.out.println("Неизвестная операция");
        } else {
            System.out.printf("%.2f %s %.2f = %.2f", number1, getOperationStringView(command), number2, executeCommand(number1, number2, command));
        }
    }

    private static String getOperationStringView(int command) {
        String operation = "";
        switch (command) {
            case 1:
                operation = "+";
                break;
            case 2:
                operation = "-";
                break;
            case 3:
                operation = "*";
                break;
            case 4:
                operation = "/";
                break;
        }
        return operation;
    }

    private static double executeCommand(double number1, double number2, int command) {
        switch (command) {
            case 1:
                return number1 + number2;
            case 2:
                return number1 - number2;
            case 3:
                return number1 * number2;
            case 4:
                return number1 / number2;
        }
        return 0;
    }
}