package application;

import domain.Product;
import domain.promotion.Promotion;

public class DiscountFactory {
    public static Product createDiscount (String description, Double price){
        return new Promotion(description, price);
    }
}
