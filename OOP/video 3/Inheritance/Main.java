package Inheritance;

public class Main {
    public static void main(String[] args) {

        ParentClass parentClass1 = new ParentClass(); 
        System.out.println(parentClass1.l + " " + parentClass1.w + " " + parentClass1.h);

        // parentClass1.greeting();

        // ParentClass obj5=new ChildClass(); // we are over-ridding the greeting
        // method but instead of printing the greeting method that is present in
        // childClass it is printing parentClass greeting method only(All the static
        // methods that being inherited, imagine they were being inherited there is no
        // point in over-ridding them in child class because the method in the parent
        // class will always run no matter from which object we call it because it is
        // not dependent on object it is static i.e the reason that static methods that
        // is in childClass is not being called because the main one that is in the
        // parentClass is called )

        // even-though it can be inherited we can use it via
        // childClass object i.e ChildClass obj=new ChildClass()it will print the same
        // thing because (the method in the parent
        // class will always run no matter from which object we call it because it is
        // not dependent on object it is static)

        // (In simple words - static methods can be inherited but cannot be over-ridden
        // because it is not dependent on objects)(over-ridding depends on objects
        // ,static does-not depends on objects,hence static methods cannot be
        // over-ridden)so dynamic method dispatch cannot be happen if they are static
        // obj5.greeting();

        ParentClass parentClass2 = new ParentClass(4.0);
        System.out.println(parentClass2.l + " " + parentClass2.w + " " + parentClass2.h);

        ParentClass parentClass3 = new ParentClass(2.0, 4.0, 6.0);
        System.out.println(parentClass3.l + " " + parentClass3.w + " " + parentClass3.h);

        ParentClass parentClass4 = new ParentClass(parentClass1);
        System.out.println(parentClass4.l + " " + parentClass4.w + " " + parentClass4.h);

        ChildClass childClass1 = new ChildClass();
        System.out.println(childClass1.weight + " " + childClass1.l);

        ChildClass childClass2 = new ChildClass(2, 3, 4, 80);
        System.out.println(childClass2.l + " " + childClass2.w + " " + childClass2.h + " " + childClass2.weight);

        ParentClass parentClass5 = new ChildClass(1, 2, 3, 4);
        System.out.println(parentClass5.l); // we can only access parent class
        // members we cant access childClass members i.e parentClass5.weight

        ChildClass obj = new ChildClass(childClass2);
        System.out.println(obj.l + " " + obj.w + " " + obj.h + " " + obj.weight);

        MultiLevel obj1 = new MultiLevel();
        System.out.println(obj1.w);

        MultiLevel obj2 = new MultiLevel(2, 4, 6, 80, 8000);
        System.out.println(obj2.l + " " + obj2.w + " " + obj2.h + " " + obj2.weight + " " + obj2.cost);

        MultiLevel obj3 = new MultiLevel(90, 900, 9000);
        System.out.println(obj3.l + " " + obj3.w + " " + obj3.h + " " + obj3.weight + " " + obj3.cost);

        MultiLevel obj4 = new MultiLevel(obj2);
        System.out.println(obj4.l + " " + obj4.w + " " + obj4.h + " " + obj4.weight + " " + obj4.cost);

    }
}
