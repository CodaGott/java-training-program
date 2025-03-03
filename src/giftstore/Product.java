package giftstore;

public class Product {
    private String productID;
    private String productName;
    private String productDescription;
    private double price;

    public Product(String  productID, String productName, String productDescription, double productPrice) {
        this.productID = productID;
        this.productName = productName;
        this.productDescription = productDescription;
        this.price = productPrice;
    }

    public String  getProductID() {
        return productID;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public double getProductPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productID='" + productID + '\'' +
                ", productName='" + productName + '\'' +
                ", productDescription='" + productDescription + '\'' +
                ", price=" + price +
                '}';
    }
}
