package CourseWork.Age;

import java.util.Scanner;

class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Введите Ваш возраст от 1 до 112: %n");
        int age = scanner.nextInt();

        if (age < 1) {
            System.out.println("Вы слишком малы.");
        } else if (age > 112) {
            System.out.println("Вы слишком стары.");
        } else {
            showAgeWithEnding(age);
        }
    }

    private static void showAgeWithEnding(int age) {
        if ((age >= 11 && age <= 14) || (age >= 111 && age <= 112)) {
            System.out.printf("Вам %d лет.", age);
        } else if ((age % 10) >= 2 && (age % 10) <= 4) {
            System.out.printf("Вам %d года.", age);
        } else if ((age % 10) == 1) {
            System.out.printf("Вам %d год.", age);
        } else {
            System.out.printf("Вам %d лет.", age);
        }
    }
}