package lesson6;

import java.util.Scanner;

public class CostOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int discount1 = 5;
        final int discount2 = 10;
        final int quantityDiscount = 10;
        final int priceDiscount = 1000;

        System.out.println("Введите количество товара:");
        int orderCount = scanner.nextInt();

        System.out.println("Введите стоимость товара товара:");
        int orderCost = scanner.nextInt();

        if (orderCount >= quantityDiscount && orderCost >= priceDiscount) {
            System.out.printf("Скидка составляет: %d%%, стоимость товара с учетом скидки: %.2f рублей", discount2, getCost(discount2, orderCost));
        } else if (orderCount >= quantityDiscount || orderCost >= priceDiscount) {
            System.out.printf("Скидка составляет: %d%%, стоимость товара с учетом скидки: %.2f рублей", discount1, getCost(discount1, orderCost));
        } else {
            System.out.printf("Стоимость товара: %d", orderCost);
        }
    }

    private static double getCost(int discount, int orderCost) {
        return orderCost - ((orderCost / 100) * discount);
    }
}
