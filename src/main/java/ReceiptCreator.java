import application.BeverageService;
import application.SnackService;
import domain.Product;
import domain.Receipt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReceiptCreator {
    private static List<Product> productList;

    public static void main(String[] args) {
        productList = new ArrayList<>();
        boolean exit = false;

        do {
            System.out.println("|   MENU SELECTION COFFEE SHOP    |");
            System.out.println("| Options:                        |");
            System.out.println("|        1. Large Coffee          |");
            System.out.println("|        2. Medium Coffee         |");
            System.out.println("|        3. Small Coffee          |");
            System.out.println("|        4. Orange juice          |");
            System.out.println("|        5. Bacon Roll            |");
            System.out.println("|        6. Exit                  |");
            System.out.println("choose one!");
            Scanner sd = new Scanner(System.in);
            int num = sd.nextInt();
            switch (num) {
                case 1:
                    Product bigCoffee = BeverageService.createBeverageOrder("largeCoffee");
                    productList.add(bigCoffee);
                    System.out.println("\n");
                    printExtraMenu(sd, bigCoffee);
                    break;

                case 2:
                    Product mediumCoffee = BeverageService.createBeverageOrder("mediumCoffee");
                    productList.add(mediumCoffee);
                    System.out.println("\n");
                    printExtraMenu(sd, mediumCoffee);
                    break;

                case 3:
                    Product smallCoffee = BeverageService.createBeverageOrder("smallCoffee");
                    productList.add(smallCoffee);
                    System.out.println("\n");
                    printExtraMenu(sd, smallCoffee);
                    break;

                case 4:
                    Product orangeJuice = BeverageService.createBeverageOrder("orangeJuice");
                    productList.add(orangeJuice);
                    System.out.println("\n");
                    break;

                case 5:
                    Product baconRoll = SnackService.createSnackOrder("baconRoll");
                    productList.add(baconRoll);
                    System.out.println("\n");
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Please select a valid option");
            }
        } while (!exit);
        printReceipt();
    }

    private static void printExtraMenu(Scanner sd, Product coffee) {
        System.out.println("|   Do you like some extra?       |");
        System.out.println("| Options:                        |");
        System.out.println("|        1. Extra Milk            |");
        System.out.println("|        2. Foamed Milk           |");
        System.out.println("|        3. Special Roasted       |");
        System.out.println("|        4. None                  |");
        int num = sd.nextInt();
        switch (num) {
            case 1:
                Product extraMilk = BeverageService.createExtraOrder(coffee, "extraMilk");
                productList.add(extraMilk);
                System.out.println("\n");
                break;
            case 2:
                Product foamedMilk = BeverageService.createExtraOrder(coffee, "foamedMilk");
                productList.add(foamedMilk);
                System.out.println("\n");
                break;
            case 3:
                Product roastedCoffee = BeverageService.createExtraOrder(coffee, "roastCoffee");
                productList.add(roastedCoffee);
                System.out.println("\n");
                break;
            case 4:
                break;
            default:
                System.out.println("Please select a valid option");
        }
    }

    private static void printReceipt() {
        List<Product> products = new ArrayList<>(productList);
        products.forEach(System.out::println);
        System.out.println("\n");
        Receipt actualReceipt = new Receipt(products);
        Double total = actualReceipt.getTotal();
        System.out.println("Total: " + total);
    }
}
