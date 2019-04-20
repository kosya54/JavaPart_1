package CourseWork.Apartments;

import java.util.Locale;
import java.util.Scanner;

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
        building.showApartment();
    }
}