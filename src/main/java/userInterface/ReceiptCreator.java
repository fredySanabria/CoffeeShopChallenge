package userInterface;

import application.BeverageService;
import application.SnackService;
import domain.Product;
import util.PrintUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReceiptCreator {
    private static List<Product> productList;

    public static void main(String[] args) {
        productList = new ArrayList<>();
        boolean exit = false;

        do {
            PrintUtil.printMainMenu();
            Scanner sd = new Scanner(System.in);
            int num = sd.nextInt();
            switch (num) {
                case 1:
                    Product bigCoffee = BeverageService.createBeverageOrder("largeCoffee");
                    productList.add(bigCoffee);
                    PrintUtil.printExtraMenu(sd, bigCoffee, productList);
                    break;

                case 2:
                    Product mediumCoffee = BeverageService.createBeverageOrder("mediumCoffee");
                    productList.add(mediumCoffee);
                    PrintUtil.printExtraMenu(sd, mediumCoffee, productList);
                    break;

                case 3:
                    Product smallCoffee = BeverageService.createBeverageOrder("smallCoffee");
                    productList.add(smallCoffee);
                    PrintUtil.printExtraMenu(sd, smallCoffee, productList);
                    break;

                case 4:
                    Product orangeJuice = BeverageService.createBeverageOrder("orangeJuice");
                    productList.add(orangeJuice);
                    break;

                case 5:
                    Product baconRoll = SnackService.createSnackOrder("baconRoll");
                    productList.add(baconRoll);
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Please select a valid option");
            }
        } while (!exit);
        PrintUtil.printReceipt(productList);
    }
}
