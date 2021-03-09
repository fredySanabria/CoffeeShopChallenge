package application;

import domain.Product;

public class SnackService {

    public static Product createSnackOrder(String snackName) {
        return  SnackFactory.createSnack(snackName);
    }
}
