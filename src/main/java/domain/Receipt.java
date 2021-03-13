package domain;

import application.DiscountFactory;

import java.util.List;

public class Receipt {
    private int clientDNI;
    private List<Product> productList;
    private static final int FREE_BEVERAGE_COUNT = 5;

    public Receipt(List<Product> productList) {
        this.productList = productList;
    }

    public Double getTotal() {
        applyExtraDiscount();
        applyFreeBeverageBonus();
        productList.forEach(System.out::println);
        System.out.println("\n");
        return productList.stream()
                .mapToDouble(Product::getPrice)
                .sum();
    }


    private void applyExtraDiscount() {
        if (containProductType(ProductType.SNACK)
                && containProductType(ProductType.BEVERAGE)
                && containProductType(ProductType.EXTRA)) {
            Product productWithDiscount = this.productList.stream()
                    .filter(item -> item.type == ProductType.EXTRA)
                    .findAny()
                    .get();
            productList.add(DiscountFactory.createDiscount("Free Extra for combo", productWithDiscount.price));
        }
    }

    private boolean containProductType(ProductType type) {
        return this.productList.stream()
                .filter(item -> item.type == type)
                .findAny()
                .isPresent();
    }

    private void applyFreeBeverageBonus() {
        long beverageCount = this.productList.stream()
                .filter(product -> product.type == ProductType.BEVERAGE)
                .count();
        if (beverageCount >= FREE_BEVERAGE_COUNT) {
            Product freeProduct = this.productList.stream()
                    .filter(item -> item.type == ProductType.BEVERAGE)
                    .findFirst()
                    .get();
            productList.add(DiscountFactory.createDiscount("Free 5 beverage discount", freeProduct.price));
        }
    }
}
