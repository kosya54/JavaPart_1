package CourseWork;

public class Palindrome {
    public static void main(String[] args) {
        String string = "Аргентина манит негра";
        String string2 = "Море могуче. В тон ему, шумен, отвечу Гомером";
        String string3 = "Ты, милок, иди яром: у дороги мина, за дорогой огород, а за ним и город у моря; иди, коли мыт";
        String string4 = "«Я – юзер-гуру», - грезю я";
        String string5 = "3103013103013";

        System.out.printf("\"%s\" - палиндром? %b%n", string, isStringPalindrome(string));
        System.out.printf("\"%s\" - палиндром? %b%n", string2, isStringPalindrome(string2));
        System.out.printf("\"%s\" - палиндром? %b%n", string3, isStringPalindrome(string3));
        System.out.printf("\"%s\" - палиндром? %b%n", string4, isStringPalindrome(string4));
        System.out.printf("\"%s\" - палиндром? %b", string5, isStringPalindrome(string5));
    }

    private static boolean isStringPalindrome(String string) {
        string = string.toLowerCase();

        for (int i = 0, j = string.length() - 1; i < string.length(); i++, j--) {
            while (!Character.isLetter(string.charAt(i)) && !Character.isDigit(string.charAt(i))) {
                ++i;
            }

            while (!Character.isLetter(string.charAt(j)) && !Character.isDigit(string.charAt(i))) {
                --j;
            }

            if (string.charAt(i) != string.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}