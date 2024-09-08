package Polymorphism;

public class Circle extends Shapes {

    // this will run when object of Circle is created
    // hence it is overriding the parent method
    @Override // this is called annotation (basically if you want to check whether a method is
              // overridden or not just put @Override above it if it is not over-ridden it
              // will give us error(the @Override))(how to create it at its own they can be
              // created using interfaces) (use for check purpose)
    void area() {
        System.out.println("Area is pi * r * r");
    }
}
