package classExercise;

import java.math.BigDecimal;

public abstract class AbstractProduct implements Purchasable {
    private String name;
    private BigDecimal price;
    private BigDecimal discount;  // el descuento que le pongamos

    public AbstractProduct(String name, BigDecimal price, BigDecimal discount) {
        this.name = name;
        this.price = price;
        this.discount = discount != null ? discount : BigDecimal.ZERO;
    }

    @Override
    public void purchase() {
        BigDecimal finalPrice = price.subtract(discount);
        System.out.println("Purchasing " + name + " for " + finalPrice + " after a discount of " + discount);
    }

    @Override
    public BigDecimal getPrice() {
        return price.subtract(discount);
    }

    public String getName() {
        return name;
    }

    public BigDecimal getDiscount() {
        return discount;
    }
}
