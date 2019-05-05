package CourseWork.Fibonacci;

public class Fibonacci {
    public static void main(String[] args) {
        int f1 = 0;
        int f2 = 1;
        int fn = 0;
        //TODO: Сделать Scanner
        int n = 9;
        int i = 0;

        while (i <= n) {
            fn = n - 1 + n + 2;
            System.out.println(fn);
            i++;
        }
    }
}
