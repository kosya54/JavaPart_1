package lesson6.HomeWork;

import java.util.Scanner;

public class CostOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество товара первой категории:");
        int orderCount1 = scanner.nextInt();

        System.out.println("Введите стоимость за единицу товара:");
        int orderCost1 = scanner.nextInt();

        System.out.println("Введите количество товара второй категории:");
        int orderCount2 = scanner.nextInt();

        System.out.println("Введите стоимость за единицу товара:");
        int orderCost2 = scanner.nextInt();

        System.out.printf("Стоимость товара составляет: %.2f", getCost(orderCount1, orderCount2, orderCost1, orderCost2));
    }

    private static double getCost(int orderCount1, int orderCount2, int orderCost1, int orderCost2) {
        final int discount1 = 5;
        final int discount2 = 10;
        final int quantityDiscount = 10;
        final int priceDiscount = 1000;

        int totalCost = (orderCount1 * orderCost1) + (orderCount2 * orderCost2);
        int totalOrder = orderCount1 + orderCount2;

        int totalPrice;
        if (totalCost >= priceDiscount && totalOrder >= quantityDiscount) {
            totalPrice = totalCost - ((totalCost / 100) * discount2);
        } else if (totalOrder >= quantityDiscount || totalCost >= priceDiscount) {
            totalPrice = totalCost - ((totalCost / 100) * discount1);
        } else {
            totalPrice = totalCost;
        }
        return totalPrice;
    }
}
