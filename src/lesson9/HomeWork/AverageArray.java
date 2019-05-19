package lesson9.HomeWork;

public class AverageArray {
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};

        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        System.out.printf("Среднее арифметическое элементов массива равно: %.2f", (double) sum / array.length);
    }
}
