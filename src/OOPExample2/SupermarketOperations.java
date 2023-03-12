package OOPExample2;


import java.time.LocalDate;

public class SupermarketOperations {
    static Category category = new Category();
    static ItemLocation location = new ItemLocation();

    public static void main(String[] args) {

        Product product1 = new Product("Shampoo", 2.99, LocalDate.now().plusDays(31), "A", false, category.getCosmeticsCategory(), location.getZoneA());
        Product product2 = new Product("Chicken", 6.99, LocalDate.now().plusDays(31), "B", true, category.getMeatCategory(), location.getZoneD());
        Product product3 = new Product("Fish", 7.99, LocalDate.now().plusDays(31), "B", true, category.getSeaFoodCategory(), location.getZoneB());
        Product product4 = new Product("Bread", 4.99, LocalDate.now().plusDays(31), "B", true, category.getBakeryCategory(), location.getZoneE());
        System.out.println(product1.getName() + " is from the " + product1.getProductCategory() + " category and it's stored at " + product1.getItemLocation());
        System.out.println(product2.getProductCategory());
        System.out.println(product3.getProductCategory());
        System.out.println(product4.getProductCategory());

    }
}
