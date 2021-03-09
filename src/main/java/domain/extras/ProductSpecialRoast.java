package domain.extras;

import domain.Product;
import domain.ProductType;

public class ProductSpecialRoast extends Product {
    //Product Aggregation
    public ProductSpecialRoast(Product beverage) {
        super();
        this.type = ProductType.EXTRA;
        this.price = 0.9d;
        this.name = "Special Roast Coffee for" + beverage.name ;
    }
}
