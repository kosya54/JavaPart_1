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

        int monthsCount;
        while (true) {
            System.out.println("Укажите на какое количество месяцев делается вклад: ");
            monthsCount = scanner.nextInt();

            if (monthsCount <= 0) {
                System.out.println("Минимальный срок вклада 1 месяц.");
            } else {
                break;
            }
        }

        double annualInterestRate;
        while (true) {
            System.out.println("Укажите годовую процентную ставку: ");
            annualInterestRate = scanner.nextDouble();

            double epsilon = 1.0e-10;
            if (annualInterestRate <= epsilon) {
                System.out.println("Ставка не может быть меньше или равна нулю.");
            } else {
                break;
            }
        }

        double deposit = calculateProfit(depositAmount, monthsCount, annualInterestRate);
        System.out.printf("Сумма вклада по процентной ставке %.2f%% с учетом процентов за %d мес. составит: %.2f рублей.%n", annualInterestRate, monthsCount, deposit);
        System.out.printf("Прибыль за данный период составляет: %.2f рублей.", deposit - depositAmount);
    }

    private static double calculateProfit(double depositAmount, int monthCount, double annualInterestRate) {
        final int monthsInYear = 12;
        final double percentageDeposit = 100;

        double percentPerMonth = (percentageDeposit + (annualInterestRate / monthsInYear)) / percentageDeposit;
        for (int i = 1; i <= monthCount; i++) {
            depositAmount *= percentPerMonth;
        }
        return depositAmount;
    }
}