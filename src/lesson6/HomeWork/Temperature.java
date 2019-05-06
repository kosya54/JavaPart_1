package lesson6.HomeWork;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final String degree = "\u00B0";

        System.out.printf("Введите температуру в %sC: ", degree);
        int degreesCelsius = scanner.nextInt();

        System.out.printf("%d%s C равно %.2f K%n", degreesCelsius, degree, convertCelsiusToKelvin(degreesCelsius));
        System.out.printf("%d%s C равно %.2f F%s", degreesCelsius, degree, convertCelsiusToFahrenheit(degreesCelsius), degree);

    }

    private static double convertCelsiusToKelvin(int degreesCelsius) {
        return degreesCelsius + 273.15;
    }

    private static double convertCelsiusToFahrenheit(int degreesCelsius) {
        return (degreesCelsius * 9 / 5) + 32;
    }
}

