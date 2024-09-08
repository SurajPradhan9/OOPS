public class Main {
    public static void main(String[] args) {

        // 1.
        // Inheritance
        // Example: Inheritance means we are inheriting in our real life that is our
        // parents have properties and stuff like that like money etc and they pass
        // those things to us like money , human traits,values etc.(they have all of
        // those things and the children can use those things)

        // in terms of classes we can say that the particular class (class is named
        // group of properties and functions) has like some variables ,functions etc.
        // so, we can say if there is a class that is able to use the properties of
        // other class(In oop let there is a base class and any class that is derived
        // from the base class is known as child class, child class is going to have
        // access to
        // the members of base class ,let base class has some variables like length ,
        // height ,width then child class can have access to length width and height)
        // child class may also have some additional arguments like weight for example
        // let say if we are talking about a box ,for obvious reasons is the base class
        // going to have a variable known as weight -No because it is specific to child
        // class only.

        // So,this is known as Inheritance (This child class is Inheriting properties
        // from base class) so we can say these are inter link with each other , so if
        // we want to use the child class we can also use the properties of the base
        // class as well

        // if we want to inherit a class let if we want to inherit the parent class
        // (class is a definition a template so how can we incoperate the definition of
        // the class )let say the definition of parent class contains
        // length,width,height how can we incorporate the parent class properties in to
        // child class using the extends keyword.(i.e class ChildClass extends
        // ParentClass) i.e child class has let say int weight; but it can also access
        // to all the properties of Parent class i.e height length and weight.i.e eg:
        // ChildClass child=new ChildClass(); then we can do,child.length or
        // child.weight or child.height

        // if we are inheriting a class in another class, so when we are calling a
        // constructor we should also define the properties that are in the parent class
        // (child class means it will have the properties of base class + some
        // additional properties of its own) .whenever we are calling a constructor for
        // child class we should also initialize the properties of parents
        // class.

        // (because let say we have a parent class species with instance variable
        // age ,and let say we have a child class human we want to access the age
        // variable from parent class so we have to intialize the parent class variables
        // beacuase that age is specific to that human, for every single human the age
        // will be different,so for every single human we have to specify the age)
        // so whenever we call a constructor we have to initialize parent class
        // variables also

        // 2.
        // example refer parent class and child class

        // Super Keyword calls the parent class Constructor ,it is used to initialize
        // the values present in Parents class

        // Although the child class includes all the members of parent class ,but it
        // will not be able to the access the members of parent class if they are
        // private

        // from parent class we can't access the members of child class .(we can only
        // access the variables that are above of that class until and unless
        // they are not private)

        // We know that the parentClass object is not able to access childClass members
        // ? but how it is working Internally and what is actually determining these

        // lets make a ParentClass type object the reference type will be ParentClass
        // but the weird thing we will do is we actually create the object of type
        // childClass i.e ParentClass obj=new ChildClass(l,w,h,weight);

        // if we try to access parent class members we can ,but if we are trying to
        // access childClass
        // we cant so,the reference type is determining which members it can access. (so
        // when a reference to the subClass object is assigned to a super class
        // reference variable you will only have access to the super class members)

        // if we make the reference type to be childClass and object to be ParentClass
        // but we know that the childCLass can access the members of child class as well
        // as parent class but if we create the object of parent class we are not
        // initializing the members of child class so it will give us error i.e
        // ChildClass obj=new ParentClass(l,w,h); error

        // there are many variables in both parent class and child class
        // you are given access to variables that are in the reference type i.e
        // ChildClass
        // hence ,you should have access to weight variable
        // this also means , that the ones you are trying to access should be
        // initialized
        // but here ,when the object itself is of type ParentClass, how will you call
        // the constructor of child class
        // that is why error

        // 3.
        // Super Keyword
        // we know that the super keyword calls the parent class constructor , so
        // whenever the ChildClass needs to refer to the ParentClass from which it is
        // defined/derived we use super keyword

        // super-keyword also works in multi-level inheritance eg - we have 3 classes A
        // B C --> B inherits A , C Inherits B - if we have the super keyword in C it
        // will call the Class B constructor ,Similarly if we keep the super keyword in
        // B it will call the Class A constructor and if we keep the super keyword in A
        // also it will work because it will refer to object class(the object class is
        // like the Main class from which every other class is inherited , every single
        // class that we create has object as a super class, like arrays and even the
        // own classes we create , are refered to the object class which is presented by
        // java)
        // so, super basically means directly above it

        // another use case is we can use the super keyword as this keyword but the only
        // difference is it only access the super class members i.e
        // System.out.println(this.w); is same as (super.w) , but we will getting doubt
        // if we can use the this keyword why to use the super keyword example if we
        // also have the weight variable in parent class which weight to access we don't
        // no, using this.weight we will access the ChildClass weight so,using
        // super.weight we can access the weight variable which is present in
        // parentClass

        // 4.
        // we initialize the parentClass before the childClass because the parent class
        // does not know what the child class contains .so ,we will use super(l,w,h)
        // after that we use this.weight
        // NOte : if we don't use super keyword in childClass constructor then the
        // default one will be called i.e ParentClass();(parameter constructor of parent
        // class will be called)

        // let's say we make a constructor in childClass that takes another
        // childCLass(copy) we are initializing as super(old) and this.weight=old.weight
        // ChildClass(ChildClass old) {
        // super(old);
        // weight = old.weight;
        // }
        // it is not giving any error
        // (In super the old type that we are passing is actually a childClass type) but
        // in parentsClass it is actually taking a ParentClass type isn't this the
        // same-thing as this ->ParentClass parentClass5=new
        // ChildClass(1,2,3,4);
        // here it is saying that the copy constructor is taking the parentclass type
        // but you are passing the object of childclass type ,does childclass type have
        // access to all the parentclass type?Yes it does for obvious reasons.
        // ParentClass(ParentClass old) {
        // this.l = old.l;
        // this.w = old.w;
        // this.h = old.h;
        // }
        // This Internally says ParentClass old=other; other is of type childClass.
        // so its gonna be like the reference type is parentclass so eventhough this is
        // of childclass type it is going to only have reference to parentclass type
        // In parent class constructor there will be no access to old.weight obviously
        // because it is of parentclass type but if we are passing a childclass object
        // it will only have access to what are available in parentclass constructor.
        // becasue what is accessed is based on type of the reference variable not the
        // type of the object
        // so super class variable can be used to reference any object from the derived
        // class ,hence we are able to pass the childclass object to the parentclass
        // constructor(obviously the parentclass will only have knowledge of its own
        // variables because it is of type parentclass)// (DOUBT--see again from 45min)

        // 5.
        // Types of Inheritance
        // 1. Single Inheritance : one class extends another class

        // 2. Multi-Level Inheritance: A is parent of B class ,and B is Parent of C
        // class ,and C is parent of D class, .. eg: refer MultiLevel class and debug it

        // 3. Multiple Inheritance : one class extending more than one classes . let's
        // say we have 3 classes A B C , A and B are both parent classes of C , Let say
        // we have n=5 in Class A and let say we have n=10 in class B and when we create
        // (C obj=new C()) and call obj.n which n it would be print(ambiguity -it's not
        // able to decide which one to pick) that is the reason java don't support
        // multiple inheritance (if 2 or more parent class have the same variable then
        // child class will get confuuse which one to pick)
        // fine multiple inheritance is not implemented in java ,(there might be the
        // possibility where you need to create a child class that has more-than 1
        // parent classes then how will you able to do it?) we can do it via interfaces

        // 4.Hierarchical Inheritance: one class is inherited by multiple classes let we
        // have 3 classes A B C , class B extends Class A , Class C extends class A

        // 5. Hybrid Inheritance: Combination of single and multiple inheritance (i.e
        // let we have A B C D classes B extends A and C extends A and D extends both B
        // and C)(since in java we don't have multiple inheritance we don't have either
        // hybrid inheritance) we can do it via Interfaces

        // A class cant inherit it-self that is class A extends class A

        // 6.
        // Polymorphism
        // poly - means many and morphism - means ways to represent (many ways to
        // represent a single entity or item) (these are greek words)

        // for eg: A task is performed as a single action but in different ways (if any
        // language does not accept polymorphism we cannot refer it as OOP language they
        // are instead known as object based languages fo eg:Ada) but Java is a OOP
        // Language

        // polymorphism occurs during inheritance because there are many classes that
        // are relating to each other , so how it actually occurs? real world example is
        // ,refer package (polymorphism) (we have created Shapes , Circle
        // ,Triangle,Square Classes and done a hierarchical inheritance in them and in
        // each class we created a method called area and in main method we called the
        // methods using the objects of the particular class(the definition of function
        // is same in every class that is void area()))--> so , act of representing the
        // same thing in multiple ways is known as Polymorphism

        // Types of Polymorphism-
        // 1. Compile time / static polymorphism (it is achieved by method
        // overloading)(it ia also achieved by operator overloading but in java they do
        // not provide operator overloading)

        // Method overloading means when a class has multiple methods with the same name
        // but different parameters (i.e types , arguments,return type and order of the
        // type) can be different eg: multiple constructors eg: A obj=new a() , A
        // obj1=new A(7,8) etc

        // why it is called as compile time or static polymorphism because java
        // determines which method or constructor will be called at compile time eg: we
        // did it in Inheritance i.e ParentClass parentClass1 =new
        // ParentClass();ParentClass parentClass2 =new ParentClass(4.0);ParentClass
        // parentClass3 =new ParentClass(2.0,4.0,6.0); (when it is compiling it will be
        // like which constructor do we need to call (same for methods)

        // (eg: we have
        // -->ParentClass parentClass3 =new ParentClass(2.0,4.0,6.0); it will call the
        // constructor that have parameters of ParentClass(2.0,4.0,6.0);
        // if we have
        // -->ParentClass parentClass3 =new ParentClass(2.0); we don't have this type of
        // constructor in class so it will give a compile time error),at compile time it
        // will look for that )

        // refer example i.e Numbers class in Polymorphism package

        // 2. Run time / Dynamic Polymorphism(it is achieved by method overriding)
        // Method overriding means when a child class has a method name same as the
        // parent class with same parameters return type and everything just the body is
        // different (eg - Square Triangle Circle has the same method name with respect
        // to the name of parent class ( Shapes)

        // we got a doubt comparing inheritance and overriding i.e
        // When we inherit a class (without overriding), like this:
        // ParentClass obj = new ChildClass(l, w, h, weight);
        // if we try to access parent class members, we can. But if we try to access
        // child class members, we cannot. This is because when a reference to the
        // subclass object is assigned to a superclass reference variable, we only
        // have access to the superclass members.

        // However, during overriding, if we do:
        // Shapes obj = new Square();
        // the method that will run when the object of Square is created will be the
        // overridden method in the Square class, because it is overriding the parent
        // method. We get the behavior defined in the Square class because the Square
        // class method is overriding the Shapes class method.

        // (Actually , what it is able to
        // access is defined by the reference type and which one it's able to access is
        // depends on object type )(if the reference type is parent class and object
        // type is child class if it overrides obviously the child class method will
        // print beacuse we are creating a object of childClass(constructor))

        // if there is childclass reference and childclass object obviously it will call
        // the own one

        // Overriding occurs when the reference variable we are using is of type
        // ParentClass, and which particular method will be called depends on the
        // object type. For example:
        // Shapes obj = new Square();
        // Which method will be called depends on the object type (Square).
        // This is known as upcasting, and the entire process (Shapes obj = new
        // Square();) is how overriding works.

        // Actually the object type defines which one to run and reference type defines
        // which one to access (In Overriding) .

        // Basically parentClass says you can access a function that has the name area
        // but which particular version of area to be called determine by the object.

        // How java determines this? java determines this with something known as
        // Dynamic method dispatch this is why it is known dynamic polymorphism

        // so what it is Dynamic memory dispatch - it is just a mechanism by which , a
        // call to a overridden method is resolved at run time rather than compile
        // time(after all the compilation everything is done,when the program is running
        // java determines which particular method to run)

        // we know that a super class reference variable can refer to a subclass object
        // and when a overridden method is called through a super class reference
        // variable (eg : in this case Shapes obj=new Square(); java determines which
        // version of that method to call based on the type of the object ,at the time
        // this call happens .hence this determination is made at run
        // time)

        // For better understanding of above see objectPrint file in Polymorphism
        // package

        // 7.
        // Final keyword is used to create constants ,we can also use final keyword to
        // prevent over-ridding , we cannot override a method which is final(why because
        // methods in which they are declared as final can somehow provide a performance
        // enhancement because the compiler is free to inline the calls to them because
        // the compiler will know that these methods will not be over-ridden (but we
        // know over-ridding happens at run time)

        // so, when a final method is called java
        // compiler can copy the bytecode from the subroutine or whatever the internal
        // implementation is, directly with the compile code of the calling
        // method hence eliminating the overhead ,associated with this method called
        // like which one to actually resolve ,it know this will be the only one resolve
        // because it cannot be over-ridden what is reamining then this will be resolved
        // so that extra step is gone)

        // ########################
        // chatgpt of above 2 paras
        // The final keyword in Java is used to create constants and prevent method
        // overriding. When a method is declared as final, it cannot be overridden by
        // subclasses. This restriction can provide performance enhancements because the
        // compiler is free to inline the calls to these methods.

        // Inlining is a process where the compiler replaces a method call with the
        // actual code of the method. Since the compiler knows that final methods cannot
        // be overridden, it can directly copy the bytecode of the final method into the
        // calling method during compilation. This eliminates the overhead associated
        // with resolving which method to call at runtime, as the compiler knows that
        // there is only one possible implementation.

        // Therefore, when a final method is called, the Java compiler can efficiently
        // inline the method's bytecode into the calling code, reducing the overhead and
        // improving performance by skipping the runtime method resolution step.
        // ########################

        // Dynamic method resolution happens at runtime after compilation and bytecode
        // generation.
        // When the program is running, the JVM determines which overridden method to
        // execute based on the actual object type.
        // This is known as late binding (or dynamic binding) and is fundamental to
        // achieving polymorphism in Java.
        // However, a final method cannot be overridden. A call to a final method is
        // resolved at compile time.
        // This is known as early binding (or static binding) and ensures that the
        // method implementation is fixed at compile
        // time.

        // The final keyword is also used to prevent inheritance (so sometimes we would
        // want to prevent the class from being inherited for that we can put it is has
        // final)(so whenever a put a class as final implicitely it declares all it
        // methods as final)

        // let,s experiment some-thing in Inheritance package Parent class create a
        // method called greetings as static and call it using an object we will get the
        // output (we know that
        // static methods are not dependent on objects hence to access static stuff or
        // to edit static stuff whatever we want to do even-though we can do it via the
        // reference variable(object reference) the convention is to do via the class
        // name)

        // but the real question is can we over-ride the static methods let's create a
        // same method in another class i.e ChildClass (it is actually not over-ridding
        // it)

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

        // Polymorphism is not applied to instance variables (doubt)

        // 8.
        // ENCAPSULATION
        // Encapsulation means wrapping up the implementation of data members like
        // variables and methods inside a class , it Basically hides the code and all
        // the data in to the single entity or a unit , so that it can be protected from
        // the outside world

        // ABSTRACTION
        // Abstraction means hiding the un-necessary details but only showing the
        // essential/valuable information
        // eg: let's say we have a car we put on the key and start the car(but how that
        // car is being started when we put the key and run it how the internal
        // implementation is done -how the engine starts and the petrol pumps and car
        // get started and the car moves all the internal mechanics --> do we really
        // need to know these things in order to start the car or all you need is a key)
        // All we need is a key ,so all the un-necessary information that is obviously
        // let's say important but, we don't really care about it , do we need to know
        // the mechanics of the car in order to run the car ,No so all the extra
        // information is hidden from us this is known as Abstraction.

        // Difference between Encapsulation and Abstraction
        // Abstraction is like when we print something i.e System.out.println("suraj")
        // we just wanted to print this thing but ,how it's doing it internally we don't
        // care .

        // Similarly ,we are given classes before like let say ArrayList list=new
        // ArrayList(); we are using this ArrayList but how it is defined internally how
        // it is made internally do we really care about it -NO , this is why these are
        // known as Abstract data-types. (Abstract data-type means we are able to
        // access and modify this using some methods like list.get() or list.add or set
        // etc but how these are working internally we don't care about that)

        // but the confusion we may be having is kunal but you said encapsulation means
        // also the same thing ,encapsulation means putting data inside a class and that
        // is the thing you are doing here ,i.e there is a ArrayList class and we are
        // putting the data inside it ,you are correct , ok then we will be like then
        // how is encapsulation different from abstraction let's see

        // so abstraction means hiding the un-necessary details but only showing the
        // essential information i.e start the car ,get the element,print the element
        // ,Ok so this is a design issue, how it's actually being designed ,the
        // designers
        // will tell you hey we need some sort of abstraction like give me this method
        // ,this method,this method,this method and whatever you put inside it that is
        // up to you , how you do it , how you encapsulate it , how you put methods in
        // that, how you put a class in that,how you make it work inside it internally
        // that is up to you all i need is these 4 methods so these are the designer
        // people they will tell you this thing

        // the people who are working on the
        // implementation part the engineers for example they will be like Ok we are
        // working on implementation ,you want this sort of abstraction we will achieve
        // it via making this class ,via making this particular method,via making this
        // get method ,this set method this is what it will contain ,so the actual
        // writing of code of that encapsulated thing that is providing us abstraction
        // that is the main difference.

        // (So, the main difference between abstraction and
        // encapsulation is abstraction is solving a design level issue and
        // encapsulation is solving a implementation level issue ,so it hides the entire
        // code in to a single entity and protect you from the outside world

        // Abstraction on the other hand is telling us OK encapsulation did all this
        // things hiding something internally i am abstraction and i am providing you
        // some of the outside methods that you can use ,design way, but how this things
        // work internally that is handled by encapsulation , so encapsulation is the
        // implementation stuff , Abstraction focuses on the external stuff &
        // Encapsulation focuses on the internal working)

        // How do we achieve abstraction we can achieve it via abstract classes and
        // interfaces (abstract data-types and abstract classes they have like only
        // ,give us add method or remove method or whatever how that things work
        // internally we don't care , that something else like ,In the internal working
        // of encapsulation when that was done in order to make that class that was
        // taken care in encapsulation )

        // i am only focused on abstraction like that what
        // are the things that are visible to me (encapsulation means what are the
        // complex things that i have to work with like put everything inside a class
        // make it public or private or hide the data members or whatever that is
        // encapsulation)

        // Abstraction is the process of gaining information and encapsulation is the
        // process of containing information(In abstraction we are going to use the
        // interfaces and stuff that only define the structure of the program and not
        // how it does it)

        // eg: in the ArrayList example i.e ArrayList list=new ArrayList(); ctrl+click
        // on ArrayList -->elementData--> object[](let's say this our object empty array
        // we are able to manipulate this or whatever we are able to manipulate it via
        // some getters and setters (grow() ,size(),add() etc),but we are not able to
        // directly manipulate it

        // let say we have a variable private double l;we are able
        // initialize it via some constructor , if we want to get it we can create a get
        // method i.e public double getL(){ return l;} , if we call it in the main i.e
        // obj.getL() this will print us the value of l even-though it is private how
        // can we print it in the outside class because we are not directly accessing
        // it, we are accessing it via a method which is used in variable l class only
        // since the method is in that class only it can access the private variables ,
        // so this particular stuff of making things private i.e private double
        // l(variable) known as data hiding)

        // we can hide the data using this getter and setters this is known as
        // encapsulation
        // (abstraction is design level ,external outlook , encapsulation is more on the
        // internal working ,the implementation (it is the process of containing the
        // information,how to make it more secure and stuff).but abstraction on the
        // other hand is process of gaining information
        // so in encapsulation we use getters setters and stuff and in abstraction we
        // use abstarct classes and interfaces

        // difference between data hiding and encapsulation ,data hiding focused on data
        // security and encapsulation focuses on hiding the the complexity of the system

        // eg: we have private double l ; which is only data hiding(we can't access it)
        // using getter and setters we can access which is known as encapsulation(So,
        // basically data hiding the concern is for data security along with hiding the
        // complexity but encapsulation concerns only about wrapping the data to hide
        // the complexity of the system

        // so in data hiding ,always the data we are
        // hiding should be private it should not be accessed directly but in
        // encapsulation data can be public or private or whatever , encapsulation
        // sounds similar to data hiding but encapsulation is sub process in data
        // hiding)

        // so,if we are making an arraylist or linkedList internally there are
        // implemented as normal array we should be able to modify those linkedList via
        // some linkedList.get() etc but we should not be able to directly access that
        // array that array should be private that is known as data hiding but using
        // this methods like getters and setters that is encapsulation

        // so in data hiding
        // always put it as private ,so data hiding can be used to reduce the complexity
        // of the system and things like that and data hiding is achieved via
        // encapsulation and encapsulation is sub process of data hiding

    }
}
