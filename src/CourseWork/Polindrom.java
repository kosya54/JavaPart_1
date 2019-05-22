package CourseWork;

class Polindrom {
    public static void main(String[] args) {
        String string = "Аргентина манит негра";
        System.out.printf("%s - полиндром? %b", string, isStringPolindrom(string));
    }

    private static boolean isStringPolindrom(String string) {
        for (int i = 0; i < string.length(); i++) {
            if (string.toLowerCase().charAt(i) != string.toLowerCase().charAt(string.length() -i - 1)) {
                return false;
            }
        }
        return true;
    }
}
