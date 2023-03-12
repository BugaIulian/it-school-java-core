package OOPExample2;

import java.time.LocalDate;

public class Product extends Util {
    private double price;
    private boolean isBio;
    private final String storeLocation;
    private final LocalDate expirationDate;
    private String productCategory;

    private String itemLocation;

    public Product(String name, double price, LocalDate expirationDate, String storeLocation, boolean isBio, String productCategory, String itemLocation) {
        super(name);
        this.price = price;
        this.expirationDate = expirationDate;
        this.storeLocation = storeLocation;
        this.isBio = isBio;
        this.productCategory = productCategory;
        this.itemLocation = itemLocation;
    }

    public String getStoreLocation() {
        return storeLocation;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public String getItemLocation() {
        return itemLocation;
    }
}
