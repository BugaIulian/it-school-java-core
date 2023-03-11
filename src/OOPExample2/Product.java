package OOPExample2; //test2

import java.time.LocalDate;

public class Product extends Util {
    private double price;
    private boolean isBio;
    private final String storeLocation;
    private final LocalDate expirationDate;
    Category productCategory;

    public Category getProductCategory() {
        return productCategory;
    }

    public Product(String name, double price, LocalDate expirationDate, String storeLocation, boolean isBio, Category productCategory) {
        super(name);
        this.price = price;
        this.expirationDate = expirationDate;
        this.storeLocation = storeLocation;
        this.isBio = isBio;
        this.productCategory = productCategory;
    }

    public String getStoreLocation() {
        return storeLocation;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }
}
