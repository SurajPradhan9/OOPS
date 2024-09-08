package Inheritance;

public class ParentClass {
    double l; 
    double w;
    double h;

    ParentClass() {
        this.l = -1; 
        this.w = -1;
        this.h = -1;
    }

    static void greeting() {
        System.out.println("Hey i am in Parent class.Greetings!");
    }

    ParentClass(double side) {
        this.l = side;
        this.w = side;
        this.h = side;
    }

    ParentClass(double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    ParentClass(ParentClass old) {
        this.l = old.l;
        this.w = old.w;
        this.h = old.h;
    }

}
