package CourseWork.NextDate;

import java.util.Scanner;

public class NextDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите дату в формате dd.mm.yyyy, год не должен превышать 3000:");
        int[] enteredDate = convertStringToIntegerArray(scanner.nextLine());

        final int maxYear = 3000;
        final int minYear = 1000;
        final int countMonths = 12;
        int countDays = 31;

        int day = enteredDate[0];
        int month = enteredDate[1];
        int year = enteredDate[2];

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                break;
            case 2:
                if (checkLeapYear(year)) {
                    countDays = 29;
                } else {
                    countDays = 28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                countDays = 30;
                break;
        }

        if (day > countDays || day <= 0) {
            System.out.printf("Вы ввели не корректный день %d, день не может быть равен 0 и не может превышать %d.", day, countDays);
        } else if (month > countMonths || month <= 0) {
            System.out.printf("Вы ввели не корректный месяц %d, месяц не может быть равен 0 и не может превышать %d.", month, countMonths);
        } else if (year > maxYear || year < minYear) {
            System.out.printf("Вы ввели не корректный год, год не должен превышать %d.", maxYear);
        } else {
            if (day < countDays) {
                day += 1;
            } else if (day == countDays && month < countMonths) {
                day = 1;
                month += 1;
            } else {
                day = 1;
                month = 1;
                year += 1;
            }

            String stringDay = "%d";
            String stringMonth = "%d";

            if (day < 10) {
                stringDay = "%02d";
            }
            if (month < 10) {
                stringMonth = "%02d";
            }
            System.out.printf("Следующий день: " + stringDay + "." + stringMonth + ".%d", day, month, year);
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

    private static boolean checkLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
}