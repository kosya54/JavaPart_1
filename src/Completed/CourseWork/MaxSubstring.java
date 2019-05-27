package Completed.CourseWork;

public class MaxSubstring {
    public static void main(String[] args) {
        String string = "dsfsfs sdfdfffffffs sdfsfdds sfa";
        System.out.printf("В строке \"%s\"%n длина максимальной подстроки состоящей из одного символа равна: %d", string, findMaxSubstringLength(string));
    }

    private static int findMaxSubstringLength(String string) {
        string = string.toLowerCase();

        int maxSubstringLength = 0;
        if (string.length() == 1) {
            maxSubstringLength = 1;
        } else {
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
        }
        return maxSubstringLength;
    }
}