package lesson12.HomeWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EntriesNumber {
    public static void main(String[] args) throws FileNotFoundException {
        String searchString = "Вася";

        try (Scanner scanner = new Scanner(new FileInputStream("input.txt"))) {
            if (scanner.hasNextLine()) {
//                int count = 0;
                while (scanner.hasNextLine()) {
                    String string = scanner.nextLine();
                    for (int i = 0; i < string.length(); i += searchString.length() + 1) {
                        System.out.println(i + " " + string.indexOf(searchString, i));
                    }
                    System.out.println("------------------------------");
                }
            } else {
                System.out.println("Пустой файл.");
            }
        }
    }

/*    private static int entriesNumber(String searchString, String lineFromFile) {
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine().indexOf(searchString, 0));
            break;
        }
    } */
}