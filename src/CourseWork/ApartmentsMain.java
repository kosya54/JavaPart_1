package CourseWork;

import java.util.Scanner;
import java.util.Locale;

public class ApartmentsMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Укажите колличество этажей: ");
        int totalFloors = scanner.nextInt();

        System.out.println("Укажите колличество подъездов: ");
        int totalPorches = scanner.nextInt();

        System.out.println("Укажите номер искомой квартиры: ");
        int requiredApartment = scanner.nextInt();

        Building building = new Building(totalFloors, totalPorches, requiredApartment);
        int[] apartment = building.findApartment();

        if (apartment.length == 0) {
            System.out.printf("Квартиры с номером %d нет.", requiredApartment);
        } else {
            System.out.printf("Квартира %d находится в %d подъезде %d этажа%n", apartment[2], apartment[1], apartment[0]);
            System.out.printf("Квартира на лестничной площадке %s%n", building.getApartmentPosition(apartment[3]));
        }
    }
}