package com.kan.mycodes;

public class PaymentSystem {

    public static void main(String[] args) {
        String[] items = {"Pepsi", "Marinda", "Lactasoy", "RoyalD"};
        int change = Payment("RoyalD", 1000, items);
        System.out.println(change);
    }

    public static int Payment(String item, int userPayAmount, String[] items) {

        String itemName = getItemName(items, item);
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals(itemName)) {
                int price = getItemPrice(items[i]);
                if (price == userPayAmount) {
                    return 0;
                }

                if (price > userPayAmount) {
                    System.out.println("Your amount is insufficient!");
                    return -1;
                }

                if (price < userPayAmount) {
                    return userPayAmount - price;
                }

            }
        }

        return -1;
    }

    public static String getItemName(String[] items, String item) {

        for (int i = 0; i < items.length; i++) {
            if (items[i].equals(item)) {
                return item;
            }
        }
        return "Item is't available yet!";
    }


    public static int getItemPrice(String item) {

        String[] items = {"Pepsi-600", "Marinda-600", "RoyalD-800", "Lactasoy-1000"};

        for (int i = 0; i < items.length; i++) {
            String[] itemAndPrice = items[i].split("-");
            if (itemAndPrice[0].equals(item)) {
                return Integer.parseInt(itemAndPrice[1]);
            }
        }
        return -1;
    }


}
