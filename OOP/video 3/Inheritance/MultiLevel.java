package Inheritance;

public class MultiLevel extends ChildClass {
    double cost;

    MultiLevel() {
        super();
        this.cost = -1; 
    }

    MultiLevel(double l, double w, double h, double weight, double cost) {
        super(l, w, h, weight);
        this.cost = cost;
    }

    MultiLevel(double side, double weight, double cost) {
        super(side, weight);
        this.cost = cost;
    }

    MultiLevel(MultiLevel old) {
        super(old);
        this.cost = old.cost;
    }

}
