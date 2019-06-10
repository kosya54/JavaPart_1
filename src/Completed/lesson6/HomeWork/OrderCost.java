package Completed.lesson6.HomeWork;

import java.util.Scanner;

public class OrderCost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество товара первой категории:");
        int goodsCount1 = scanner.nextInt();

        System.out.println("Введите стоимость за единицу товара:");
        double goodsPrice1 = scanner.nextInt();

        System.out.println("Введите количество товара второй категории:");
        int goodsCount2 = scanner.nextInt();

        System.out.println("Введите стоимость за единицу товара:");
        double goodsPrice2 = scanner.nextInt();

        System.out.printf("Стоимость товара составляет: %.2f", getCost(goodsCount1, goodsCount2, goodsPrice1, goodsPrice2));
    }

    private static double getCost(int goodsCount1, int goodsCount2, double goodsPrice1, double goodsPrice2) {
        final double DISCOUNT_1 = 5;
        final double DISCOUNT_2 = 10;
        final int QUANTITY_DISCOUNT = 10;
        final int PRICE_DISCOUNT = 1000;
        final int PERCENT = 100;

        double totalGoodsPrice = (goodsCount1 * goodsPrice1) + (goodsCount2 * goodsPrice2);
        int totalGoodsOrder = goodsCount1 + goodsCount2;

        double orderPrice;
        if (totalGoodsPrice >= PRICE_DISCOUNT && totalGoodsOrder >= QUANTITY_DISCOUNT) {
            orderPrice = totalGoodsPrice - (totalGoodsPrice * (DISCOUNT_2 / PERCENT));
        } else if (totalGoodsOrder >= QUANTITY_DISCOUNT || totalGoodsPrice >= PRICE_DISCOUNT) {
            orderPrice = totalGoodsPrice - (totalGoodsPrice * (DISCOUNT_1 / PERCENT));
        } else {
            orderPrice = totalGoodsPrice;
        }
        return orderPrice;
    }
}