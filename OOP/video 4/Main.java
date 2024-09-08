public class Main {
    public static void main(String[] args) {

        // 1.
        // Private
        // if the varibale is not private we can access it through outside also. but
        // from the security point of view allowing access to a variable or something
        // from outside is not a good convention.so only we use private

        // if we have a instance varibale as private in a class we cant access it
        // directly from the main method . we can access that variable using getters and
        // setters method. getter gets the value ans setter sets the value. now we can
        // use those getter method to access the value. now we will get doubt how can
        // we access the value which is private.(we are not directly getting it, we say
        // the object from which we are acessing is has a getter method and this getter
        // method is present inside the class where the private variable is
        // present.)private means we can access that pariticular variable anywhere
        // inside the class but not outside, so the getter method can access that
        // varibale and using that getter method which is public we are able to access
        // that varibale from outside class.

        // public
        // it means we can access the variable from anywhere

        // default
        // it means we can access the variable from same package but from different
        // package we cant access it

        // protected
        // see png

        // see AccessModifiers png for brief info about aceess modifiers

        // when to use which modifier
        // private - it is for sensitive data that we dont want direct access to.we can
        // access it using getter and setter method(we can access it with some methods
        // that can be public)
        // No modifier(DEfault)- we will use this modifier for those variables that we
        // dont want to be used outside the package
        // protected- i dont want my variables to be accessed outside the package but i
        // only want it to be accessed outside the package if it is in the subclass
        // public - when we want it to be accessed from everywhere we use public

        // we want that the main function should be accessed from everywhere so only
        // main function is public (public static void main)

        // 2.
        // Important point about 'protected' access in Java:
        // Only a subclass can access the protected members of its superclass when the
        // subclass is in a different package. This access happens using the subclass
        // object, not the superclass object.

        // Example:
        // Let's say we have a public class SubClass that extends ParentClass.
        // Imagine if we could access protected members using a ParentClass object. The
        // issue is:
        // - ParentClass does not know which classes are extending it. Only the subclass
        // knows about its parent class.
        // - ParentClass does not have any knowledge about the SubClass, but SubClass
        // knows it extends ParentClass and can access its protected members.
        // - If we could access the protected members using a ParentClass object, anyone
        // could use this object to access protected members anywhere, which is not
        // allowed.

        // Therefore, we use the subclass object to access the protected members,
        // ensuring that:
        // - Only the subclass has access to the protected members from the superclass.
        // - The dependency on whether the protected members can be accessed from a
        // different package is dependent on the subclass, not the superclass.

        // We can also access using subclass's subclass i.e
        // we know public class SubClass extends ParentClass.
        // i.e we can also access protected members using public class SubSubClass
        // extends Subclass.(SubSubClass object)

        // let say we have another subclass i.e subclass2 that extends ParentClass
        // here subClass2 can also access the protected members of parentClass but
        // subClass doesnt have any idea about subClass 2. if we would have protected
        // members in subclass2 , subclass cant access subclass2 protected members.

        // therefore, in different packages you are able to access the protected members
        // using subclass object(in subclass).

        // 3.
        // Packages are folders that are used to categorize classes and stuff
        // There are 2 types of Packages - (i) User Defined(means the folders that we
        // create) (ii) Built-in

        // In-built packages
        // (i) lang
        // contains the essential stuff of java(i.e stuff that is pretty mandotary to
        // use-java language specific stuff)
        // eg: operations we do like(+,-,*,/ etc) internally somewhere they might be
        // contained in classes , Primitive datatypes (internally somewhere they might
        // be in some class)
        // so, all these basic stuffs that are like very important specific to language
        // they go inside the lang package
        // but we are like, we are using the operations and primitive dt but we never
        // write java.lang how are we using them without importing because it's
        // automatically imported.

        // (ii)io (input output)
        // it contains input output classes
        // These package is used in file reading and stuff(reading a file,optimized
        // input output for competitive programming,buffer reader etc)these go inside
        // the java.io package (java is the main folder and sub folder is io)

        // (iii)util
        // util means utility classes - contains data structures and stuff and
        // collections framework as well eg: ArrayList, HashMap etcc (import
        // java.util.ArrayList) here ArrayList is a class

        // (iv) applet (for development side)
        // its used to create applets in java

        // (v)awt(for graphical user interface)
        // create a button or whatever (GUI applications)

        // (vi)net (for networking operations)
        // if we are making an app and we wanna connect to the internet and stuff for
        // that we have the net package

        // 4.
        // object class (it is inside the lang package)
        // it is the root of the class hierarchy (top most class in inheritance)
        // if we do public class Main (its bydefault extending the object class)
        // if we do public class subclass extends parentclass (indirectly subclass is
        // also extending the object class) (but we know in java multiple inheritance is
        // not allowed then how cum it is doing this - public class subclass extends
        // parentclass,Object)(its internally doing it (indirectly))

        // Basically object class has a few imp things that we use i.e printing the
        // object value etc.

        //Object Methods
        //see objectDemo class
    }
}