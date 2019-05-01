package lesson5.ClassWork;

public class Task3 {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i == 5 || i % 3 == 0 || (i >= 60 && i <= 80)) {
                continue;
            }
            System.out.println(i);
        }
    }
}
