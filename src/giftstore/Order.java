package giftstore;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Product> products = new ArrayList<>();
    private double total;

    public void createProduct(Product p) {
        products.add(p);
        total += p.getProductPrice();
    }

    public void display() {
        System.out.println("Your order:");
        for (Product p : products) {
            System.out.println(p);
        }
        System.out.println("Total price: " + total);
    }

    //TODO CRUD Operations ====> Create, Read, Update, Delete
}
