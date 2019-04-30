package lesson4.ClassWork;

public class While {
    public static void main(String[] args) {
        int sum = 0;
        int i = 3;
        int counter = 1;

        while (i <= 21) {
            if (i % 2 == 0) {
                sum += i;
                counter++;
            }
            i++;
        }

        System.out.printf("Сумма четных чисел равна: %d, колличество четных чисел равно: %d", sum, counter);
    }
}
