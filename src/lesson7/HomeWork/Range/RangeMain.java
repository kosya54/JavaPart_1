package lesson7.HomeWork.Range;

public class RangeMain {
    public static void main(String[] args) {
        Range range = new Range(-100, 20);

        System.out.printf("%.2f - %b%n", 20.5, range.isInside(20.5));
        System.out.printf("%.2f", range.getLength());
    }
}
