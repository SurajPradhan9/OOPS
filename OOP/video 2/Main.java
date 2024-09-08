public class Main {

    public static void main(String[] args) {

        // 1.
        // let say we have an object i.e
        Main obj = new Main("suraj");
        // if we print the object we get some hash value eg:Main@5b6f7412 ,but we don't
        // want this

        // we want that whenever we print any object of type Main it should
        // actually print out let say a name or number for that we use something known
        // as override (see class members below)

        // because whenever we print something , println internally calls
        // the toString method i.e (on println ctrl click , on valueOf ctrl click we
        // will get something like this - obj.toString();

        // and if a toString() method is
        // not present in the objects class(i.e where the object is created that class
        // in this case Main class) it will
        // take the default toString method
        // which is this -> public String toString() {
        // return getClass().getName() + "@" + Integer.toHexString(hashCode());}

        // that's why it is printing ->Main@5b6f7412 ).
        // In detail explanation on how we can modify the toString() function of our own
        // class we will come when we do override .right now we will be dng that what we
        // are doing and actually how it works internally we will be dng in 3rd video
        System.out.println(obj);

        // 2.
        // what are packages and why we are using packages
        // let say we have a class i.e Main.java if we create another class with
        // the same name it says cannot create class (it did not allow us to create the
        // class).

        // so packages help us in solving this problem we can make the same
        // named class in another package

        // let say we have the class Main.java it prints Hello world if we want to print
        // same Hello world in Another class with same class name we cannot do it ,we
        // can do it by creating a package in that package we can create the same Main
        // class and print Hello world
        System.out.println("Hello world");

        // so packages are stored in Hirarchical manner (folder inside a folder ,folder
        // inside a folder and so on)
        // use case is example we have a class Greeting in package A that prints Hello
        // world we want to print that the same class should print HI suraj we gonna
        // create another package i.e B and create a class Greeting in that and which
        // prints HI suraj (so greeting file in package A has some other use cases and
        // greeting file in package B has some other use cases) and it is also used for
        // naming and visibility control that one file is here and another file is here

        // 3.
        // so, what are packages - Packages are container for classes(like boxes for
        // classes). it's used to keep the class names in compartments so in simple
        // terms package is just a folder

        // if we have com.suraj, in the com folder we have the suraj folder but if we
        // create another folder in com in that case it will not say com.suraj.anything
        // in that case it will spread it out like this i.e Introduction, packages (if
        // inside a folder there is one folder it will append it like this
        // com.suraj ,if we have 2 or more folders it will spread (in intelliJidea))

        // let say we have ,package com.kunal.packages.b;
        // whenever we are writing a file we have to mention the above line(we have to
        // mention in which package that file lies)
        // starting from the src folder what is the path of the folders that the files
        // lies i.e in the com folder there
        // is a kunal folder and there is a packages folder and there is a b folder in
        // that folder the file lies (eg: Greeting) so we have to specify the line i.e
        // package com.kunal.packages.b; to the compiler

        // the convention for this is like com.kunal is basically the companies URL in
        // opposite direction for eg you are working for a company called xyz.com so by
        // convention if you are developing a project for them the package will be
        // something like com.xyz

        // when we create packages for eg and when we run the file, how does java Know
        // in
        // which file to look for packages

        // let say we are creating a class Name Message in a package i.e
        // packages(package name)
        // package packages;
        // public class Message {
        // public static void main(String[] args) {
        //
        // }
        // public static void message(){
        // System.out.println("This course is awesome");
        // }
        // }

        // so when we want the above files method to run in another package i.e
        // packages1 (package name)
        // eg:
        // package pacakges1;
        // import static packages.Message.message;
        // public class Main {
        // public static void main(String[] args) {
        // System.out.println("Hello world");
        // message(); (click alt+enter) (its importing this -->import static
        // packages.Message.message; so that it can run in this package)
        // when we ctrl+click in above i.e(message()) we can go to the source code of
        // this, we can see the message() method which is actually written in the file
        // so we are using the code written in the packages package via packages1

        // so if we run the code we get the o/p has Hello world and This course is
        // awesome

        // How does java no this(how is java running message()method in some
        // other file and some other package) i.e
        // using import statement java Knows.(i.e import static
        // packages.Message.message;)folderNAme className messageMethod

        // importing basically means now we can use message() method in this package
        // how does java Know that(how does the runtime of java determine where to look
        // for these packages that we are creating)

        // its simple by default the java runtime will look for current working
        // directory as it is starting point , so if the package is like the sub
        // directory of the current directory it will be found

        // so when we specify the path i.e import static packages.Message.message;
        // only these items will be available (within the package that are declared as
        // public only they will be available)(i.e when we import( import static
        // packages.Message.message;) all these items that are declared as public we can
        // access, if we declare it as private we cant access it )
        // }
        // }

        // In ArraysList eg: we import the package i.e import java.util.ArrayList;
        // (in a folder known as java and util (subpackage - folder)there is a ArrayList
        // class)

        // 4.
        // static elements example
        // let say we make a package i.e staticExample and make a human class
        // let say in human class we have age name salary and marriedOrNot and make a
        // constructor
        // and in this package create another class called Main so that to use the Human
        // class in Main class(we don't need to import it because it is in the same
        // package/folder) in this class make objects and print the values of those
        // objects
        // Question : what if there is some sort of property which is common to every
        // Human (eg:Population :7 billion same for all Humans which is common to all
        // the objects does not depend on objects) so this property of population is
        // actually not logically realted to objects it is object Independent
        // so such properties that are actually not related to objects are known as
        // static variables / static methods

        // 5.
        // eg: we make a instance variable as long population;(in Human class) and in
        // constructor make this.population+=1 and print in Main class i.e
        // (System.out.println(suraj.population)) or
        // (System.out.println(vaishu.population)) we get the output as 1 and 1 which is
        // false actually 2 human exists it should show 2 and 2 because there are 2
        // humans(suraj and vaishu) that is why such properties that are not related to
        // objects but are common to all the objects of that class like population for
        // example we declare those as static.

        // so, make long population to static long population;
        // another question: if this is static (static long population) and static is
        // not really related to the object the population variable is common to all the
        // human beings then why we are using this.population in constructor(because
        // this represents the object , the object reference, if we are saying
        // suraj.population this keyword will be replaced to suraj so why you are using
        // this keyword) we are correct we should not be using this instead in order to
        // access static variable use the class name i.e in constructor replace
        // this.population to Human.population then if we want to access suraj
        // .population or vaishu.population we will get output as 2 and 2 , even if we
        // put this.population in constructor (if population is static) the output will
        // be 2 and 2

        // so it's working with this keyword as well as Human class because when we do
        // suraj.population+=1 i.e this.population(if we put this it checks does it
        // exists in this object it will be like no it does not, it actually like a
        // static variabe so it exists in the class template so it will be increment
        // that, then when vaishu is been created if we have put this.vaishu over there
        // then it will be like vaishu is created thus population exists over here no it
        // does not it actually exists in the class it's actually common to all the
        // objects so it will also be incremented)

        // so again if another object is been
        // created (i.e virat.population)it will be like thus population exists in virat
        // it will be like no it does not then it will be like ok does population exists
        // in Human class,yes it does its actually a static variable then it will also
        // be incremented.
        // if we keep Human.population it doesnt checks anything if an object is created
        // it directly increments it.(in case if we put this it checks).so whether we
        // put
        // this or Human it works.

        // Note:whenever we are accessing static variable or
        // modifying static variable don't do it via the
        // reference variable i.e via the object name it will work but still don't do it
        // (do it using the convention className.staticVariable(Human.population))

        // 6.
        // so when a member is declared static it can be accessed before any of the
        // object of the class is been created and without referencing to that object
        // like without doing suraj.population or vaishu.population so, suraj is a
        // reference variable (object)of the Human class so without actually using the
        // object of the class we can actually access using Human.population .even if we
        // don't create an object still we can access (static variables are not
        // dependent on objects if no object is been created we can still use it)

        // we can declare methods and variables as static (one of the most common static
        // method is public static void main). so, why public static void main is
        // static?

        // so , why main is declared as static ? static means we can use the main method
        // without creating the object of that class and main is actually the very first
        // thing is run, when we run the java program if main is not there we will not
        // be
        // able to run it

        // so if main is the first thing we have to run then if we don't put it as
        // static obviously in order to run anything that is inside the class we have to
        // create an object of that class

        // we want to access something from the class
        // any instance variable any method we have to create an object of that class

        // but how can we create an object how can we run the program to create an
        // object if main is the very first thing is running

        // hence we should be able to
        // run main without creating any object of that class in which main is . we
        // should be able to run the main function without creating an object of the
        // class(Main) that is why it is static (so before any object or anything is
        // created it should allow us to run main that's why it is static)

        // so the static method , variable they actually belong to the class do not
        // belong to the object(basic definition of static)

        // 7.
        // From chatgpt
        // The main method is declared as static because we need to use it without
        // creating an object of the class.
        // Main is the entry point of a Java program; it is the first thing that runs
        // when we execute the program.
        // If main were not static, we would need to create an object of the class to
        // run it, which is not possible
        // because main is the first thing that runs.
        //
        // Normally, to access any instance variable or method, we need to create an
        // object of the class.
        // But we can't create an object to run the program if the main method itself is
        // what starts the program.
        //
        // By declaring main as static, we allow the Java runtime to call it without
        // creating an instance of the class.
        // This way, we can run the main function without needing to create an object of
        // the class.
        //
        // Therefore, the main method is static so that it can be run without creating
        // any objects.

        // 8.
        // let's say we create a function/method in Main class of staticExample package
        // and call it in main function it will give an error (it is saying that
        // non-static method greeting cannot be referenced from a static context
        // (meaning inside a static method we cannot use anything that is not static) so
        // a static method can only access static data it cannot access non-static data
        // , because a non-static data actually belong to an instance(object) )(so if we
        // put the method as static it won't give us an error)

        // so can we have a static member inside a non-static one ? Yes (put fun()
        // method in greeting()method) that we can do because greeting() method does
        // limit it-self(so greeting() be like i am belonging to an object, but you
        // don't need to belong to an object )

        // so we can't access a non-static member without explicitly mentioning an
        // object reference to it. (an object for greeting() method is needed and needed
        // without it we will not be able to use it how can we do that i.e simply create
        // an object and access it )
        // so in a static context if we want to access non-static stuff create an object
        // or make it static

        // let we create another method which is non-static and put the non-static
        // method greeting() in it, it will work because in the end (it is static or
        // non-static )someone has to call it via some static method (i.e main method)
        // so if we create a non-static method and put the non-static method in it at
        // the end the first non-static method should create an object to access it, so
        // only we don't create an object in the non-static method it will work (hence
        // create an object in the main method and call it)
        // so if you are putting any non-static context in a static context make sure to
        // create an object and if you are putting any non-static context in the
        // non-static context it will call it because in the end (an object for this is
        // to be created for sure)some static context should call it

        // so static methods can be accessed directly from the class name(i.e
        // Main.fun()) or we can use also like this(fun()) and a static method cannot
        // obviously refer to this keyword or the super keyword

        // let say we create a static method in Human class , by now we know that static
        // is not dependent on objects then can we do this thing in the method that we
        // have created (System.out.println(this.age)); - No because we cannot use this
        // keyword inside static method obviously because this keyword represents an
        // object and we are in static and static itself does not dependent on any
        // objects then how can we use something that is dependent on a object (static
        // method ia a part of the class not a part of an object) hence we cannot use
        // anything that is specifically pointing to an object ,so we cannot use
        // this.age or something like that in static method

        // 9.
        // now let's imagine there is one more scenario , let's create another class
        // (i.e staticBlock(staticInitialisation) in staticExample package) which is a
        // demo to show initialisation of static ,so what is the problem statememt ,
        // problem statement is that we have some static variables (static int
        // a=4,static int b(obviously these are not going to depend on objects)) we want
        // to initialize the static variables(do some sort of work to initialize this)
        // we can do this via a static block and that static block will get executed
        // exactly once when the class is first loaded i.e if we create another object
        // it will not go to static block.

        // 10.
        // let's create another class known as inner classes - if we have a class inside
        // a class which is possible Note that:Outside classes the main class(the class
        // that is not inside any other class) cannot be static

        // the inner class can be static .the outside class cannot be static because it
        // is not itself dependent on any other class but the inner class is dependent
        // on outside class hence inner classes can be static .

        // eg : what it is actually mean by static let's create a main method inside the
        // outer class ,in the inner class create a variable and make a constructor , in
        // main method make objects with Inner class name it will show an error ,
        // because the main method is static and inner class is non-static and the Inner
        // class itself is dependent on outer class (the main method be like hey you are
        // yourself dependent on outer class who is your object the inner class be like
        // ya i don't have an object). it will work fine if you keep the inner class
        // outside the outer class (the main method be like you are the class template
        // we can use your object because theclass is does not depend upon any other
        // class but when you put it inside now you depend upon outer class)

        // so every instance(object) of instance classes(outer class) will have some
        // class
        // Test(inner class)
        // with it has well that's why it is saying we cant use ur object but if we put
        // inner class has static it will work

        // let say if we keep the inner class outside the outer class (making non
        // static class)and make the variable static(i.e instance varibale i.e name) now
        // if we print obj1.name and obj2.name it will print has what we kept in obj.2
        // name i.e virat and virat only i.e--> what it is going
        // to give for obj1.name first it will set the obj1.name to suraj means the
        // static variable name was set to suraj then in next line it set obj2.name
        // means actually Test.name to virat hence the same static
        // variable was changed to virat it was replaced by from suraj to virat hence
        // both of those will show virat)

        // what if we put the inner class inside the outer class without making the
        // variable static (we will make the class static means actually the inner class
        // is not dependent on the objects of outside class (to run the inner class /to
        // use the inner class an object of outside class is not needed to be created
        // hence we will able to use the objects of inner class directly ))

        // please don't
        // confuse in this that when you put inner class in outer class we use static in
        // inner class and when we put inner class outside the outer class we do not use
        // static because when we put the inner class inside without putting static it
        // gives us error because it is actually dependent on outer class but when we
        // don't put static outside it doesnt gives error because it is not dependent on
        // any outer class

        // so we are not using static over outer class (the main method
        // be like hey Inner class do you need anything to run, the inner class be like
        // ya actually i need a instance of outer class to run then main says i actually
        // do not have it, the inner class be like should i create my self then it will
        // give an error, so if we put static in inner class now we can say the inner
        // class is dependent in outer class itself but not it's objects hence we can
        // use it in main method which is static)

        // so , the output will be suraj and
        // virat (but we will have doubts that the inner class is static then how will
        // they have their individual identities , we know that static does not depend
        // upon objects but how the 2 objects are different we know that static means
        // does not depend on objects then how is it that the 2 objects that we created
        // for inner class are dependent having unique identities because this is wt
        // static actually mean-

        // whenever we are talking about the static context (the
        // inner class) we are talking where it is mentioned as static ,so the inner
        // class is mentioned as static inside the outer class hence it is not dependent
        // upon the objects of outer class but the main method and inner class can have
        // the instances of each other , so only nested classes can be static)

        // lets try keep the inner class variables as static which is inside the outer
        // class the output will be virat and virat

        // one more thing about static variables are since they do not dependent on
        // objects and objects are created during run time and static methods and
        // variables do not have anything to do with objects hence static stuff are
        // resolved during compile time

        // 11.
        // Internal working of some stuff
        // System.out.println(); println is a method , out is a variable , System is a
        // class .

        // So, these is something that the java people have provided us they are
        // be like if you want to work with system i.e system input system output or
        // file reading or use the keyboard we have written code for that already.

        // out basically means(public static final PrintStream out=null) static means an
        // object of the printStream class does not need to be created in order to use
        // it,
        // public means it can be used from anywhere, null by default basically means
        // the standard output stream(so out is a reference variable of the class of
        // type printStream),

        // System.out.println() (so dot binds the instance variables
        // and instance methods with reference variable so out is of type printStream so
        // printStream may be having a println method and it is just calling
        // that(println methods takes the string and print that) and println method does
        // the 2 things it obviously always calculate the valueOf it which interns call
        // the toString method (let Arrays.toString() Array is a class and it contains
        // the toString() method )

        // one more cool thing is :// let say we have an object i.e
        Main obj1 = new Main("Vaishu");
        System.out.println(obj1);
        // In previous we have written this-->if we print the object we get some hash
        // value eg:Main@5b6f7412 ,but we don't want this , we want that whenever we
        // print any object of type Main it should actually print out let say a name or
        // number for that we use something known as override because whenever we print
        // something , println internally calls the toString method i.e (on println ctrl
        // click , on valueOf ctrl click we will get something like this -
        // obj.toString(); and if a toString() method is not present in the objects
        // class it will take the default toString method which is this -> return
        // getClass().getName() + "@" + Integer.toHexString(hashCode()); that's why it
        // is printing ->Main@5b6f7412 ). In detail explanation on how we can modify the
        // toString() function of our own class we will come when we do override .right
        // now we will be dng that what we are doing and actually how it works
        // internally we will be dng in 3rd video

        // whenever we are trying to print any object of Main it's gives us some random
        // value because that is how it does it automatically Internally , when we pass
        // an object java is going to call valueOf and that is going to call toString()
        // method . So, Internally it is calling obj.toString(), does the object
        // contains toString() method , it gonne be like obj doesn't contain toString()
        // method , hence if the class which a belongs to it does not contains
        // toString() method hence it is going to use it's own toString() by-default
        // (i.e return getClass().getName() + "@" + Integer.toHexString(hashCode()))
        // .but what if we had a toString() method in the class of obj i.e create your
        // toString() method in the object's class that is Main
        // @Override // it is nothing but annotation
        // public String toString(){
        // return name;
        // }
        // so , if we make our own toString() method in the acquired class it gonna give
        // us some value which we want to give

        // 12. (refer video)
        // singleton class

        // sometimes it may be possible we have a class and we want to create only one
        // instance (object) of that class

        // So, Singleton class is a class which provides only one object of it .so, how
        // can we create it.

        // So , if we want to create only one object we should not allow anyone to call
        // the constructor of that class (logical sense because when we call constructor
        // new object is been created) and we want to stop people from creating new
        // object hence we should not allow them to use the constructor

        // let's create another package name singletonClass and class Singleton and make
        // a constructor(I don't want people to use it so , make the constructor as
        // private) private basically means it will only be used in that file only(that
        // class only)

        // so we need only one instance , so create a instance which is private (i.e
        // private Singleton instance;) , so only one instance can be created , so what
        // we want is let's create a function that will give us a instance.

        // In the main method we wanna access that single object so create (i.e
        // Singleton obj=Singleton.getInstance())(whenever we want to access such
        // methods or variables via the class name we should put those as static , so
        // make the function as static)

        // since this instance (private Singleton instance;) is not going to be
        // dependent on the object of the class (we will not going to create an object
        // of that class ryt its not allowed we will only return this object i.e
        // instance that is created somewhere internally in the class )so make that as
        // static

        // so, whenever anyone will say hey give me a instance i.e i am creating so many
        // reference varibales (i.e Singleton obj2=Singleton.getInstance()) they will
        // get only the same instance because only one object is created in the memory
        // (i.e we will always give the reference varibale as one object only i.e
        // intance varibale that we have created)

        // so whenever someone calls the instance first check whether 1 object only is
        // created or not

    }

    String name;

    Main(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}