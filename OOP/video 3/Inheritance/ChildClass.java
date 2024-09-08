package Inheritance;

public class ChildClass extends ParentClass {

    double weight;

    ChildClass() {
        this.weight = -1;
    }
 
    ChildClass(ChildClass old) {
        super(old);
        weight = old.weight;
    }

    // @Override (for checking purpose -if we uncomment we get error becuase it is
    // not overridding the greeting method which is present in parentclass)
    static void greeting() {
        System.out.println("Hey i am in Child class.Greetings!");
    }

    ChildClass(double l, double w, double h, double weight) {
        super(l, w, h);// call the parent class constructor
        this.weight = weight;
    }

    ChildClass(double side, double weight) {
        super(side);
        this.weight = weight;
    }

}
