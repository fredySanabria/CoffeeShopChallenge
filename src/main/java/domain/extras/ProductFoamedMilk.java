package domain.extras;

import domain.Product;
import domain.ProductType;

public class ProductFoamedMilk extends Product {
    //Product Aggregation
    public ProductFoamedMilk(Product beverage) {
        super();
        this.type = ProductType.EXTRA;
        this.price = 0.5d;
        this.name = "Foamed Milk for: " + beverage.name;
    }
}
