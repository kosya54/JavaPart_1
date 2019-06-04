package CourseWork;

import java.util.Scanner;

public class Deposit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double initialDepositAmount;
        while (true) {
            System.out.println("Укажите сумму вклада: ");
            initialDepositAmount = scanner.nextDouble();

            double epsilon = 1.0e-10;
            if (initialDepositAmount <= epsilon) {
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
            annualInterestRate = scanner.nextDouble() / 100;

            double epsilon = 1.0e-10;
            if (annualInterestRate <= epsilon) {
                System.out.println("Ставка не может быть меньше или равна нулю.");
            } else {
                break;
            }
        }

        System.out.println("Расчет с возведением в степень.");
        double finalDepositAmount = calculateProfit(initialDepositAmount, monthsCount, annualInterestRate);
        System.out.printf("Сумма вклада по процентной ставке %.2f%% с учетом процентов за %d мес. составит: %.2f рублей.%n", annualInterestRate * 100, monthsCount, finalDepositAmount);
        System.out.printf("Прибыль за данный период составляет: %.2f рублей.%n%n", finalDepositAmount - initialDepositAmount);

        System.out.println("Расчет с использованием цикла.");
        finalDepositAmount = calculateProfitCycle(initialDepositAmount, monthsCount, annualInterestRate);
        System.out.printf("Сумма вклада по процентной ставке %.2f%% с учетом процентов за %d мес. составит: %.2f рублей.%n", annualInterestRate * 100, monthsCount, finalDepositAmount);
        System.out.printf("Прибыль за данный период составляет: %.2f рублей.", finalDepositAmount - initialDepositAmount);
    }

    private static double calculateProfit(double initialDepositAmount, int monthsCount, double annualInterestRate) {
        final int monthsInYear = 12;
        return initialDepositAmount * Math.pow((1 + annualInterestRate / monthsInYear), monthsCount);
    }

    private static double calculateProfitCycle(double initialDepositAmount, int monthsCount, double annualInterestRate) {
        final int monthsInYear = 12;

        double coefficient = 1 + annualInterestRate / monthsInYear;
        double coefficientPerDepositPeriod = 1;
        for (int month = 1; month <= monthsCount; month++) {
            coefficientPerDepositPeriod *= coefficient;
        }
        return initialDepositAmount * coefficientPerDepositPeriod;
    }
}