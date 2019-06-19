package Completed.CourseWork;

public class Palindrome {
    public static void main(String[] args) {
        String string1 = "$#@$$Аргентина манит негра.$#@#$@#$@#$";
        String string2 = "Я не палиндром.";
        String string3 = "         ";
        String string4 = " #12321@ ";
        String string5 = " №№@@tr#@@№№  ";

        System.out.printf("Строка: \"%s\" палиндром? - %b%n", string1, isPalindrome(string1));
        System.out.printf("Строка: \"%s\" палиндром? - %b%n", string2, isPalindrome(string2));
        System.out.printf("Строка: \"%s\" палиндром? - %b%n", string3, isPalindrome(string3));
        System.out.printf("Строка: \"%s\" палиндром? - %b%n", string4, isPalindrome(string4));
        System.out.printf("Строка: \"%s\" палиндром? - %b", string5, isPalindrome(string5));
    }

    private static boolean isPalindrome(String string) {
        string = string.toLowerCase();

        int j = string.length() - 1;
        for (int i = 0; i <= j; i++) {
            if (!Character.isLetter(string.charAt(i))) {
                continue;
            }
            while (j > i) {
                if (!Character.isLetter(string.charAt(j))) {
                    --j;
                } else if (string.charAt(i) == string.charAt(j)) {
                    --j;
                    break;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
