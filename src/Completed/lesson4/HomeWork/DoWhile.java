package Completed.lesson4.HomeWork;

public class DoWhile {
    public static void main(String[] args) {
        int i = 99;
        int endPosition = 186;
        int sum = 0;
        int count = 0;
        int evenNumbersSum = 0;
        int evenNumbersCount = 0;

        System.out.printf("Задан диапазон чисел %d ... %d%n", i, endPosition);

        do {
            if (i % 2 == 0) {
                evenNumbersSum += i;
                evenNumbersCount++;
            }
            sum += i;
            count++;
            i++;
        } while (i <= endPosition);

        System.out.printf("Среднее арифметическое равно: %.2f%n", (double) sum / count);
        System.out.printf("Среднее арифметическое четных чисел равно: %.2f", (double) evenNumbersSum / evenNumbersCount);
    }
}
