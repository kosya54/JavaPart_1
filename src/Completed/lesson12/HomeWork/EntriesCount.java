package Completed.lesson12.HomeWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EntriesCount {
    public static void main(String[] args) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new FileInputStream("input.txt"))) {
            if (!scanner.hasNextLine()) {
                System.out.println("Пустой файл.");
            } else {
                String searchString = "Строка поиска";

                int entriesCount = 0;
                while (scanner.hasNextLine()) {
                    entriesCount += getEntries(scanner.nextLine(), searchString);
                }
                System.out.printf("Число вхождений строки %s равно: %d.", searchString, entriesCount);
            }
        }
    }

    private static int getEntries(String string, String searchString) {
        string = string.toLowerCase();
        searchString = searchString.toLowerCase();

        int count = 0;
        int index = 0;
        while (index != -1) {
            index = string.indexOf(searchString, index);
            if (index != -1) {
                index += searchString.length();
                ++count;
            }
        }
        return count;
    }
}