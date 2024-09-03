package classes.animals;

import interfaces.Breathable;

public class Mammal implements Breathable {
    protected boolean isBreastFeeding;

    @Override
    public void breathe() {
        System.out.println("The mammal is breathing");
    }

    public boolean isBreastFeeding() {
        return isBreastFeeding;
    }

    public void setBreastFeeding(boolean breastFeeding) {
        isBreastFeeding = breastFeeding;
    }
}
