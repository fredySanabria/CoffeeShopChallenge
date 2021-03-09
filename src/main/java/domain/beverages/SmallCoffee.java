package domain.beverages;


import domain.Product;
import domain.ProductType;

public class SmallCoffee extends Product {
    public SmallCoffee() {
        this.type = ProductType.BEVERAGE;
        this.name = "Small Coffee";
        this.price = 2.5f;
    }
}
