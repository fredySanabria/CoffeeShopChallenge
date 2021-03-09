package application;

import domain.beverages.LargeCoffee;
import domain.beverages.MediumCoffee;
import domain.Product;
import domain.beverages.OrangeJuice;
import domain.beverages.SmallCoffee;
import exception.ProductNotFoundException;

public class BeverageFactory {
    public static Product createBeverage(String productDescription){
        Product result;
        switch (productDescription){
            case "largeCoffee":
                result = new LargeCoffee();
                break;
            case "mediumCoffee":
                result = new MediumCoffee();
                break;
            case "smallCoffee":
                result = new SmallCoffee();
                break;
            case "orangeJuice":
                result = new OrangeJuice();
                break;
            default :
                throw new ProductNotFoundException("Product name does not exist ");
        }
        return result;
    }
}
