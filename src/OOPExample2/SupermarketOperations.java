package OOPExample2;

import java.time.LocalDate;

public class SupermarketOperations {

    static Category fruitsCategory = new Category("Fruits");
    static Category meatCategory = new Category("Meat");

    public static void main(String[] args) {
        Product product1 = new Product("Banana", 29.9, LocalDate.now().plusDays(31), "A", true, fruitsCategory);
        Product product2 = new Product("Chicken", 67.9, LocalDate.now().plusDays(31), "B", true, meatCategory);
        System.out.println(product1.getProductCategory());

//        System.out.println("The " + product1.getName() + " is located at zone " + product1.getStoreLocation() + " and will expire on " + product1.getExpirationDate());
    }
}
