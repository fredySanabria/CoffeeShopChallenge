package domain.beverages;

import domain.Product;
import domain.ProductType;

public class OrangeJuice extends Product {
    public OrangeJuice() {
        this.type = ProductType.BEVERAGE;
        this.name = "Orange Juice";
        this.price = 3.95d;
    }
}
