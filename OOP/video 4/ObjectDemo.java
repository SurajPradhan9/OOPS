public class ObjectDemo {
    // Methods in object class are (java.lang.Object;)

    int num;
    float gpa;

    ObjectDemo(int num) {
        this.num = num;
    }

    ObjectDemo(int num, float gpa) {
        this.num = num;
        this.gpa = gpa;
    }

    // we will go in details of how to create it in hashmap lecture
    // but what it is? it bascially gives a number representation of an object
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
        // return this.num==((objectDemo)obj).num;//getting error but in video it is not
        // getting (Doubt)
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public static void main(String[] args) {

        // 1.hashCode()
        ObjectDemo obj = new ObjectDemo(9);
        System.out.println(obj.hashCode());// gives some random value
        // Hashcode basically means a unqiue representation of an object via a number

        // if we create another object with same value we will get different hashcode
        // value
        // ObjectDemo obj2 = new ObjectDemo(9);
        // System.out.println(obj2.hashCode());

        // if we change the hashcode method i.e instead of returning return
        // super.hashCode(); to return num; it gives the 9 and 9 for obj.hashCode() and
        // obj2.hashCode()

        // one misconception people had is hashcode is the address but no it is not
        // address, it is actually a random integer value formed via using some
        // algorithm(In future videos we will create our own hashcode function)

        // so hashcode gives us the random number so that we can identify whether the
        // object is the same object or the different object
        // if we do something like this
        ObjectDemo obj2 = obj;
        System.out.println(obj2.hashCode());// it gives the same output as obj.hashCode()
        // so if the hashcode is same we can say it is the same object

        // 2.//not getting output some error(doubt)
        // == checks the addresses are equal or not i.e it checks both objects are
        // pointing
        // to the same thing or not
        // .equals checks the content
        // lets create 2 objects
        // ObjectDemo a=new ObjectDemo(9,2.0f);
        // ObjectDemo b=new ObjectDemo(9,5.0f);

        // if(a==b){
        // System.out.println("a is equal to b(addresses)");
        // }

        // if(a.equals(b)){
        // System.out.println("a value is equal to b value that is num:9");
        // }
        // not getting output some error(doubt)

        // 3.
        // instance of method
        // if we have a class parentClass
        // and child class extends parent class
        // if we create an object of child class i.e ChildClass obj=new ChildClass()
        // and if we print System.out.println(obj instanceof parentclass)
        // we will get output as true because childClass is inheriting parentclass
        // and if we print System.out.println(obj instanceof ChildClass)//true because
        // it is the object of childClass
        // and if we print System.out.println(obj instanceof Object)//true beacuse every
        // class inherits object class

        // 4.
        System.out.println(obj.getClass().getName());
        // getClass is final so we cannot override it
        // when we get the getClass() information it is actually stored in the heap

    }
}
