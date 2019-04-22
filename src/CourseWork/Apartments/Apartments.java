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
            int apartmentsOnFloor = totalPorches * 4;
            double porch = apartmentsOnFloor % requiredApartment;

            System.out.printf("Подъезд: %f%n", porch);
        }
    }

    private static String getApartmentPosition(int apartmentPosition) {
        switch (apartmentPosition) {
            case 1:
                return "ближняя слева";
            case 2:
                return "дальняя слева";
            case 3:
                return "дальняя справа";
            case 4:
                return "ближняя справа";
        }
        return "";
    }
}