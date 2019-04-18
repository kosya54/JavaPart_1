package lesson2.HomeWork;

public class Circle {
    public static void main(String[] args) {
        int radius = 10;
        System.out.println("Радиус = " + radius);
        System.out.println("Площадь круга = " + getAreaCircle(radius));
        System.out.println("Длина окружности = " + getLengthCircle(radius));

        int area = 200;
        System.out.println(System.lineSeparator() + "Площадь круга = " + area);
        System.out.println("Радиус = " + getRadiusCircle(area));

        int angle = 60;
        System.out.println(System.lineSeparator() + "Радиус = " + radius + System.lineSeparator() + "Угол = " + angle);
        System.out.println("Площадь сектора = " + getSectorArea(radius, angle));
    }

    private static double getAreaCircle(int radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    private static double getLengthCircle(int radius) {
        return 2 * Math.PI * radius;
    }

    private static double getRadiusCircle(int area) {
        return Math.sqrt(area / Math.PI);
    }

    private static double getSectorArea(int radius, int angle) {
        return ((Math.PI * Math.pow(radius, 2)) * (double)angle / 360);
    }
}