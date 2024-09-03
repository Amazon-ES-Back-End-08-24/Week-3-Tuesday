package classes.animals;

import interfaces.Breathable;

public abstract class Plant implements Breathable {
    @Override
    public void breathe() {
        System.out.println("The plant is breathing");
    }
}
