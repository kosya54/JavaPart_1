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

        System.out.println("Расчет с возведением в степень.");
        double deposit = calculateProfit(depositAmount, monthsCount, annualInterestRate / 100);
        System.out.printf("Сумма вклада по процентной ставке %.2f%% с учетом процентов за %d мес. составит: %.2f рублей.%n", annualInterestRate, monthsCount, deposit);
        System.out.printf("Прибыль за данный период составляет: %.2f рублей.%n%n", deposit - depositAmount);

        System.out.println("Расчет с использованием цикла.");
        deposit = calculateProfitCycle(depositAmount, monthsCount, annualInterestRate / 100);
        System.out.printf("Сумма вклада по процентной ставке %.2f%% с учетом процентов за %d мес. составит: %.2f рублей.%n", annualInterestRate, monthsCount, deposit);
        System.out.printf("Прибыль за данный период составляет: %.2f рублей.", deposit - depositAmount);
    }

    private static double calculateProfit(double depositAmount, int monthsCount, double annualInterestRate) {
        final int monthsInYear = 12;
        return depositAmount * Math.pow((1 + annualInterestRate / monthsInYear), monthsCount);
    }

    private static double calculateProfitCycle(double depositAmount, int monthsCount, double annualInterestRate) {
        final int monthsInYear = 12;
        for (int i = 0; i < monthsCount; i++) {
            depositAmount = depositAmount * (1 + annualInterestRate / monthsInYear);
        }
        return depositAmount;
    }
}