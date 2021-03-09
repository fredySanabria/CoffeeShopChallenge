package domain.snacks;

import domain.Product;
import domain.ProductType;

public class BaconRoll extends Product {
    public BaconRoll() {
        this.type = ProductType.SNACK;
        this.name = "Bacon Roll";
        this.price = 4.5d;
    }
}
