package classes.shapes;

public abstract class Shape {
    // pueden tener métodos abstractos -> Los que me dicen QUÉ pero no CÓMO
    public abstract double area();

    public void displayArea() {
        System.out.println("Area is " + area());
    }
}
