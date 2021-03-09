package application;

import domain.Product;

public class BeverageService {

    public static Product createBeverageOrder(String beverageType) {
        return  BeverageFactory.createBeverage(beverageType);
    }

    public static Product createExtraOrder(Product beverage, String extraType) {
        if(!extraType.equals("none")) {
            return ExtrasFactory.addExtra(extraType, beverage);
        }
        return beverage;
    }
}
