package lesson12.ClassWork;

public class StrBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();

        int end = 100;
        String separator = ", ";
        for (int i = 1; i <= end; i++) {
                stringBuilder.append(i).append(separator);
        }

        stringBuilder.delete(stringBuilder.length() - separator.length(), stringBuilder.length());
        System.out.println(stringBuilder.toString());
    }
}
