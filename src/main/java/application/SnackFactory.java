package application;

import domain.Product;
import domain.extras.ProductExtraMilk;
import domain.extras.ProductFoamedMilk;
import domain.extras.ProductSpecialRoast;
import domain.snacks.BaconRoll;
import exception.ProductNotFoundException;

public class SnackFactory {
    public static Product createSnack(String snackName) {
        Product result;
        switch (snackName){
            case "baconRoll":
                result = new BaconRoll();
                break;
            default :
                throw new ProductNotFoundException("Snack Product name does not exist ");
        }
        return result;
    }
}
