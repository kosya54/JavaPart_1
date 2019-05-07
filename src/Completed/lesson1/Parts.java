package Completed.lesson1;

import java.util.Scanner;

public class Parts {
    public static void main(String[] args) {
        System.out.println("На основе положения банка России от 19 сентября 2014 года №432-П");
        System.out.println("Данное приложение расчитывает размер износа подлежащих замене комплектующих изделий (деталий, узлов, агрегатов)");

        calculateWearPart();
    }

    private static void calculateWearPart() {
        //Коэффициент влияния на износ для автотранспорта отечественного производства
        double deltaT = 0.057;
        //Коэффициент влияния на износ для автотранспорта отечественного производства
        double deltaL = 0.0030;

        String questionPartLife = "Укажите возраст детали в годах: ";
        String questionVehicleMileage = "Укажите пробег детали в тыс. км: ";

        //Срок эксплуатации комплектующего изделия
        int partLife = readSparePartParam(questionPartLife);

        if (partLife == 0) {
            while (partLife == 0) {
                partLife = readSparePartParam(questionPartLife);
            }
        }

        //Пробег автотранспорта на дату ДТП
        int vehicleMileage = readSparePartParam(questionVehicleMileage);

        if (vehicleMileage == 0) {
            while (vehicleMileage == 0) {
                vehicleMileage = readSparePartParam(questionVehicleMileage);
            }
        }

        double exponent = -(deltaT * partLife + deltaL * vehicleMileage);
        double wearParts = 100 * (1 - Math.pow(Math.E, exponent));

        System.out.println("Износ комплектующих детали составляет: " + Math.round(wearParts) + "%");
    }

    private static int readSparePartParam(String param) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(param);

        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            System.out.println("Число должно быть целым");
        }
        return 0;
    }
}
