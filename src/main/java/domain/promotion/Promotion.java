package domain.promotion;

import domain.Product;

public class Promotion extends Product {
    public Promotion(String description, Double price) {
        super();
        this.price = price * -1;
        this.name = description;
    }
}
