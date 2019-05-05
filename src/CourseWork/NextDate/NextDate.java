package CourseWork.NextDate;

import java.util.Scanner;

public class NextDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите дату в формате dd.mm.yyyy, год не должен превышать 3000:");
        int[] enteredDate = convertStringToIntegerArray(scanner.nextLine());

        final int maxYear = 3000;
        final int minYear = 1000;
        final int monthsCount = 12;
        int daysCount = 31;

        int day = enteredDate[0];
        int month = enteredDate[1];
        int year = enteredDate[2];

        switch (month) {
            case 2:
                if (isLeapYear(year)) {
                    daysCount = 29;
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

        if (day > daysCount || day <= 0) {
            System.out.printf("Вы ввели не корректный день %02d, день не может быть равен 0 и не может превышать %02d.", day, daysCount);
        } else if (month > monthsCount || month <= 0) {
            System.out.printf("Вы ввели не корректный месяц %02d, месяц не может быть равен 0 и не может превышать %02d.", month, monthsCount);
        } else if (year > maxYear || year < minYear) {
            System.out.printf("Вы ввели не корректный год, год не должен превышать %04d.", maxYear);
        } else {
            if (day < daysCount) {
                day++;
            } else if (day == daysCount && month < monthsCount) {
                day = 1;
                month++;
            } else {
                day = 1;
                month = 1;
                year++;
            }

            System.out.printf("Следующий день: %02d.%02d.%04d", day, month, year);
        }
    }

    private static int[] convertStringToIntegerArray(String string) {
        String[] splitString = string.split("[.]");
        int[] intArray = new int[splitString.length];

        for (int i = 0; i < splitString.length; i++) {
            intArray[i] = Integer.parseInt(splitString[i]);
        }
        return intArray;
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}