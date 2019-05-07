package lesson6;

import java.util.Scanner;
import java.util.ArrayList;

public class HardVersionDontWork_CostOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] vegetables = new String[] {"Капуста", "Картофель", "Лук"};
        int[] vegetablesCost = new int[] {220, 150, 79};
        int[] vegetablesId = new int[] {1, 2, 3};

        String[] fruits = new String[] {"Яблоко", "Груша", "Апельсин"};
        int[] fruitsCost = new int[] {230, 350, 500};
        int[] fruitsId = new int[] {4, 5, 6};

        System.out.println("Овощи:");
        printProductPrice(vegetables, vegetablesCost, vegetablesId);

        System.out.println("\r\nФрукты:");
        printProductPrice(fruits, fruitsCost, fruitsId);

        ArrayList<Integer> productName = new ArrayList<>();
        ArrayList<Integer> productWeight = new ArrayList<>();

        System.out.println("Для выхода введите любое слово или букву.");
        while (true) {
            System.out.println("Выбирете товар:");

            if (scanner.hasNextInt()) {
                int productId = scanner.nextInt();

                if (productId < 1 || productId > 6) {
                    System.out.println("Такого товара нет.");
                } else {
                    productName.add(productId);

                    System.out.println("Укажите количество в кг:");

                    if (scanner.hasNextInt()) {
                        int currentProductWeight = scanner.nextInt();

                        if (currentProductWeight <= 0) {

                        } else {
                            productWeight.add(currentProductWeight);
                        }
                    }
                }
            } else {
                break;
            }
        }

        for (int product : productName) {
            System.out.println(product);
        }

        for (int weight : productWeight) {
            System.out.println(weight);
        }

        System.out.println("Вышли из цикла");
    }

    private static void printProductPrice(String[] product, int[] cost, int[] id) {
        int i = 0;
        while (i < product.length) {
            System.out.printf("%s, цена за кг %d рублей.%nНомер на весах %d.%n%n", product[i], cost[i], id[i]);
            ++i;
        }
    }
}