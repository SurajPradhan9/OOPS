package StaticExample;

public class Main1 {
    public static void main(String[] args) {
        Human suraj = new Human(20, "suraj", 2000000, true);
        Human vaishu = new Human(21, "Vaishnavi", 4000000, true);

        System.out.println(suraj.name);
        System.out.println(vaishu.salary);

        System.out.println(Human.population);// sout(suraj.population");
        System.out.println(Human.population);// sout(vaishu.population");

        // greeting();//cannot access because greeting method is not static
        // to access it we have to create an object of class Main because greeting
        // method is present in class Main i.e
        // Main1 obj=new Main1();
        // obj.greeting();

        Main1.fun(); // or fun(); //beacuse fun() is static so no object is required

        Main1 objj = new Main1(); // because fun2() is not static method so obj is required
        objj.fun2();

    }

    // this is not dependent on objects
    static void fun() {
        // greeting(); // so without specifying which instance greeting() belongs to we
        // cannot use greeting() over here(we cannot use it because it requires an
        // instance ,but the function we are using it in does not depend on
        // objects/instances - in simple terms fun does not depend on instances then how
        // can we have something in that , that depends on instances - we can't)
        // but what if we put like this Main.greeting (in this case also we cant access
        // it but there is a way to access it simply create an object and access it or
        // make the function greeting() as static)

        // you cannot access non-static stuff without referencing their instances in a
        // static context
        // hence here I am referencing it
        Main1 obj = new Main1();
        obj.greeting();
    }

    // if we make a non static method fun2() here if we call greeting() method which
    // is non static here it will be fine because when we call this fun2() method in
    // the end we know it will be called somewhere in main directly or indirectly
    // why because everything starts from main(we know if the method is static or
    // non static,we know that it will be called via some some static method in the
    // end, every single thing we write in the end it will be called inside a static
    // method(i.e main method)) so we know an object for fun2() will be created that
    // is why here we dont have to create an object for greeting() because it will
    // be
    // created when we call fun2() for eg: see in main method we have created an
    // object and called fun2() (inside that we have called greeting() method which
    // is non static but we have created an object for fun2() so greeting() will be
    // bound to the object(so greeting() method now also be part of the object we
    // have created because it is inside fun2()))
    void fun2() {
        greeting();
    }

    // we know that something which is not static, belongs to an object
    void greeting() {
        // fun();//we can access static method inside a non static method
        System.out.println("Hello WOrld");
    }

}

// Static is like vegetarian who just can't have Non Vegetarian food whereas a
// Non Static is like Non vegetarian who can have Vegetarian food with non
// vegetarian food or pure vegetarian food.

// see from 44:49 - 46:32 for summary of static and non static