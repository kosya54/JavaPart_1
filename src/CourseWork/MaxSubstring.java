package CourseWork;

public class MaxSubstring {
    public static void main(String[] args) {
        String string = "aaaaaaabv dfveeeees dfssdg dfgZZzzzZZzzZ fghdfghdf";
        System.out.printf("В строке \"%s\"%n длина максимальной подстроки состоящей из одного символа равна: %d", string, findMaxSubstringLength(string));
    }
//TODO: Сделать игнорирование пробелов и т.д.
    private static int findMaxSubstringLength(String string) {
        int maxSubstringLength = 0;
        int substringLengthCount = 1;
        for (int i = 1; i < string.length(); i++) {
            if (string.toLowerCase().charAt(i - 1) == string.toLowerCase().charAt(i)) {
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
