package com.tws.refactoring.extract_variable;

public class PriceCalculator {
    private static final int QUANTITY_BOUND = 500;
    private static final double FIVE_DISCOUNT = 0.05;
    private static final double MIN_COST = 100.0;
    private static final double ONE_DISCOUNT = 0.1;

    double getPrice(int quantity, int itemPrice) {
        int totalPrice = quantity * itemPrice;
        double discount = Math.max(0, quantity - QUANTITY_BOUND) * itemPrice * FIVE_DISCOUNT;
        double shippingCost = Math.min(quantity * itemPrice * ONE_DISCOUNT, MIN_COST);
        return totalPrice - discount + shippingCost;
    }
}
