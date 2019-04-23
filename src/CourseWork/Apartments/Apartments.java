package CourseWork.Apartments;

import java.util.Scanner;

public class Apartments {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Укажите количество этажей:%n");
        int totalFloors = scanner.nextInt();

        System.out.printf("Укажите количество подъездов:%n");
        int totalPorches = scanner.nextInt();

        System.out.printf("Укажите номер искомой квартиры:%n");
        int requiredApartment = scanner.nextInt();

        int totalApartments = totalFloors * (totalPorches * 4);

        if (requiredApartment > totalApartments) {
            System.out.printf("Квартиры с номером %d в здании нет.", requiredApartment);
        } else {
            int porch = ((requiredApartment - 1) / (totalFloors * 4)) + 1;
            int floor = (((requiredApartment - 1) % (totalFloors * 4)) / 4) + 1;
            int apartmentPosition = (requiredApartment - 1) % 4;

            System.out.printf("Квартира %d находится на %d этаже в %d подъезде %s", requiredApartment, floor, porch, getApartmentPosition(apartmentPosition));
        }
    }

    private static String getApartmentPosition(int apartmentPosition) {
        switch (apartmentPosition) {
            case 0:
                return "ближняя слева";
            case 1:
                return "дальняя слева";
            case 2:
                return "дальняя справа";
            case 3:
                return "ближняя справа";
        }
        return "";
    }
}