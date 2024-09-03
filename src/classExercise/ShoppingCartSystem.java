package classExercise;

import java.math.BigDecimal;

public class ShoppingCartSystem {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Book book1 = new Book("The Java Programming Language", new BigDecimal("29.99"), new BigDecimal("5.00"));
        Electronics laptop = new Electronics("Laptop", new BigDecimal("799.99"), new BigDecimal("50.00"));
        Book book2 = new Book("Effective Java", new BigDecimal("39.99"), new BigDecimal("10.00"));

        cart.addItem(book1);
        cart.addItem(laptop);
        cart.addItem(book2);

        cart.checkout();

        cart.downloadAll();

        // elimina un item y recalcula el total
        cart.removeItem(book1);
        cart.checkout();
    }
}