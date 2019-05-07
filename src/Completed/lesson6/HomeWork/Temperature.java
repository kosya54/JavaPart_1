package Completed.lesson6.HomeWork;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final String degree = "\u00B0";

        System.out.printf("Введите температуру в %sC: ", degree);
        double degreesCelsius = scanner.nextInt();

        System.out.printf("%.0f%s C равно %.2f K%n", degreesCelsius, degree, convertCelsiusToKelvin(degreesCelsius));
        System.out.printf("%.0f%s C равно %.2f F%s", degreesCelsius, degree, convertCelsiusToFahrenheit(degreesCelsius), degree);

    }

    private static double convertCelsiusToKelvin(double degreesCelsius) {
        return degreesCelsius + 273.15;
    }

    private static double convertCelsiusToFahrenheit(double degreesCelsius) {
        return (degreesCelsius * 9 / 5) + 32;
    }
}

