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
        double requiredApartment = scanner.nextDouble();

        int totalApartments = totalFloors * (totalPorches * 4);

        if (requiredApartment > totalApartments) {
            System.out.printf("Квартиры с номером %f в здании нет.", requiredApartment);
        } else {
            //вычисляем подъезд
            double porch = requiredApartment / (totalFloors * 4);
            System.out.println("Подъезд: " + Math.ceil(porch));

            int integerPart = (int)porch;
            double floor = (porch - integerPart) * totalFloors;
            System.out.println("Этаж: " + floor);
            System.out.println("Этаж: " + Math.ceil(floor));
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