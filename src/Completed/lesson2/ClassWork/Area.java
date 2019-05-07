package Completed.lesson2.ClassWork;

public class Area {
    public static void main(String[] args) {
        printAreaCircle();
    }

    private static void printAreaCircle() {
//        double radius = Math.toRadians(50);
        int radius = 50;
        System.out.printf("Вычисляет площадь  круга по формуле S = PI*R^2%n");
        System.out.printf("Площадь круга = %.3f при радиусе равном: %d%n", (Math.PI * Math.pow(radius, 2)), radius);
    }
}