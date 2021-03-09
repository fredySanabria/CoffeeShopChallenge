package domain;

public abstract class Product {
    public ProductType type;
    public double price;
    public String name;

    public double getPrice() {
        return price;
    };

    @Override
    public String toString() {
        return "item : " +
                "'" + name + '\'' +
                "  price = " + price;
    }
}
