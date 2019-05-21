public class MaxSubstring {
    public static void main(String[] args) {
        String string = "Baa Bddddddddf cfb fdyyyyyyygfgfn dfj ghj fgjf gfhj gj llllllllllllLlllLlllLLllllllllll ghjghfj gj fghjgjhgjg ghjhgjh ghjghhjgf gjh ghjgf gj gjhfg ";
        System.out.printf("В строке \"%s\"%nдлина максимальной подстроки состоящей из одного символа равна: %d", string, findMaxSubstringLength(string));
    }
    
    private static int findMaxSubstringLength(String string) {
        int maxSubstringLength = 0;
        for (int i = 0; i < string.length(); i++) {
            int substringLengthCount = 1;
            for (int j = i + 1; j < string.length(); j++) {
                if (string.toLowerCase().charAt(i) == string.toLowerCase().charAt(j)) {
                    ++substringLengthCount;
                } else {
                  break;
                }
            }
            if (maxSubstringLength < substringLengthCount) {
                maxSubstringLength = substringLengthCount;
            }
        }
        return maxSubstringLength;
    }
}
