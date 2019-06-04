package CourseWork;

public class Palindrome {
    public static void main(String[] args) {
        String string1 = "$#@$$Аргентина манит негра.$#@#$@#$@#$";
        String string2 = "Я не палиндром.";
        String string3 = "     ";
        String string4 = "«Я – юзер-гуру», - грезю я.";
        String string5 = " абва";

        System.out.println("Функция с двумя вложенными циклами While:");
        System.out.printf("\"%s\" - палиндром? %b%n", string1, isPalindrome1(string1));
        System.out.printf("\"%s\" - палиндром? %b%n", string2, isPalindrome1(string2));
        System.out.printf("\"%s\" - палиндром? %b%n", string3, isPalindrome1(string3));
        System.out.printf("\"%s\" - палиндром? %b%n", string4, isPalindrome1(string4));
        System.out.printf("\"%s\" - палиндром? %b%n", string5, isPalindrome1(string5));
        System.out.println();

        System.out.println("Функция с одним вложенным циклом While:");
        System.out.printf("\"%s\" - палиндром? %b%n", string1, isPalindrome2(string1));
        System.out.printf("\"%s\" - палиндром? %b%n", string2, isPalindrome2(string2));
        System.out.printf("\"%s\" - палиндром? %b%n", string3, isPalindrome2(string3));
        System.out.printf("\"%s\" - палиндром? %b%n", string4, isPalindrome2(string4));
        System.out.printf("\"%s\" - палиндром? %b%n", string5, isPalindrome2(string5));
    }

    private static boolean isPalindrome1(String string) {
        string = string.toLowerCase();

        for (int i = 0, j = string.length() - 1; i < j; i++, j--) {
            while (!Character.isLetter(string.charAt(i))) {
                if (i >= string.length() - 1) {
                    break;
                }
                ++i;
            }
            while (!Character.isLetter(string.charAt(j))) {
                if (j <= 0) {
                    break;
                }
                --j;
            }

            if (string.charAt(i) != string.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isPalindrome2(String string) {
        string = string.toLowerCase();

        int j = string.length() - 1;
        for (int i = 0; i < string.length(); i++) {
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