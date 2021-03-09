package domain.extras;

import domain.Product;
import domain.ProductType;

public class ProductExtraMilk extends Product {
    //Product Aggregation
    public ProductExtraMilk(Product beverage) {
        super();
        this.type = ProductType.EXTRA;
        this.price = 0.3d;
        this.name = "Extra Milk for:" + beverage.name;
    }
}
