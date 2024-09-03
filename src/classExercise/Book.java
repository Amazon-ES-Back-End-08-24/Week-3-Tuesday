package classExercise;

import java.math.BigDecimal;

public class Book extends AbstractProduct implements Downloadable {

    public Book(String name, BigDecimal price, BigDecimal discount) {
        super(name, price, discount);
    }

    @Override
    public void download() {
        System.out.println("Downloading the book: " + getName());
    }
}
