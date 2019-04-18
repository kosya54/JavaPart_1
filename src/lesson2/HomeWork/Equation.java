package lesson2.HomeWork;

public class Equation {
    public static void main(String[] args) {
        calculateEquation();
    }

    private static void calculateEquation() {
        double x = 3 - (56-12) / 44 * (4/2);
        System.out.println("X = " + x);

        double y = (2 * x) / (33 - x);
        System.out.println("Y = " + y);

        double z = -x / (2 * y);
        System.out.println("Z = " + z);
    }
}