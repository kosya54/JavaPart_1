package lesson9.ClassWork;

public class Task1 {
    public static void main(String[] args) {
        int[] array = new int[100];

        for (int i = 0, j = 1; i < array.length; i++, j++) {
            array[i] = j;
        }

        for (int value : array) {
            System.out.println(value);
        }
    }
}
