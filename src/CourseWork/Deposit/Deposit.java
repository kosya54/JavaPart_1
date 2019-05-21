package CourseWork.Deposit;

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

        final double annualInterestRate = 10.5;
        double deposit = calculateProfit(annualInterestRate, depositAmount, monthCount);
        System.out.printf("Сумма вклада с учетом процентов за %d мес. при ставке %.2f%% годовых составит: %.2f рублей.%n", monthCount, annualInterestRate, deposit);
        System.out.printf("Прибыль за данный период составляет: %.2f рублей.", deposit - depositAmount);
    }

    private static double calculateProfit(double annualInterestRate, double depositAmount, int monthCount) {
        final int daysCount = 30;
        final int daysInYear = 365;
        
        return depositAmount * Math.pow((1 + (annualInterestRate * daysCount) / (100 * daysInYear)), monthCount);
    }
}
