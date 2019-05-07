package Completed.lesson2.HomeWork;

public class Circle {
    public static void main(String[] args) {
        int circleRadius = 10;
        System.out.printf("Радиус = %d%n", circleRadius);
        System.out.println("Площадь круга = " + getCircleArea(circleRadius));
        System.out.println("Длина окружности = " + getCircleLength(circleRadius));

        int circleArea = 200;
        System.out.printf("%nПлощадь круга = %d%n", circleArea);
        System.out.println("Радиус = " + getCircleRadius(circleArea));

        int circleAngle = 60;
        System.out.printf("%nРадиус = %d%nУгол = %d%n", circleRadius, circleAngle);
        System.out.println("Площадь сектора = " + getSectorArea(circleRadius, circleAngle));
    }

    private static double getCircleArea(int circleRadius) {
        return Math.PI * Math.pow(circleRadius, 2);
    }

    private static double getCircleLength(int circleRadius) {
        return 2 * Math.PI * circleRadius;
    }

    private static double getCircleRadius(int circleArea) {
        return Math.sqrt(circleArea / Math.PI);
    }

    private static double getSectorArea(int circleRadius, int circleAngle) {
        return ((Math.PI * Math.pow(circleRadius, 2)) * (double)circleAngle / 360);
    }
}