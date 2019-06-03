package lesson12.HomeWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EntriesNumber {
    public static void main(String[] args) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new FileInputStream("input.txt"))) {
            if (scanner.hasNextLine()) {
                StringBuilder stringBuilder = new StringBuilder();

                while (scanner.hasNextLine()) {
                    stringBuilder.append(scanner.nextLine()).append(" ");
                }
                String string = stringBuilder.toString();

                String searchString = "но Пруд уже Застыл; сосед мой Поспешает";
                System.out.printf("Количество вхождений строки \"%s\" равно: %d", searchString, entriesNumber(string, searchString));
            } else {
                System.out.println("Пустой файл.");
            }
        }
    }

    private static int entriesNumber(String string, String searchString) {
        string = string.toLowerCase();
        searchString = searchString.toLowerCase();

        int count = 0;
        int index = 0;
        while (index != -1) {
            index = string.indexOf(searchString, index);
            if (index != -1) {
                ++index;
                ++count;
            }
        }
        return count;
    }
}