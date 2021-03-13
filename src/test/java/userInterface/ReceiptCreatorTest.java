package userInterface;

import application.BeverageService;
import application.SnackService;
import domain.Product;
import domain.Receipt;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ReceiptCreatorTest {
    @Test
    public void createReceiptWithBigCoffeeSuccessfully() {
        Double expectedResult = 3.5d;
        Product bigCoffee = BeverageService.createBeverageOrder("largeCoffee");
        List<Product> productList = new ArrayList<>();
        productList.add(bigCoffee);
        Receipt actualReceipt = new Receipt(productList);

        Double total = actualReceipt.getTotal();

        Assert.assertNotNull(total);
        Assert.assertEquals(expectedResult, total);
    }

    @Test
    public void createReceiptWithManyCoffeeSizesSuccessfully() {
        Double expectedResult = 9.0d;
        Product bigCoffee = BeverageService.createBeverageOrder("largeCoffee");
        Product mediumCoffee = BeverageService.createBeverageOrder("mediumCoffee");
        Product smallCoffee = BeverageService.createBeverageOrder("smallCoffee");
        List<Product> productList = new ArrayList<>();
        productList.add(bigCoffee);
        productList.add(mediumCoffee);
        productList.add(smallCoffee);
        Receipt actualReceipt = new Receipt(productList);

        Double total = actualReceipt.getTotal();

        Assert.assertNotNull(total);
        Assert.assertEquals(expectedResult, total);
    }

    @Test
    public void createReceiptThatHaveCoffeeWithExtrasSuccessfully() {
        Double expectedResult = 3.8d;
        Product bigCoffeeWithExtraMilk = BeverageService.createBeverageOrder("largeCoffee");
        Product extraMilk = BeverageService.createExtraOrder(bigCoffeeWithExtraMilk, "extraMilk");
        List<Product> productList = new ArrayList<>();
        productList.add(bigCoffeeWithExtraMilk);
        productList.add(extraMilk);
        Receipt actualReceipt = new Receipt(productList);

        Double total = actualReceipt.getTotal();

        Assert.assertNotNull(total);
        Assert.assertEquals(expectedResult, total);
    }

    @Test
    public void createReceiptThatHaveSnacksSuccessfully() {
        Double expectedResult = 8.45d;
        Product orangeJuice = BeverageService.createBeverageOrder("orangeJuice");
        Product baconRoll = SnackService.createSnackOrder("baconRoll");
        List<Product> productList = new ArrayList<>();
        productList.add(orangeJuice);
        productList.add(baconRoll);
        Receipt actualReceipt = new Receipt(productList);

        Double total = actualReceipt.getTotal();

        Assert.assertNotNull(total);
        Assert.assertEquals(expectedResult, total);
    }

    @Test
    public void createReceiptThatApplyComboDiscountSuccessfully() {
        Double expectedResult = 7.5d;
        Product mediumCoffee = BeverageService.createBeverageOrder("mediumCoffee");
        Product extraFoamedMilk = BeverageService.createExtraOrder(mediumCoffee, "foamedMilk");
        Product baconRoll = SnackService.createSnackOrder("baconRoll");
        List<Product> productList = new ArrayList<>();
        productList.add(mediumCoffee);
        productList.add(extraFoamedMilk);
        productList.add(baconRoll);
        Receipt actualReceipt = new Receipt(productList);

        Double total = actualReceipt.getTotal();

        Assert.assertNotNull(total);
        Assert.assertEquals(expectedResult, total);
    }

    @Test
    public void createReceiptWithFreeBeverageSuccessfully() {
        Double expectedResult = 11.95d;
        Product bigCoffee = BeverageService.createBeverageOrder("largeCoffee");
        Product mediumCoffee = BeverageService.createBeverageOrder("mediumCoffee");
        Product smallCoffee = BeverageService.createBeverageOrder("smallCoffee");
        Product orangeJuice = BeverageService.createBeverageOrder("orangeJuice");
        Product otherCoffee = BeverageService.createBeverageOrder("smallCoffee");

        List<Product> productList = new ArrayList<>();
        productList.add(bigCoffee);
        productList.add(mediumCoffee);
        productList.add(smallCoffee);
        productList.add(orangeJuice);
        productList.add(otherCoffee);
        Receipt actualReceipt = new Receipt(productList);

        Double total = actualReceipt.getTotal();

        Assert.assertNotNull(total);
        Assert.assertEquals(expectedResult, total);
    }
}
