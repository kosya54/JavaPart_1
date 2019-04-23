package CourseWork.Age;

import java.util.Scanner;

class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Введите Ваш возраст от 1 до 112:%n");
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
        String ending;
        int enteredAge = age;

        if (age > 100) {
            age %= 100;
        }

        if (age >= 11 && age <= 14) {
            ending = "лет";
        } else if ((age % 10) == 1) {
            ending = "год";
        } else if ((age % 10) >= 2 && (age % 10) <= 4) {
            ending = "года";
        } else {
            ending = "лет";
        }

        System.out.printf("Вам %d %s", enteredAge, ending);
    }
}