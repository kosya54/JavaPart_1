package Completed.lesson4.ClassWork;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите команду:");
        String command = scanner.nextLine();

        switch (command){
            case ("print"):
                System.out.println("Введите строку:");
                System.out.println(scanner.nextLine());
                break;
            case ("sum"):
                System.out.println("Введите вещественное число №1:");
                double number1 = scanner.nextDouble();

                System.out.println("Введите вещественное число №2:");
                double number2 = scanner.nextDouble();

                System.out.printf("Сумма %f + %f = %f", number1, number2, number1 + number2);
                break;
            default:
                System.out.println("Неизвестная команда");
        }
    }
}