package lesson2.ClassWork;

public class Area {
    public static void main(String[] args) {
        printAreaCircle();
    }

    private static void printAreaCircle() {
        int radius = 50;
        System.out.println("Вычисляет площадь  круга по формуле S = PI*R^2");
        System.out.println("Площадь круга = " + (Math.PI * Math.pow(radius, 2)) + " при радиусе равном: " + radius);
    }
}