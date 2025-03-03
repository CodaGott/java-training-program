package giftstore;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GiftStore {
    private Map<String, Product> products = new HashMap<>();
    private Scanner scanner = new Scanner(System.in);

    public GiftStore() {
        products.put("1", new Product("1", "Pet Dog", "Bingo", 100000));
        products.put("2", new Product("2", "Rose Flower", "flower", 88));
        products.put("3", new Product("3", "Iphone", "16", 393));
        products.put("4", new Product("4", "Laptop", "HP", 573));
        products.put("5", new Product("5", "Samsung", "S24", 2999));
        products.put("6", new Product("6", "Cat", "Cat", 100));
        products.put("7", new Product("7", "TV", "LG", 1004));
        products.put("8", new Product("8", "Book", "How to program", 183));
    }

    public Product getProduct(String  id) {
        System.out.println("Product with ID " + id + " is available  " + products.get(id));
        return products.get(id);
    }

    public void showProducts() {
        System.out.println("Available products:");
        for (Product product : products.values()) {
            System.out.println(product);
        }
    }

    public void process(){
        Order order = new Order();

        while (true) {
            System.out.print("Enter product ID to add product to the order (or type 0 to exit): ");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("0")) {
                break;
            }
            Product product = products.get(choice);

            if (product == null) {
                System.out.println("Product with ID " + choice + " not found");
            }else {
                order.createProduct(product);
                System.out.println("Product with ID " + choice + " has been created");
            }
        }
        order.display();
        System.out.println("Order completed successfully, Thank you for using GiftStore");
    }
}
