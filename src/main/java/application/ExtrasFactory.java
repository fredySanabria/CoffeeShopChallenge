package application;

import domain.*;
import domain.extras.ProductExtraMilk;
import domain.extras.ProductFoamedMilk;
import domain.extras.ProductSpecialRoast;
import exception.ProductNotFoundException;

public class ExtrasFactory {
    public static Product addExtra(String extraType, Product beverage) {
        Product result;
        switch (extraType){
            case "extraMilk":
                result = new ProductExtraMilk(beverage);
                break;
            case "foamedMilk":
                result = new ProductFoamedMilk(beverage);
                break;
            case "roastCoffee":
                result = new ProductSpecialRoast(beverage);
                break;
            default :
                throw new ProductNotFoundException("Extra Product name does not exist ");
        }
        return result;
    }
}
