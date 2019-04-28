package CourseWork.NextDate;

import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class NextDate {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите дату в формате dd.mm.yyyy:");
        String enteredDate = scanner.nextLine();

        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");

        String currentDate = dateFormat.format(date);

        if (!enteredDate.equals(currentDate)) {
            System.out.printf("Вы ввели дату: %s, но сегодня %s.%n", enteredDate, currentDate);

            while(true) {
                System.out.println("Введите сегодняшнюю дату в формате dd.mm.yyyy:");
                enteredDate = scanner.nextLine();

                if (enteredDate.equals(currentDate)) {
                    break;
                }
            }
        }

        System.out.println("Бла бла день + 1");
//        int[] enteredDate = convertStringToInteger(scanner.nextLine());

/*        int enteredDay = enteredDate[0];
        int enteredMonth = enteredDate[1];
        int enteredYear = enteredDate[2]; */

//        System.out.printf("День: %d Месяц: %d Год: %d", enteredDay, enteredMonth, enteredYear);
    }

    private static int[] convertStringToInteger(String string) {
        String[] splitString = string.split("[.]");
        int[] intArray = new int[splitString.length];

        for (int i = 0; i < splitString.length; i++) {
            intArray[i] = Integer.parseInt(splitString[i]);
        }

        return intArray;
    }
}
