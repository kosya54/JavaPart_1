package CourseWork;

public class Palindrome {
    public static void main(String[] args) {
        String string = "$#@$$Аргентина манит негра.$#@#$@#$@#$";
        String string2 = "Я не палиндром.";
        String string3 = "Ты, милок, иди яром: у дороги мина, за дорогой огород, а за ним и город у моря; иди, коли мыт.";
        String string4 = "«Я – юзер-гуру», - грезю я.";
        String string5 = " абва";

        System.out.printf("\"%s\" - палиндром? %b%n", string, isPalindrome(string));
        System.out.printf("\"%s\" - палиндром? %b%n", string2, isPalindrome(string2));
        System.out.printf("\"%s\" - палиндром? %b%n", string3, isPalindrome(string3));
        System.out.printf("\"%s\" - палиндром? %b%n", string4, isPalindrome(string4));
        System.out.printf("\"%s\" - палиндром? %b", string5, isPalindrome(string5));
    }

    private static boolean isPalindrome(String string) {
        string = string.toLowerCase();

        for (int i = 0, j = string.length() - 1; i < j; i++, j--) {
            while (!Character.isLetter(string.charAt(i))) {
                ++i;
            }
            while (!Character.isLetter(string.charAt(j))) {
                --j;
            }

            if (string.charAt(i) != string.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}