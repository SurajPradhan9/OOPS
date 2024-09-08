import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // 1.
        // your teacher gives a problem statement that to store 5 numbers
        int[] numbers = new int[5];

        // similarly store 5 names
        String[] names = new String[5];

        // now your teacher says please store the data of 5 students : {roll no ,name,
        // marks }
        int[] rollNo = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        // now your teacher says that you have just created different - different
        // data-types for every single property

        // but teacher says i want some sort of data structure that contains all the 3
        // properties i.e rollNo name marks
        // eg - String[] names= new String[5]; in this every single element is a
        // string(name).we want every single element to be rollNo name marks
        // this is where classes & object oriented programming comes in

        // 2.
        // class - A class is a named group of properties (eg: rollNo name marks ) and
        // functions.

        // from above, the 3 properties rollno name and marks if we want to combine them
        // in a single entity we can do it via classes

        // class starts always with a capital letter

        // so your teacher says i dont need this 3 thinges i.e int[] rollNo=new int[5];
        // String[] name= new String[5];float []marks=new float[5]; i need you
        // to give me something like this ,like some other datatype (eg student -your
        // own
        // datatype) that stores all the properties

        Student[] students = new Student[5];
        // every element in above array should contain all the 3 properties i.e {roll no
        // ,name, marks }

        // so one more definition is if you want create your own datatype we can do it
        // via classes

        // let's say we want to create 1 student first
        Student suraj;// the variable suraj is of type Student (our own datatype that we have created
                      // using class) and it consists of 3 properties {roll no ,name, marks }

        // 3.
        // class is a template of an object and object is an instance of a class
        // .example
        // class car ,object bmw toyata ferrari etc and class car contains properties
        // like engine price etc which we can use in objects. (bmw ,toyata have
        // all the same properties but their values are different)

        // class - logical construct (it does not exists physically )and object -
        // physical reality (physically present) (this is thing that is actually
        // occupying space in the memory)
        // so, class is a template of an object and object is a instance of class ,
        // class creates a datatype that you can use to create objects and when you
        // declare an object of a class you are creating an instance of that class

        // objects have 3 essential properties i.e 1. state of the object (its value
        // from its datatype or attribute eg- color,modelNo) 2. identity of the object
        // (one object is different from other ,unique name of object eg-BMW ,
        // Toyata)and 3. behaviour of the object(Methods like accelerate , brake )
        // objects are stored in the heap memory and reference variables are stored in
        // stack memory

        // using dot operator we can access the properties of a class {roll no ,name,
        // marks }(.dot operator is also called as separator (formally called in java))
        // variables inside the object /class and outside the methods are known as
        // instance variables eg class Student , object suraj ,instance variables are
        // rollNo name marks
        // reference variables - the variables which define an object eg String name;
        // int marks ; name and marks are reference variables
        // dot operator is linking the reference variable with the instance variable i.e
        // suraj.rollNo

        // Student suraj;// means declaring reference to an object of type student (this
        // is actually not creating an object )
        // at this point (i.e Student suraj ) suraj is does not yet like referred to an
        // actual object (it is just in the stack memory)

        // when the student class objects (i.e students --Student [] students=new
        // Student[5];) is not initialized by default the value is null i.e
        System.out.println(Arrays.toString(students));// [null, null, null, null, null]
        // for primitives it may be different but for objects it is null

        // System.out.println(students);//[LStudent;@2f92e0f4 (some address)so
        // converting in to string (will see this line later)

        // 4.
        // how to create an object
        // className objectName=new className();
        // the new keyword dynamically allots (allocates the memory at run time) and
        // returns a reference to it (i.e object reference(memory addreess of object
        // which is in the heap)) which is gonna be stored in
        // objectNAme
        // (i.e the reference is stored in suraj variable -- Student suraj=new
        // Student();)

        // objects are stored in heap memory and reference variables are stored in stack
        // memory , reference variables will point to objects present in heap memory.

        // All class objects in java must be allocated dynamically

        // Student student1=new Student();
        // all the things that are left hand side of equal to happens at compile time
        // and right hand side happens at run time

        // compiling means program is checking whether they are any errors

        // run time means (when the checks are finished or happened and when the code
        // has converted ) runtime the name suggests that the program is running ,that
        // is where the memory is allocated that is known as dynamic memory
        // allocation(i.e memory in the ram or whatever will be allocated when the
        // program is running)

        // so now we can use the student1 making it like as if was the object but it is
        // not the object it is the reference variable pointing to that
        // object(internally it is holding like memory address of the original object
        // that is in the heap) and we cant access the memory address because in java it
        // is not allowed(this is the key for java safety that we cannot manipulate
        // references ,but in c++ we can manipulate address with pointers and stuff)

        // when we create an object of a class which means it is instantiated

        // 5.
        // Manipulating objects
        suraj = new Student();
        // // by default value of suraj is
        // System.out.println(suraj); // it is giving some random value(address) (we
        // will see later)

        // // what if we try to print without initialization it gives 0 for integer and
        // // null for string and 0.0 for float (by default values of objects)
        // System.out.println("Without Initializzation");
        // System.out.println(suraj.rollNo);
        // System.out.println(suraj.name);
        // System.out.println(suraj.marks);

        // System.out.println("After Initialization");
        // suraj.rollNo = 9;
        // suraj.name = "Suraj Pradhan";
        // suraj.marks = 100.0f;
        // System.out.println(suraj.rollNo);
        // System.out.println(suraj.name);
        // System.out.println(suraj.marks);

        // let's say if we haven't initialized the above and initialized the properties
        // in
        // class , it will print that what we have initialized in class.

        // first it checks what we have initialized in main method if we won't
        // initialize, it checks inside class if no initialization is done it prints the
        // default value which is 0 for integer , null for string , 0.0 for float

        // if we access the properties which is not in class i.e suraj.salary it gives
        // an error (but you can do this thing in python) but not in java because it is
        // a static type language

        // 6.
        // how we can allocate / assign the values while creating an object it self
        // because it is very repetitive. i.e suraj.rollNo=9 suraj.name="suraj"
        // suraj.marks=100.0f let say Student class has 100 properties do we write this
        // 100 times?
        // if we would have one more object we would do the same like vaishu.rollNo=9
        // vaishu.name="suraj" vaishu.marks=100.0f which would be repetitive
        // we are allocating the values i.e suraj.rollNo=9 suraj.name="suraj"
        // suraj.marks=100.0f which is repetitive to solve this we have constructors

        // Student suraj=new Student() --> Student() is an constructor it is like an
        // function type thing because we are calling it so it's a special function

        // constructors basically defines what happens when the object is created
        // so what do we need to do when the objects has been created we actually need
        // to allocate these things i.e suraj.rollNo=9 suraj.name="suraj"
        // suraj.marks=100.0f

        // so how we are going to use an constructor , basically instantiate (when you
        // create an object it is called as instantitated)

        // so instead of having the default values for objects we already know how to
        // set values i.e suraj.rollNo=9 suraj.name="suraj" suraj.marks=100.0f

        // let say we might want to do something like this -- do it once (at once), make
        // it mandatory to do so that ur not only setting name and rollNo and forgetting
        // marks whenever ur creating an new object? No, put all the 3 items

        // we want to do something like this when we are creating an object during that
        // time initialize / add the values of all the variables that a class
        // has(instance variables) i.e Student suraj=new Student(90,"Suraj Bhai",99.0f);
        // now when we do suraj.rollNo it gives 90 ,suraj.name it gives suraj Bhai
        // ,suraj.marks it gives 99.0 so this is we want to do

        // so how these things works internally, so we are calling it i.e
        // Student(90,"Suraj Bhai",99.0f); so it is a special type of function in the
        // class

        // in previous i.e Student suraj=new Student(); we did not create any function
        // inside the class like this Student() which is known as by default constructor

        // a constructor is special type of function that runs when we create an object
        // and it allocates some variables as we like it (because it is function it
        // will have some arguments)

        // so in this Student suraj=new Student(); by default we don't have any
        // arguments which is known as by default constructor ,you don't have to make it
        // or anything by default if you don't have a constructor java will call its own
        // constructor that is just gng to assign everything empty i.e it will print 0,
        // null, 0.0 etc

        // 7.
        // what if we want to make it on our own let say while calling the function we
        // want to give 3 arguments rollNo name and marks and we want to bind the
        // arguments with the object

        // so what do we want to do nothing new we were dng (suraj.rollNo=9
        // suraj.name="suraj" suraj.marks=100.0f) outside everything so do this inside a
        // constructor
        // instead of dng this (suraj.rollNo=9 suraj.name="suraj" suraj.marks=100.0f) in
        // main method do it inside a constructor in class i.e

        // class Student{
        // int rollNo;
        // String name;
        // float marks;

        // Student(){ // we dont have to add a return type or name because the return
        // type is the class itself because it is gng to create a type of the object of
        // this class hence it is like a return type but name is not required , so it
        // will actually run when we create a new object
        // suraj.rollNo=9;
        // suraj.name="suraj";
        // suraj.marks=100.0f;

        // we want to do the above 3 lines but this will give an error we want to set
        // suraj.rollNo=9; but what is suraj we don't know because the class is an
        // template in the template in the rule section how can we mention suraj

        // now we are like we are referencing the reference variable of the object this
        // is the reference variable that we have created (i.e suraj-- Student suraj=new
        // Student() )we want to add this reference variables(suraj) rollNO to be 9

        // but we are adding suraj over here what if we wanna make another object vaishu
        // (reference variable) would we make another constructor here , another problem
        // will be how would it differentiate which one to call , so what we need to do
        // is we need some sort of the way to initialized the properties(i.e rollNo name
        // and marks)

        // we need a way to add the values of above properties object by object (for
        // every object it will be different) , for that
        // we need one word to access every object (i.e Student suraj=new Student() - we
        // need it to automaticaly replace suraj.rollNo (suraj)this particular space
        // with suraj , when we are saying Student vaishu =new Student() we want to
        // automatically put vaishu over that space)what is the keyword for that to
        // access the reference variable like that(the object) we can do it via this
        // keyword

        // this.rollNo=9;
        // this.name="suraj";
        // this.marks=100.0f;

        // whenever new object is been created it goes inside the constructor now this
        // keyword is replaced with the reference variable i.e // this.rollNo=9; is
        // replaced with suraj.rollNo=9;
        // this.name="suraj"; is replaced with suraj.name="suraj";
        // this.marks=100.0f; is replaced with suraj.marks=100.0f

        // we can also add functions inside the class i.e
        // void greeting(){
        // System.out.println("Hello! my name is: "+name) or System.out.println("Hello!
        // my name is: "+this.name) (it is also giving the same answer with or without
        // this then y to use it because whenever you try to access any particular item
        // of the class via its object obviously every single item will be specific to
        // that object.

        // greeting function will be different for every one ,name rollNo
        // and marks will be different for everyone in order to do that we use the this
        // keyword , whenever we say suraj.greeting() (this.name)the particular space is
        // replaced by suraj )
        // }

        // let's say we create a another function
        // void changeName(String newName){
        // this.name=newName; //here the parameter that is passed i.e newName and the
        // instance varibale i.e name are of different names, so we can assign without
        // this keyword, if
        // they will be same the output will be different in those cases we use this
        // keyword
        // }

        // why we will use this keyword in above function
        // let say we have one more type of constructor
        // Student(int rollNo,String name,float marks){
        // this.rollNo=rollNo;
        // this.name=name;
        // this.marks=marks;
        // }
        // for same parameter names we have to use this keyword because if we won't keep
        // this which parameter we will get assigned we don't Know we will get values
        // like (for name null rollNo 0 and marks 0.0 , the parameter values will be
        // assigned as instannce variables ) so we have to use this keyword to assign
        // the instance variables as parameter variables
        // }

        // suraj.changeName("pradhan");
        suraj.greeting();

        // Parameterized Constructor
        Student vaishu = new Student(18, "Vaishnavi", 100.0f);
        System.out.println(vaishu.rollNo);
        System.out.println(vaishu.name);
        System.out.println(vaishu.marks);

        // In oop when you call an object with no parameters it will call the
        // constructor which has no parameters. similarly, if you call an object which
        // has 3 parameters it will call the constructor which has 3 parameters this is
        // known as constructor overloading

        // let say we have a constructor with 3 parameters in the class and we dont have
        // an empty parameter constructor ,and if we
        // create
        // an object with no values passing in it i.e Student bhai=new Student();it
        // will give an error like
        // required: int,String,float
        // found: no arguments
        // reason: actual and formal argument lists differ in length

        // let say we want to create another constructor which takes values from another
        // object
        // Student(Student other){
        // this.name=other.name;
        // this.rollNo=other.rollNo;
        // this.marks=other.marks;
        // }
        // i.e
        Student random = new Student(suraj);
        // Here other will be replaced with suraj and this keyword will be replaced with
        // random
        System.out.println(random.name);

        // 8.
        // one more thing this keyword will be helping is we can call a constructor from
        // another constructor as well
        // i.e
        // Student(){
        // this is how you call a constructor from another constructor using this
        // keyword
        // Internally :new Student(13,"bhai",99.0f)
        // this(13,"bhai",99.0f); // it calls a constructor which is having 3 parameters
        // // internally this is replaced with Student
        // }
        // Student random2=new Student();
        // System.out.println(random2.name);

        // 9.
        // why we don't use new keyword for creating primitive data-types because in
        // java the primitive data-types are not implemented as objects
        // we know objects are stored in heap memory but primitive data-types are not
        // objects hence they are stored in stack memory only
        // but we may say that int a=10; a is pointing to stack memory and 10 is
        // pointing to heap memory in intro to programming lecture ?which is correct why
        // because we specifically mention 10 to be an object and that intro to
        // programming lecture is not specific to java, but in java normally both(a and
        // 10)
        // are stored in stack memory only
        // why we don't use new keyword in implementing primitive data-types because
        // they are implemented as normal variables we don't implement that ,those are
        // objects because to increase efficiency and make it more fast because putting
        // in to the heap memory having objects and stuff it will be much more slower
        // (in python
        // we don't have primitive all are consider as objects only so python is slow
        // language)

        // 10.
        // memory allocation of new keyword
        // let we write something like this Student one =new Student();
        // Student two=one;
        // Both one and two pointing to the same object
        // the assignment of two to the variable one it did not like allocate any memory
        // or copy any part of the original object it is just simply saying point two to
        // the same object where one is pointing
        // so any changes made via one also changes two so when we assign one object
        // reference variable to another object reference variable we are not creating a
        // copy of the original reference variable object we are pointing to the same
        // object so if we change any one the another one also changes
        Student one = new Student();
        Student two = one;
        one.name = "Something Something";
        System.out.println(two.name); // so if we change one the value of two also changes

        // 11.
        // we can also create the primitive data-types via new Keyword i.e through
        // wrapper classes
        // int a=10;
        // we can also do

        // Integer num=10 ; // or Integer num=new Integer(10);
        // the difference is now it is-been created like an object
        // using primitive we cant access more stuff but using object we can access more
        // stuff (i.e-->do .a(we doesnt get more stuff) or .num(we can see more stuff)
        // for clarity)

        // so class contains properties and functions(Integer is a class) so num is an
        // object which has so many properties and functions inbuilt

        // 12.
        // Java has pass by value for Primitives i.e .let say we have created a method
        // static void swap(int a,int b){
        // int temp=a;
        // int a=b;
        // int b=temp;
        // }
        int a = 10, b = 20;
        Student obj = new Student();
        obj.swap(a, b);
        System.out.println(a + " " + b);
        // the output will be a=10 and b=20 only because the parameters in method and
        // the
        // parameters in main are not same because java supports pass by value.(in main
        // method a=10 the value 10 is passed not the reference of (a))

        // 13.
        // Primitives:
        // For primitive data types (e.g., int, float, boolean), the actual value is
        // passed. A copy of the value is made, and any changes to the parameter inside
        // the method do not affect the original value.

        // Objects:
        // For objects, the value that is passed is the reference to the object, not the
        // actual object itself. This is sometimes referred to as "pass by reference
        // value" because the value being passed is a reference (i.e., the memory
        // address) to the object.

        // java has pass by value for objects also but the reference value is passed
        // (the references value is passed)(pass by reference value)(refer chatGPT
        // Question-java uses call by value and call by reference for primitives and
        // objects justify)
        Integer num1 = 50;
        Integer num2 = 100;
        swap(num1, num2);
        System.out.println(num1 + " " + num2);
        // the values also will not change because Integer class is Final Class.(means
        // fix) (for other classes it will change but Integer class is Final , so it
        // will
        // not change)other classes like our own class eg:below MyObject class

        // public class Example {
        // public static void main(String[] args) {
        // MyObject obj = new MyObject();
        // obj.value = 5;
        // modifyObject(obj);
        // System.out.println("obj.value after method call: " + obj.value); // Output
        // will be 10
        // }
        // public static void modifyObject(MyObject obj) {
        // obj.value = 10;
        // }
        // }
        // class MyObject {
        // int value;
        // }

        // In this example, obj.value changes to 10 because obj in modifyObject is a
        // copy of the reference to the original MyObject. This means both the original
        // reference and the copied reference point to the same object in memory.

        // 14.
        // Final is a keyword that we can prevent our content to be modified (constant)
        // If there is a final keyword we have to make sure that its variable are of
        // capital letters (not mandatory) because , we use naming convention for
        // constants that it should be CAPITAL letters for better readability and
        // distinguish constants from regular variables
        final int INCREASE = 2;
        // INCREASE=5; // we cannot change the value because it is final , the INCREASE
        // variable cannot be-modify

        // 15.
        // Final field in classes
        // final int num; //it gives an error because it is not initialized (in classes
        // only it will show error in main it will not show any error)
        // we have to always initialized final variables while declaring it becuase we
        // cannot modify it.

        // However, the 'final' keyword guarantees that a variable is immutable (cannot
        // change)
        // only when the instance variables are of primitive data types. This is not
        // true for
        // reference types like objects.

        // When an instance variable of a reference type has the 'final' modifier, the
        // reference
        // to the object will never change; it will always refer to the same object.
        // However,
        // the contents or state of the object that the reference points to can still be
        // modified.

        // we cannot change for primitive but for non primitives we can i.e
        // final Student suraj=new Student();
        // suraj.name="virat"; // we can change the value but we cannot resign it
        // but we cannot do suraj=otherobject (because it is final)

        // eg:
        // final Main suraj2 = new Main("Suraj Pradhan");
        // // we can change
        // suraj2.name = "Bhaii";
        // System.out.println(suraj2.name);

        // when a non primitive is final we cannot re-assign it (it point to the same
        // object with that object do whatever you want but you cant resign it)
        // suraj2=new Main("bhaii"); // it will give an error

        // 16.
        // ##############################From
        // chatgpt##############################################

        // In Java, the final keyword ensures that a variable's value cannot be
        // reassigned once it has been initialized. The behavior differs between
        // primitive data types and reference types (objects). Here's an explanation of
        // why final works differently for objects:

        // Primitive Data Types
        // When you declare a primitive variable as final, you are making the value of
        // that variable immutable. For example:

        // java
        // Copy code
        // final int x = 10;
        // x = 20; // Compilation error
        // In this case, x cannot be reassigned to a different value after its initial
        // assignment.

        // Reference Types (Objects)
        // When you declare a reference variable as final, you are making the reference
        // itself immutable, not the object it points to. This means that you cannot
        // reassign the reference to point to a different object, but you can still
        // modify the internal state of the object the reference points to. For example:

        // java
        // Copy code
        // class MyClass {
        // int value;

        // MyClass(int value) {
        // this.value = value;
        // }
        // }

        // public class Main {
        // public static void main(String[] args) {
        // final MyClass obj = new MyClass(10);
        // obj.value = 20; // This is allowed, the object's state can change
        // obj = new MyClass(30); // Compilation error, cannot reassign final reference
        // }
        // }
        // In this example, the obj reference is declared as final, so it cannot be
        // reassigned to point to a different MyClass instance. However, you can still
        // modify the value field of the MyClass object that obj refers to.

        // Summary
        // Primitive data types: final makes the variable's value immutable.
        // Reference types (objects): final makes the reference immutable, but not the
        // object's state.
        // The final keyword ensures that a reference variable cannot be reassigned to
        // point to a different object, but it does not protect the contents or state of
        // the object itself from being changed.

        // 17.
        // Garbage Collection
        // let say we have stack and heap in stack we have variables and in heap we have
        // objects

        // let say variable a is pointing to some object now say a is pointing to some
        // other object ,the variable a which is pointed first(some object) is removed
        // by the garbage collector because no variable is pointing to that object(It
        // happens in java Automatically we have automatic garbage collection)

        // sometimes when the object is destroyed with garbage collection you need to
        // perform some sort of action (to handle such situations java provides
        // something known as finalize)

        // In C++ we have destructors there we free the
        // memory manually or remove the objects manually , In java it does it
        // Automatically .

        // but Java give you a way by performing some actions when the
        // object is been destroyed (whenever some object is destroyed we want to
        // display some sort of message

        // we can't do it manually but what we can do
        // manually is we can specify what to do when the object is been destroyed
        // manually

        // but we cannot destroy the object manually , we will tell java hey
        // we know that you will not allow us to destroy the object manually,so can you
        // please do these things whenever you decide to destroy the object, java will
        // be like OK

        // you can specify these specific actions that will occur when the
        // object is obout to be taken away by the garbage collector , we can do using
        // finalize method

        // similarly we have
        // constructor but this is some sort of destructor but it will be called
        // automatically when java is doing garbage collection , so right before the
        // object is freed from the memory java is going to call the garbage collector
        // and finalize method

        // eg: lets say we have finalize method in this class whenever some or any
        // object of this class is freed from the memory the finalize method will be
        // called
        // @Override
        // protected void finalize() throws Throwable {
        // System.out.println("object is destroyed");
        // }

        // i.e
        // Main obj;
        // for(int i=0;i<10000000;i++){
        // obj=new Main("Random name"); // we know no more than one object can point to
        // the same reference variable here so many objects are been created but only
        // object can point to the same reference variable . the unused objects (where
        // no reference variable is pointing them)will be removed by the garbage
        // collector
        // }

        // so we cannot free the memory by ourselves but we can tell it what to do when
        // the memory is freed

    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    // final int num; //it gives an error beacuse it is not initialized , final
    // variables need to be initialized because we cant modify it, so we have to
    // always initialize the final variable when it is declared
    String name;

    public Main(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("object is destroyed");
    }

}

// creating a class
class Student {
    // every single student has rollNo name and marks
    int rollNo;
    String name;
    float marks;

    // we need a way to add the values of above properties object by object
    // we need one word to access every object we can do it via this keyword
    Student() {
        this.rollNo = 9;
        this.name = "suraj";
        this.marks = 100.0f;
    }

    void greeting() {
        System.out.println("Hello my name is:" + this.name);// (or) System.out.println("Hello my name is:" + name);
    }

    void changeName(String newName) {
        this.name = newName;// (or)name=newName
    }

    // Student virat=new Student(18,"kohli",1000.0f);
    // here , this is replaced with virat
    Student(int rollNo, String name, float marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    Student(Student other) {
        this.name = other.name;
        this.rollNo = other.rollNo;
        this.marks = other.marks;
    }

    // Student(){
    // // this is how you call a constructor from another constructor using this
    // keyword
    // //Internally :new Student(13,"raju",99.0f)
    // this(13,"raju",99.0f); // internally this is replaced with Student
    // }

    public void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}