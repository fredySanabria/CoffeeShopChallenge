package domain.beverages;

import domain.Product;
import domain.ProductType;

public class LargeCoffee extends Product {
    public LargeCoffee() {
        this.type = ProductType.BEVERAGE;
        this.name = "Large Coffee";
        this.price = 3.5f;
    }
}
