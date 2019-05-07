package lesson6;

import java.util.Scanner;

public class CostOrder {
    public static void main(String[] args) {
        int productCount = 0;
        int productCost = 0;

        System.out.printf("В заказе %d единиц товара");
    }

    private static int getDiscount(int productCount, int productCost) {
        if (productCount >= 10 || productCost >= 1000) {
            if (productCount >= 10 && productCost >= 1000) {
                return 10;
            }
            return 5;
        }
        return 0;
    }
}
