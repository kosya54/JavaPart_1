package lesson9.HomeWork;

import java.util.Arrays;

public class ArraySpread {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(array));

        invertArray(array);

        System.out.println("Инвертированный массив:");
        System.out.println(Arrays.toString(array));
    }

    private static void invertArray(int[] array) {
        for (int i = 0, j = array.length - 1; i < array.length / 2; i++, j--) {
            int element = array[j];
            array[j] = array[i];
            array[i] = element;
        }
    }
}
