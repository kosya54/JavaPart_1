package CourseWork.Apartments;

import java.util.Scanner;

public class Apartments {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Укажите количество этажей:");
        int numberOfFloors = scanner.nextInt();

        System.out.println("Укажите количество подъездов:");
        int numberOfPorches = scanner.nextInt();

        System.out.println("Укажите номер искомой квартиры:");
        int apartmentNumber = scanner.nextInt();

        int apartmentsPerPorch = 4;
        int numberOfApartments = numberOfFloors * (numberOfPorches * apartmentsPerPorch);

        if (apartmentNumber > numberOfApartments) {
            System.out.printf("Квартиры с номером %d в здании нет.", apartmentNumber);
        } else {
            int porch = ((apartmentNumber - 1) / (numberOfFloors * apartmentsPerPorch)) + 1;
            int floor = (((apartmentNumber - 1) % (numberOfFloors * apartmentsPerPorch)) / apartmentsPerPorch) + 1;
            int apartmentPosition = (apartmentNumber - 1) % apartmentsPerPorch;

            System.out.printf("Квартира %d находится на %d этаже в %d подъезде %s", apartmentNumber, floor, porch, getApartmentPosition(apartmentPosition));
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