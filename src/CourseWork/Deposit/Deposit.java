package CourseWork.Deposit;

import java.util.Scanner;
import java.util.Calendar;

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

        int startMonth;
        while (true) {
            System.out.println("Укажите с какого месяца делается вклад: ");
            startMonth = scanner.nextInt();

            if (startMonth <= 0 || startMonth > 12) {
                System.out.println("Не корректный месяц.");
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

        Calendar calendar = Calendar.getInstance();

        int daysCount = 31;
        int daysInYear = 365;
        int currentYear = calendar.get(Calendar.YEAR);
        switch (startMonth) {
            case 2:
                if (isLeapYear(currentYear)) {
                    daysCount = 29;
                    daysInYear = 366;
                } else {
                    daysCount = 28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysCount = 30;
                break;
        }

        int annualInterestRate = 14;
        double deposit = calculateProfit(depositAmount, annualInterestRate, daysCount, daysInYear, monthCount);
        System.out.printf("Сумма вклада с учетом процентов за %d месяцев при ставке в %d%% годовых составит: %.2f рублей.%n", monthCount, annualInterestRate, deposit);
        System.out.printf("Прибыль за данный период составляет: %.2f рублей.", deposit - depositAmount);
    }

    private static double calculateProfit(double deposit, int annualInterestRate, int daysCount, int daysInYear, int monthCount) {
        double sum;
        for (int i = 1; i <= monthCount; i++) {
            sum = ((deposit * annualInterestRate * daysCount) / daysInYear) / 100;
            deposit += sum;
        }
        return deposit;
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}
