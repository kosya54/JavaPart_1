package Completed.lesson12.HomeWork;

import java.util.Arrays;

public class SplitString {
    public static void main(String[] args) {
        String numbers = "1, 2, 3, 4, 5";
        String[] array = numbers.split(", ");

        int sum = 0;
        for (String value : array) {
            sum += Integer.parseInt(value);
        }
        System.out.printf("Сумма элементов массива %s равна: %d", Arrays.toString(array), sum);
    }
}