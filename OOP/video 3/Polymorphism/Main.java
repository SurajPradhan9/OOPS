package Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Square square = new Square();

        shape.area();
        circle.area();
        triangle.area();
        square.area();

        Shapes obj = new Square();
        obj.area();// it prints the square one because it is overridding

    }
}
