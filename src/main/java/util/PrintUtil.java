package util;

import application.BeverageService;
import domain.Product;
import domain.Receipt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintUtil {
    public static void printExtrasMenu() {
        StringBuilder menuString = new StringBuilder();
        menuString.append("|   Do you like some extra?       |\n");
        menuString.append("| Options:                        |\n");
        menuString.append("|        1. Extra Milk            |\n");
        menuString.append("|        2. Foamed Milk           |\n");
        menuString.append("|        3. Special Roasted       |\n");
        menuString.append("|        4. None                  |");
        System.out.println(menuString.toString());
    }

    public static void printReceipt(List<Product> productList) {
        Receipt actualReceipt = new Receipt(new ArrayList<>(productList));
        Double total = actualReceipt.getTotal();
        System.out.println("Total: " + total);
    }

    public static void printMainMenu() {
        StringBuilder menuString = new StringBuilder();
        menuString.append("|   MENU SELECTION COFFEE SHOP    |\n");
        menuString.append("| Options:                        |\n");
        menuString.append("|        1. Large Coffee          |\n");
        menuString.append("|        2. Medium Coffee         |\n");
        menuString.append("|        3. Small Coffee          |\n");
        menuString.append("|        4. Orange juice          |\n");
        menuString.append("|        5. Bacon Roll            |\n");
        menuString.append("|        6. Exit                  |\n");
        menuString.append("choose one!\n");
        System.out.println(menuString.toString());
    }

    public static void printExtraMenu(Scanner sd, Product actualBeverage, List<Product> productList) {
        PrintUtil.printExtrasMenu();
        int num = sd.nextInt();
        switch (num) {
            case 1:
                Product extraMilk = BeverageService.createExtraOrder(actualBeverage, "extraMilk");
                productList.add(extraMilk);
                System.out.println("\n");
                break;
            case 2:
                Product foamedMilk = BeverageService.createExtraOrder(actualBeverage, "foamedMilk");
                productList.add(foamedMilk);
                System.out.println("\n");
                break;
            case 3:
                Product roastedCoffee = BeverageService.createExtraOrder(actualBeverage, "roastCoffee");
                productList.add(roastedCoffee);
                System.out.println("\n");
                break;
            case 4:
                break;
            default:
                System.out.println("Please select a valid option");
        }
    }
}
