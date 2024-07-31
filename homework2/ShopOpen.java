package com.telran.org.homework2;

public class ShopOpen {
    public static void main(String[] args) {
        // Входные данные
        boolean isEdekaOpen = true;  // Например, магазин Edeka открыт
        boolean isReweOpen = false;  // Например, магазин Rewe закрыт

        boolean canBuy = canBuyFood(isEdekaOpen, isReweOpen);
        System.out.println("Я могу купить еду, это " + canBuy);
    }

    public static boolean canBuyFood(boolean isEdekaOpen, boolean isReweOpen) {
        return isEdekaOpen || isReweOpen;  // Можно купить, если хотя бы один магазин открыт
    }

}
