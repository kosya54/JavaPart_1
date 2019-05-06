package lesson6.HomeWork;

import java.util.Scanner;

public class PrintAndRead {
    public static void main(String[] args) {
        String question1 = "Введите целое число: ";
        System.out.println(printAndRead(question1));

        String question2 = "Введите сумму 5 + 7: ";
        System.out.println(printAndRead(question2));

        String question3 = "Введите квадратный корень из 9: ";
        System.out.println(printAndRead(question3));
    }

    private static int printAndRead(String question) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(question);
        return scanner.nextInt();
    }
}