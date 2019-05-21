package CourseWork;

import java.util.Scanner;

public class Deposit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double depositAmount;
        while (true) {
            System.out.println("Укажите сумму вклада: ");
            depositAmount = scanner.nextDouble();

            double epsilon = 1.0e-10;
            if (depositAmount <= epsilon) {
                System.out.println("Сумма не может быть меньше или равна нулю.");
            } else {
                break;
            }
        }

        int monthCount;
        while (true) {
            System.out.println("Укажите на какое количество месяцев делается вклад: ");
            monthCount = scanner.nextInt();

            if (monthCount <= 0) {
                System.out.println("Минимальный срок вклада 1 месяц.");
            } else {
                break;
            }
        }

        double deposit = calculateProfit(depositAmount, monthCount);
        System.out.printf("Сумма вклада с учетом процентов за %d мес. составит: %.2f рублей.%n", monthCount, deposit);
        System.out.printf("Прибыль за данный период составляет: %.2f рублей.", deposit - depositAmount);
    }

    private static double calculateProfit(double depositAmount, int monthCount) {
        final double annualInterestRate = 14;
        double percentPerMonth = annualInterestRate / 12;

        for (int i = 1; i <= monthCount; i++) {
            depositAmount *= ((100 + percentPerMonth) / 100);
        }
        return depositAmount;
    }
}
