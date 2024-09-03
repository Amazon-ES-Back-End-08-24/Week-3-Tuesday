package classExercise;

import java.math.BigDecimal;
import java.util.ArrayList;

public class ShoppingCartSystemWithoutShoppingCartClass {
    public static void main(String[] args) {
        // creo un carrito que contenga AbstractProduct para que sea más flexible en lo que tiene
        ArrayList<AbstractProduct> shoppingCart = new ArrayList<>();

        Book book1 = new Book("The Java Programming Language", new BigDecimal("29.99"), new BigDecimal("5.00"));
        Electronics laptop = new Electronics("Laptop", new BigDecimal("799.99"), new BigDecimal("50.00"));
        Book book2 = new Book("Effective Java", new BigDecimal("39.99"), new BigDecimal("10.00"));

        // añado productos
        shoppingCart.add(book1);
        shoppingCart.add(laptop);
        shoppingCart.add(book2);

        // simulo la compra de todos los productos
        BigDecimal totalPrice = BigDecimal.ZERO;
        for (AbstractProduct item : shoppingCart) {
            item.purchase();
            totalPrice = totalPrice.add(item.getPrice());
        }

        System.out.println("Total Price: " + totalPrice);

        // simulo que descargo todos los productos (que implementan Dowloadable)
        for (AbstractProduct item : shoppingCart) {
            // chequeo si el item que itero en el loop es una instancia de la interfaz (se puede usar para clases también)
            if (item instanceof Downloadable) {
                // casteo porque es un AbstractProduct, que no implementa Dowloadable
                ((Downloadable) item).download();
            }
        }

        // elimino item del carrito
        removeItem(shoppingCart, book1);

        // recalculo el total
        totalPrice = BigDecimal.ZERO;
        for (AbstractProduct item : shoppingCart) {
            totalPrice = totalPrice.add(item.getPrice());
        }
        System.out.println("New Total Price after removing an item: " + totalPrice);

    }

    public static void removeItem(ArrayList<AbstractProduct> cart, AbstractProduct item) {
        if (cart.remove(item)) {
            System.out.println("Removed " + item.getName() + " from the cart.");
        } else {
            System.out.println("Item not found in the cart.");
        }
    }
}
