package CourseWork.Apartments;

import java.util.Locale;
import java.util.Scanner;

public class ApartmentsMain {
    public static void main(String[] args) {
        String questionFloors = "Укажите колличество этажей: ";
        int totalFloors = checkInt(questionFloors);

        if (totalFloors == 0) {
            while (totalFloors == 0) {
                totalFloors = checkInt(questionFloors);
            }
        }

        String questionPorches = "Укажите колличество подъездов: ";
        int totalPorches = checkInt(questionPorches);

        if (totalPorches == 0) {
            while (totalPorches == 0) {
                totalPorches = checkInt(questionPorches);
            }
        }

        String questionApartment = "Укажите номер искомой квартиры: ";
        int requiredApartment = checkInt(questionApartment);

        if (requiredApartment == 0) {
            while (requiredApartment == 0) {
                requiredApartment = checkInt(questionApartment);
            }
        }

        Building building = new Building(totalFloors, totalPorches, requiredApartment);
        building.showApartment();
    }

    private static int checkInt(String question) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print(question);

        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            System.out.println("Число должно быть целым");
        }
        return 0;
    }
}