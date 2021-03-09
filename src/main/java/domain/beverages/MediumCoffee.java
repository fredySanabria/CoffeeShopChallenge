package domain.beverages;


import domain.Product;
import domain.ProductType;

public class MediumCoffee extends Product {
    public MediumCoffee() {
        this.type = ProductType.BEVERAGE;
        this.name = "Medium Coffee";
        this.price = 3.0f;
    }
}
