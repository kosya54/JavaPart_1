package CourseWork;

public class MaxSubstring {
    public static void main(String[] args) {
        //TODO: Не считает при одном симоле, поправить
        String string = "7";
        System.out.printf("В строке \"%s\"%n длина максимальной подстроки состоящей из одного символа равна: %d", string, findMaxSubstringLength(string));
    }

    private static int findMaxSubstringLength(String string) {
        string = string.toLowerCase();

        int maxSubstringLength = 0;
        int substringLengthCount = 1;
        for (int i = 1; i < string.length(); i++) {
            if (string.charAt(i - 1) == string.charAt(i)) {
                ++substringLengthCount;
            } else {
                substringLengthCount = 1;
            }
            
            if (maxSubstringLength < substringLengthCount) {
                maxSubstringLength = substringLengthCount;
            }
        }
        return maxSubstringLength;
    }
}
