package classes.animals;

public class Human extends Mammal{
    private boolean isInSchool;
    private String name;

    public Human(boolean isInSchool, boolean isBreastFeeding, String name) {
        this.isInSchool = isInSchool;
        this.isBreastFeeding = isBreastFeeding;
        this.name = name;
    }

    // getter
    public boolean isInSchool() {
        return isInSchool;
    }

    // setter
    public void setInSchool(boolean inSchool) {
        isInSchool = inSchool;
    }

    // getter
    public String getName() {
        return name;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

//    @Override
//    public void breathe() {
//        System.out.println("The human is breathing");
//    }
}
