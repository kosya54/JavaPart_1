package lesson6.HomeWork;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите температуру в градусах цельсия:");
        int enteredTemperature = scanner.nextInt();

        System.out.printf("%d градусов цельсия равно %.2f градусов кельвина%n", enteredTemperature, convertToKelvin(enteredTemperature));
        System.out.printf("%d градусов цельсия равно %.2f градусов по фаренгейту", enteredTemperature, convertToFahrenheit(enteredTemperature));

    }

    private static double convertToKelvin(int temperature) {
        return temperature + 273.15;
    }

    private static double convertToFahrenheit(int temperature) {
        return (temperature * 9 / 5) + 32;
    }
}

