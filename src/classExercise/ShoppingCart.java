package classExercise;

import java.math.BigDecimal;
import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<AbstractProduct> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addItem(AbstractProduct item) {
        items.add(item);
        System.out.println("Added " + item.getName() + " to the cart.");
    }

    public void removeItem(AbstractProduct item) {
        if (items.remove(item)) {
            System.out.println("Removed " + item.getName() + " from the cart.");
        } else {
            System.out.println("Item not found in the cart.");
        }
    }

    public BigDecimal calculateTotalPrice() {
        BigDecimal totalPrice = BigDecimal.ZERO;
        for (AbstractProduct item : items) {
            totalPrice = totalPrice.add(item.getPrice());
        }
        return totalPrice;
    }

    public void checkout() {
        BigDecimal totalPrice = calculateTotalPrice();
        for (AbstractProduct item : items) {
            item.purchase();
        }
        System.out.println("Total Price after discounts: " + totalPrice);
    }

    public void downloadAll() {
        for (AbstractProduct item : items) {
            if (item instanceof Downloadable) {
                ((Downloadable) item).download();
            }
        }
    }
}
