package CourseWork;

public class Palindrome {
    public static void main(String[] args) {
        String string1 = "$#@$$Аргентина манит негра.$#@#$@#$@#$";
        String string2 = "Я не палиндром.";
        String string3 = "         ";
        String string4 = " #12321@ ";
        String string5 = " №№@@#@@№№  ";

        System.out.printf("Строка: \"%s\" палиндром? - %b%n", string1, isPalindrome(string1));
        System.out.printf("Строка: \"%s\" палиндром? - %b%n", string2, isPalindrome(string2));
        System.out.printf("Строка: \"%s\" палиндром? - %b%n", string3, isPalindrome(string3));
        System.out.printf("Строка: \"%s\" палиндром? - %b%n", string4, isPalindrome(string4));
        System.out.printf("Строка: \"%s\" палиндром? - %b", string5, isPalindrome(string5));
    }

    private static boolean isPalindrome(String string) {
        if (isLetterPalindrome(string)) {
            return true;
        }
        if (isDigitPalindrome(string)) {
            return true;
        }
        if (isWhitespacePalindrome(string)) {
            return true;
        }
        return isSymbolPalindrome(string);
    }

    private static boolean isLetterPalindrome(String string) {
        string = string.toLowerCase();

        boolean isPalindrome = false;
        int j = string.length() - 1;
        for (int i = 0; i <= j; i++) {
            if (!Character.isLetter(string.charAt(i))) {
                continue;
            }
            while (j > i) {
                if (!Character.isLetter(string.charAt(j))) {
                    --j;
                } else if (Character.isLetter(string.charAt(i)) && Character.isLetter(string.charAt(j)) && string.charAt(i) == string.charAt(j)) {
                    isPalindrome = true;
                    --j;
                    break;
                } else {
                    isPalindrome = false;
                    break;
                }
            }
        }
        return isPalindrome;
    }

    private static boolean isDigitPalindrome(String string) {
        boolean isPalindrome = false;
        int j = string.length() - 1;
        for (int i = 0; i <= j; i++) {
            if (!Character.isDigit(string.charAt(i))) {
                continue;
            }
            while (j > i) {
                if (!Character.isDigit(string.charAt(j))) {
                    --j;
                } else if (Character.isDigit(string.charAt(i)) && Character.isDigit(string.charAt(j)) && string.charAt(i) == string.charAt(j)) {
                    isPalindrome = true;
                    --j;
                    break;
                } else {
                    isPalindrome = false;
                    break;
                }
            }
        }
        return isPalindrome;
    }

    private static boolean isWhitespacePalindrome(String string) {
        boolean isPalindrome = false;
        for (int i = 0, j = string.length() - 1; i <= j; i++, j--) {
            if (!Character.isWhitespace(string.charAt(i)) || !Character.isWhitespace(string.charAt(j))) {
                isPalindrome = false;
                break;
            } else {
                isPalindrome = true;
            }
        }
        return isPalindrome;
    }

    private static boolean isSymbolPalindrome(String string) {
        boolean isPalindrome = false;
        int j = string.length() - 1;
        for (int i = 0; i <= j; i++) {
            if (Character.isWhitespace(string.charAt(i))) {
                continue;
            }
            if (Character.isLetter(string.charAt(i)) || Character.isDigit(string.charAt(i))) {
                return false;
            }
            while (j >= i) {
                if (Character.isWhitespace(string.charAt(j))) {
                    --j;
                    continue;
                }
                if (Character.isLetter(string.charAt(j)) || Character.isDigit(string.charAt(j))) {
                    return false;
                } else if (string.charAt(i) == string.charAt(j)) {
                    isPalindrome = true;
                    --j;
                    break;
                }
            }
        }
        return isPalindrome;
    }
}