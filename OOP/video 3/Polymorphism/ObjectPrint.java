// package Polymorphism;

// public class ObjectPrint {
//     int num;

//     public ObjectPrint(int num) {
//         this.num = num;
//     }

//     public static void main(String[] args) {
//         ObjectPrint obj = new ObjectPrint(9);
//         System.out.println(obj);
//     }
// }

// In above case i havent told java that whenever you print the object i just want you to print let say the number which is present in class, so java will print some random value internally bydefault  on its own i.e bydefault toString method(ctrl+click on println , then click String.valueOf(x), then click obj.toString(), we will see the toString method that is returning this- return getClass().getName() + "@" + Integer.toHexString(hashCode()))

// (we know every class bydefault is inherited from the object class . first it checks if
// there is a toString method in ObjectPrint class if not it will call the bydefault
// toString method which is present in Object class) i.e
// public class ObjectPrint extends Object {
// }

//But what if we provide the toString method , then at runtime it will determine the provided toString method should run (so the provided toString method extending the default one so we get the output as num)

//if we ctrl click on println it doesnt show our toString method because it is determining at run time

package Polymorphism;

public class ObjectPrint {
    int num;

    public ObjectPrint(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "objectPrint{" + "num=" + num + "}";
    }

    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(9);
        System.out.println(obj);
    }
}
