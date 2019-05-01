package lesson5.ClassWork;

public class TaskFor {
    public static void main(String[] args) {
        int separator = 30;

        System.out.println("0 -> 100");
        for (int i = 0, j = 0; i <= 100; i++, j++) {
            System.out.print(i + " ");

            if (j == separator) {
                System.out.println();
                j = 0;
            }
        }

        System.out.println();

        System.out.println("7 -> 121");
        for (int i = 7, j = 0; i <= 121; i++, j++) {
            System.out.print(i + " ");

            if (j == separator) {
                System.out.println();
                j = 0;
            }
        }

        System.out.println();

        System.out.println("100 -> 30");
        for (int i = 100, j = 0; i >= 30; i--, j++) {
            System.out.print(i + " ");

            if (j == separator) {
                System.out.println();
                j = 0;
            }
        }
    }
}
