import classes.animals.Human;
import classes.animals.Mammal;
import classes.shapes.Square;
import classes.Toaster;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        // classes.animals.Plant plant = new classes.animals.Plant(); ABSTRACTA  no se instancia
        // plant.breathe();

        Mammal mammal = new Mammal();
        mammal.breathe();
        System.out.println(mammal.isBreastFeeding());
        mammal.setBreastFeeding(true);
        System.out.println(mammal.isBreastFeeding());

        Human human = new Human(false, true, "Pepito");
        human.breathe();
        System.out.println(human.getName());

        Toaster toaster = new Toaster(6, 62);
        Toaster toaster1 = new Toaster(3, -3);
        System.out.println(toaster.getCapacityForToast());
        System.out.println(toaster1.getCapacityForToast());
        toaster.play();
        toaster.turnOff();

        Square square = new Square(4);
        square.displayArea();

        BigDecimal number1 = new BigDecimal("1.05");
        BigDecimal number2 = new BigDecimal("0.2");
        BigDecimal sum = number1.add(number2);
        BigDecimal difference = number1.subtract(number2);
        BigDecimal product = number1.multiply(number2);
        BigDecimal division = number1.divide(number2, RoundingMode.HALF_DOWN);

        BigDecimal displayValue = sum.setScale(1, RoundingMode.HALF_DOWN);
        System.out.println(displayValue);

        displayValue = difference.setScale(2,RoundingMode.HALF_EVEN);
        System.out.println(displayValue);

        displayValue = product.setScale(2,RoundingMode.HALF_UP);
        System.out.println(displayValue);

        displayValue = division.setScale(1, RoundingMode.HALF_DOWN);
        System.out.println(displayValue);
    }
}