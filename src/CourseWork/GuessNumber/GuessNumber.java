package CourseWork.GuessNumber;

import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = 1;
        int end = 100;
        int diff = end - start;

        Random random = new Random();
        int randomNumber = random.nextInt(diff + 1);

        int count = 0;
        while (true) {
            System.out.println("Угадайте число от 1 до 100:");
            int enteredNumber = scanner.nextInt();

            ++count;
            if (enteredNumber == randomNumber) {
                System.out.printf("Верно! Вы угадали число: %d.%nВы угадали с %d раза.", enteredNumber, count);
                break;
            } else if (enteredNumber > randomNumber) {
                System.out.println("Введенное число больше загаданного.");
            } else {
                System.out.println("Введенное число меньше загаданного.");
            }
        }
    }
}